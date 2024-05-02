package com.IllegalArgumentException;

public class IllegalArgumentExample {
	int age;
	
	public void setage(int age) {
		
		if (age < 10) {
			throw new IllegalArgumentException("Age must be greater than ten");
		} else {
			System.out.println("elgible to vote: "+age);
		}
	}
			

	public static void main(String[] args) {
		IllegalArgumentExample b = new IllegalArgumentExample();
	b.setage(9);

	}
}
