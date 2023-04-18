package com.test.vagrant.tech.pages;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Data;

@Data
public class RoyalChallengersBangloreTeam {
	
	private String name;
	private String location;
	private Players player;
	
	
	public static RoyalChallengersBangloreTeam fromJSON(String json) {	
		Gson gson = new GsonBuilder().create();
		return gson.fromJson(json, RoyalChallengersBangloreTeam.class);
	}

	public String toJSON() {
		Gson gson = new GsonBuilder().create();
		return gson.toJson(this);
	}
	
}
