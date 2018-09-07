package com.capgemini.day6;

import java.util.Objects;

public class School implements Comparable<School>{ 

	private String name;
	private String city;
	private String district;
	private int greatschoolranking;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(String name, String city, String district, int greatschoolranking) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.greatschoolranking = greatschoolranking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getGreatschoolranking() {
		return greatschoolranking;
	}
	public void setGreatschoolranking(int greatschoolranking) {
		this.greatschoolranking = greatschoolranking;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		School c2 = (School ) obj;
		return this.name == c2.name && this.city == c2.city && this.district == c2.district; 
		
	 }
	@Override
	public int hashCode() {
		return Objects.hash(name,city,district);
	}
	@Override
	public int compareTo(School  c2) {
		
		int result = this.name.compareTo(c2.name);
		//int result = this.city.compareTo(c2.city);
		if(result == 0)
			return this.district.compareTo(c2.district);
		return result;
	}
}

