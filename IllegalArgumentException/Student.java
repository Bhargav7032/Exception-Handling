package com.IllegalArgumentException;

public class Student {
	private int id;
	private String name;
	public Student(int id, String name) throws IllegalAccessException {
	if(id!=0&&name!=null) {
		this.id = id;
		this.name = name;
	}
	else {
		throw new IllegalAccessException("name and id should not be null");
	}
	
}
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
	public void display() {
	System.out.println("id of Student:"+id);
	System.out.println("Name of Student:"+name);
	}
	
public static void main(String[]args) throws IllegalAccessException {
Student s1=new Student(4,"Bhargav");
	Student s=new Student(0,null);
	s1.display();
	s.display();
	
}
	}
	
	
	
	
	
	
	
	
	