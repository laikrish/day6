package com.capgemini.day6;

import java.util.Objects;

public class Student implements Comparable<Student>{
	int rollNo;
	String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, String branch) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
	}
	String branch;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public int hashCode() {
		return Objects.hash(rollNo, name, branch);
	}
@Override
	public int compareTo(Student student) {
		
		int result = this.name.compareTo(student.name);
		if(result == 0)
			return this.branch.compareTo(student.branch);
		return result;
	}

@Override
public String toString() {
	return "Student [rollno=" + rollNo + ", name=" + name + ", branch=" + branch + "]";
}
}