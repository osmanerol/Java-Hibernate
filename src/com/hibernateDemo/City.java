package com.hibernateDemo;

import javax.persistence.*;

@Entity // veritabani nesnesi oldugu
@Table(name="city")
public class City {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="countrycode")
	private String countrycode;
	@Column(name="district")
	private String district;
	@Column(name="population")
	private int population;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountrycode() {
		return countrycode;
	}
	
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}