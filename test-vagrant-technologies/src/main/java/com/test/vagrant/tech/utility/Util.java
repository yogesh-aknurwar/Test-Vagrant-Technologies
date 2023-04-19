/**
 * @author Yogesh Aknurwar
 * @date 19-04-2022
 * 
 */
package com.test.vagrant.tech.utility;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util {

	private static Logger logger = LoggerFactory.getLogger(Util.class);

	public JSONObject readJSONFile(String jsonFileName) {

		String jsonFileContent = "";
		String fileName = jsonFileName;

		try (InputStream inputStream = ClassLoader.getSystemResourceAsStream(fileName);
				InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(streamReader)) {
			String line;

			while ((line = reader.readLine()) != null) {
				jsonFileContent = jsonFileContent + line.trim();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		JSONParser expectedOutputParser = new JSONParser();
		JSONObject expectedOutputJsonResponse = new JSONObject();

		try {

			expectedOutputJsonResponse = (JSONObject) expectedOutputParser.parse(jsonFileContent);
		} catch (Exception ParseException) {
			logger.error("Parsing has failed." + ParseException.getMessage());
		}

		return expectedOutputJsonResponse;

	}

}
