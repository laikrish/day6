package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

class StudentFruitsTest {
	@Test
	void testStudentFavouriteFruit() {
		HashMap<String, ArrayList<String>> map= new HashMap<String,ArrayList<String>>();
		String[] favorites = new String[] {"apple","banana"};
		map.put("sunnihitha", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"banana","kiwi","orange"};
		map.put("varnika", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"peru","apple"};
		map.put("veni", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"mango","papaya","apple"};
		map.put("himaja", new ArrayList<>(Arrays.asList(favorites)));
		
		assertEquals(4, map.size()); 
		for (Entry<String, ArrayList<String>> entry : map.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		
	}
	}


