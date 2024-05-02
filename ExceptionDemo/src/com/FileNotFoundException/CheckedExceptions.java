package com.FileNotFoundException;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.FileReader;
	import java.io.IOException;

	public class CheckedExceptions {
		public static void main(String[] args) {

			File file = null;
			FileOutputStream bagi = null;
			try {
				String s = "Hey Bhargav ";
				file = new File("s.txt");
				bagi = new FileOutputStream(file);
				bagi.write(s.getBytes());
				System.out.println("Hello");
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());

			} catch (IOException io) {
				System.out.println(io.getMessage());

			} finally {
				try {
					if (bagi != null) {

						bagi.close();
					}
				} catch (IOException e) {
					System.out.println(e.getMessage());

				}
				System.out.println("Bhargav");

			}

			// the compiler is forcing to declare the file in method using
			// "throws" keyword (or) to surround it with try/catch method.[Error shown
			// at compile time].......

		}

	}
