package com.test.vagrant.tech.tests;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.vagrant.tech.constants.GlobalConstants;
import com.test.vagrant.tech.pages.Players;
import com.test.vagrant.tech.pages.RoyalChallengersBangloreTeam;
import com.test.vagrant.tech.utility.Util;

public class ProblemStatement extends Util {

	private static Logger logger = LoggerFactory.getLogger(ProblemStatement.class);
	GlobalConstants constant;

	@Test
	public void verifyForeignPlayersTeamSize() throws Exception {

		JSONObject jsonObject = super.readJSONFile(GlobalConstants.DATA);

		RoyalChallengersBangloreTeam teamDetails = RoyalChallengersBangloreTeam.fromJSON(jsonObject.toJSONString());

		List<Players> players = teamDetails.getPlayer();
		List<String> countries = new ArrayList<String>();

		for (Players player : players) {
			countries.add(player.getCountry());
		}

		countries.removeIf(country -> country.contains("India"));
		System.out.println("Foreign countries are " + countries);

		Assert.assertEquals(countries.size(), GlobalConstants.FOREIGN_PLAYERS_COUNT,
				"Team does not have " + GlobalConstants.FOREIGN_PLAYERS_COUNT + " foreign players");

	}
}
