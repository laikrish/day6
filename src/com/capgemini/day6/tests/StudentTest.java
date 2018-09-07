package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Student;

class StudentTest {
	@Test
	void testStudent() {
		TreeSet<Student> student = new TreeSet<Student>();
		student.add(new Student(13, "kv", "cse"));
		student.add(new Student(12, "kc", "ece"));
		student.add(new Student(14, "priyanka", "it"));

		assertEquals(3, student.size());
		 for (Student student2 : student) {
				System.out.println(student2);
		 }
				
		
	}
	@Test
	void testcheckStudentDetails()
	{
		ArrayList<Student> student=new ArrayList<Student>();
		
		student.add(new Student(13, "kv", "cse"));
		student.add(new Student(12, "khgj", "ece"));
		student.add(new Student(14, "priyanka", "it"));
		assertEquals(3, student.size());
for (Student student2 : student) {
	System.out.println(student2);
}
	}
}

