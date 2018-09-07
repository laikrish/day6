package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class ProductTest {

	@Test
	void testLaptopProducts() {
		ArrayList<Laptop> laptops =new ArrayList<>();
		laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
		laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		laptops.add(new Laptop("Lenovo", "LN677", "Windows 12", "i5"));

		assertEquals(3, laptops.size());

	}
	@Test
	void testCar() {
		ArrayList<Car> Cars = new ArrayList<>();
		Cars.add(new Car("BMW", "BM234", 2011, 5000000));
		Cars.add(new Car("Hyndai", "HY234", 2001, 3000000));
		Cars.add(new Car("HondaCity", "HC234", 2002, 8000000));
assertEquals(3,Cars.size());

	}
	@Test
	void testTelevisonProducts() {
		ArrayList<Television> Televisions = new ArrayList<>();
		Televisions.add(new Television("LG", "LCD", true, 500000));
		Televisions.add(new Television("Sony", "LED", true, 30000));
		Televisions.add(new Television("NEXT", "Plasma", false, 40000));
		assertEquals(3,Televisions.size());

	}
	@Test
	void testCellphoneProducts() {
		ArrayList<CellPhone> CellPhones = new ArrayList<>();
		CellPhones.add(new CellPhone("Samsung", "S3", "4GB RAM","Android" ,15000));
		CellPhones.add(new CellPhone("Nokia", "535", "Dual Camera","Redmi", 5000));
		CellPhones.add(new CellPhone("Nexus", "630", "Dual sim", "Windows",50000));
		assertEquals(3,CellPhones.size());
	}
	@Test
	void testSchoolDetails() {
		ArrayList<School> Schools = new ArrayList<>();
		Schools.add(new School("nagarjuna", "hyderabad", "rangareddy",5000));
		Schools.add(new School("Narayana", "andrapradhesh","krishna", 500));
		Schools.add(new School("chaitanya", "telangana", "karimnagar",150));
		assertEquals(3,Schools.size());
	}
	
	@Test
	void testProductDetailstest() {
		HashSet<Laptop> laptops = new HashSet<>();
		laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		laptops.add(new Laptop("Lenovo", "LN677", "Windows 12", "i5"));

		assertEquals(2, laptops.size());
		

	}
}


