/**
 * @author Yogesh Aknurwar
 * @date 19-04-2022
 * 
 */
package com.test.vagrant.tech.pages;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Data;

@Data
public class Players {

	private String name;
	private String country;	
	private String role;
	private float price_in_crores;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	public static Players fromJSON(String json) {
		Gson gson = new GsonBuilder().create();
		return gson.fromJson(json, Players.class);
	}

	public String toJSON() {
		Gson gson = new GsonBuilder().create();
		return gson.toJson(this);
	}

}
