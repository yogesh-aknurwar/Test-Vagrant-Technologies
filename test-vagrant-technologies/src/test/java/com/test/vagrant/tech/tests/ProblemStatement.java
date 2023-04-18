package com.test.vagrant.tech.tests;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.test.vagrant.tech.constants.GlobalConstants;
import com.test.vagrant.tech.pages.RoyalChallengersBangloreTeam;
import com.test.vagrant.tech.utility.Util;

public class ProblemStatement extends Util {

	private static Logger logger = LoggerFactory.getLogger(ProblemStatement.class);
	GlobalConstants constant;
	@Test
	public void verifyForeignPlayersTeamSize() throws Exception {

		JSONObject jsonObject = super.readJSONFile(GlobalConstants.DATA);

		RoyalChallengersBangloreTeam teamDetails = RoyalChallengersBangloreTeam.fromJSON(jsonObject.toJSONString());
		
	
		System.out.println("Details are "+teamDetails.getPlayer());

	}
}
