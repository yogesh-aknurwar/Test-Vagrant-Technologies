package com.test.vagrant.tech.pages;

import java.util.List;

import org.apache.juneau.annotation.Beanc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Data;

public class RoyalChallengersBangloreTeam {

	private String name;
	private String location;
	private List<Players> player;
	
	@Beanc(properties = "name, location, player")
	public RoyalChallengersBangloreTeam(String name, String location, List<Players> player) {
		super();
		this.name = name;
		this.location = location;
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

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
