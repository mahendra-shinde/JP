package com.mahendra;

import java.io.Serializable;

//Data Transfer Object
// ENtity class, Mapped Class, POJO 

public class City implements Serializable {
	private long id;
	private String name;
	private String countryCode;
	private String district;
	private long population;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(long id, String name, String countryCode, String district, long population) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}
	
	
}
