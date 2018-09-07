package com.capgemini.day6;

import java.util.Objects;

public class Car implements Comparable <Car>{
	private String company;
	private String model;
	private int year;
	private long price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String company, String model, int year, long price) {
		super();
		this.company = company;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Car c2 = (Car) obj;
		return this.company == c2.company && this.model == c2.model; 
		
     }
	@Override
	public int hashCode() {
		return Objects.hash(company,model);
	}
	@Override
	public int compareTo(Car c2) {
		
		int result = this.company.compareTo(c2.company);
		if(result == 0)
			return this.model.compareTo(c2.model);
		return result;
	}
}

