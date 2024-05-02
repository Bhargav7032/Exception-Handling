package com.ClassCastException;

public class ClassCastException12 {
public static void main(String[] args) {
	 ClassCastException r = new ClassCastException2("Hari");
	 r.m1();
		ClassCastException2 c2 = (ClassCastException2) new ClassCastException("bhargav");
		c2.m1();
		
	// class cast exception occurs here because  --- it is a type mismatch
			// cannot convert from ClassCastException1 to ClassCastException2
			//up casting is possible but the reverse is not possible
			// 1 is parent 2 is child- parent to child is possible but child to parent is not possible
			// higher to lower is possible but lower to higher is not possible..
}
}
