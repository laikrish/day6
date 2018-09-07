package com.capgemini.day6;

import java.util.Objects;

public class Television implements Comparable<Television>{
	private String company;
	private String type;
	private boolean enabled3D;
	private long price;
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Television(String company, String type, boolean enabled3d, long price) {
		super();
		this.company = company;
		this.type = type;
		enabled3D = enabled3d;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean getEnabled3D() {
		return enabled3D;
	}
	public void setEnabled3D(boolean enabled3d) {
		enabled3D = enabled3d;
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
	
	Television c2 = (Television ) obj;
	return this.company == c2.company && this.type == c2.type && this.price == c2.price; 
	
 }
@Override
public int hashCode() {
	return Objects.hash(company,type,price);
}
@Override
public int compareTo(Television  c2) {
	
	//int result = this.company.compareTo(c2.company);
	int result = Double.compare(this.getPrice(), c2.getPrice());
	if(result == 0)
		return this.type.compareTo(c2.type);
	return result;
}

 


}
