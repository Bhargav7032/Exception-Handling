package com.ClassCastException;

public class ClassCastException {
String parentname;
public ClassCastException() {
}
public  ClassCastException(String parentname) {
	super();
	this.parentname=parentname;
}
void m1() {
	System.out.println("parent one");
}
}
