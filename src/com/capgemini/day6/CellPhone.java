package com.capgemini.day6;

import java.util.Objects;

public class CellPhone implements Comparable <CellPhone>{

	private String company;
	private String model;
	private String description;
	private String operatingsystem;
	private int price;
	public CellPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CellPhone(String company, String model, String description, String operatingsystem, int price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingsystem = operatingsystem;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingsystem() {
		return operatingsystem;
	}
	public void setOperatingsystem(String operatingsystem) {
		this.operatingsystem = operatingsystem;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
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
		
		CellPhone c2 = (CellPhone ) obj;
		return this.company == c2.company && this.model == c2.model && this.operatingsystem == c2.operatingsystem; 
		
	 }
	@Override
	public int hashCode() {
		return Objects.hash(company,model,operatingsystem);
	}
	@Override
	public int compareTo(CellPhone c2) {
		
		int result = this.company.compareTo(c2.company);
		//int result = this.operatingsystem.compareTo(c2.operatingsystem);
		if(result == 0)
			return this.model.compareTo(c2.model);
		return result;
	}

	 


	}


