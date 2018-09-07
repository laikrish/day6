package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.LaptopEquality;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class LaptopEqualityTest {

	/*@Test
	void testLaptopEquality() {
		HashSet<Laptop> laptops = new HashSet<>();
		laptops.add(new LaptopEquality("HP", "HP677", "Windows 10", "i7"));
		laptops.add(new LaptopEquality("HP", "HP677", "Windows 8", "i5"));
		laptops.add(new LaptopEquality("Lenovo", "LN677", "Windows 12", "i5"));

		assertEquals(2, laptops.size());

}*/

	@Test
	void testLaptopEquality() {
		

		     HashSet<LaptopEquality> laptops = new HashSet<>();
				
				assertEquals(true, laptops.add(new LaptopEquality("Dell", "Inspiron5558", "Windows 8", "i5")));
				laptops.add(new LaptopEquality("HP", "HP567", "Windows 9", "i7"));
				laptops.add(new LaptopEquality("HP", "HP567", "Windows 10", "i3"));
				
				assertEquals(2, laptops.size());
			}
	@Test
	void testTelevisionEquality() {

	     HashSet<Television> tv = new HashSet<>();
			
			//assertEquals(true, tv.add(new Television("Samsung","LCD", true, 52000)));
	     tv.add(new Television("LG", "LCD", true, 500000));
			tv.add(new Television("Sony", "LED", true, 30000));
			assertEquals(2, tv.size());
		}
	@Test
	void testCarEquality() {

	     HashSet<Car> cars = new HashSet<>();
			
			//assertEquals(true, tv.add(new Television("Samsung","LCD", true, 52000)));
	     cars.add(new Car("BMW", "BM234", 2011, 5000000));
		cars.add(new Car("BMW", "BM234", 2001, 3000000));
			cars.add(new Car("HondaCity", "HC234", 2002, 8000000));
			assertEquals(2, cars.size());
		}
	@Test
	void testCellphoneEquality() {

	     HashSet<CellPhone> cp = new HashSet<>();
			
			//assertEquals(true, tv.add(new Television("Samsung","LCD", true, 52000)));
	     cp.add(new CellPhone("Samsung", "S3", "4GB RAM","Android" ,15000));
	     cp.add(new CellPhone("Samsung", "S3", "Dual Camera","Android", 5000));
	     cp.add(new CellPhone("Nexus", "630", "Dual sim", "Windows",50000));
			assertEquals(2,  cp.size());
		}
	@Test
	void testSchoolEquality() {

	     HashSet<School> sh = new HashSet<>();
			
			//assertEquals(true, tv.add(new Television("Samsung","LCD", true, 52000)));
	     sh.add(new School("nagarjuna", "hyderabad", "rangareddy",5000));
	     sh.add(new School("nagarjuna", "hyderabad","rangareddy", 500));
	     sh.add(new School("chaitanya", "telangana", "karimnagar",150));
			assertEquals(2, sh.size());
		}
}


	
