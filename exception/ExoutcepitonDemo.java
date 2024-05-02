package com.exception;


	public class ExoutcepitonDemo {

		public static void main(String args[]) {
			System.out.println("statement1");
			System.out.println("statement2");
			System.out.println("statement3");

			try {
				// risky code
				System.out.println(10 / 2);
			} catch (ArithmeticException ae) {
//				ae.printStackTrace();
//				System.out.println(ae.getMessage());
				System.out.println("zero can't divided by a number");
			}
			System.out.println("statement4");
			System.out.println("statement5");
		}

	}


