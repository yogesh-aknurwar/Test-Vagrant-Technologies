package com.test.vagrant.tech.pages;

import org.apache.juneau.annotation.Beanc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Data;

public class Players {

	private String name;
	private String country;
	private String role;
	private float price_in_crores;

	@Beanc(properties = "name, country, role, price_in_crores")
	public Players(String name, String country, String role, int price_in_crores) {
		this.name = name;
		this.country = country;
		this.role = role;
		this.price_in_crores = price_in_crores;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public float getPrice_in_crores() {
		return price_in_crores;
	}

	public void setPrice_in_crores(int price_in_crores) {
		this.price_in_crores = price_in_crores;
	}

	@Override
	public String toString() {
		return "Players [name=" + name + ", country=" + country + ", role=" + role + ", price_in_crores="
				+ price_in_crores + "]";
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
