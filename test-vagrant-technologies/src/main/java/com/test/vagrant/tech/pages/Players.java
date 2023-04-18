package com.test.vagrant.tech.pages;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Data;

@Data
public class Players {

	private String name;
	private String country;
	private String role;
	private int price_in_crores;

	public static Players fromJSON(String json) {	
		Gson gson = new GsonBuilder().create();
		return gson.fromJson(json, Players.class);
	}

	public String toJSON() {
		Gson gson = new GsonBuilder().create();
		return gson.toJson(this);
	}

}
