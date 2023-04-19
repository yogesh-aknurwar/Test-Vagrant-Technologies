/**
 * @author Yogesh Aknurwar
 * @date 19-04-2022
 * 
 */
package com.test.vagrant.tech.pages;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Data;

@Data
public class RoyalChallengersBangloreTeam {

	private String name;
	private String location;
	private List<Players> player;

	public List<Players> getPlayer() {
		return player;
	}

	public void setPlayer(List<Players> player) {
		this.player = player;
	}

	public static RoyalChallengersBangloreTeam fromJSON(String json) {
		Gson gson = new GsonBuilder().create();
		return gson.fromJson(json, RoyalChallengersBangloreTeam.class);
	}

	public String toJSON() {
		Gson gson = new GsonBuilder().create();
		return gson.toJson(this);
	}

}
