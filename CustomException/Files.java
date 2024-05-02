package com.CustomException;
	import java.util.Scanner;

	public class Files {
		
		public  void RequiredFileNotFound(String fileName) {
			Scanner sc=new Scanner(System.in);
			System.out.println("pls enter a file name");
			String s=sc.nextLine();
			if(fileName.contains("Java File")) {
				System.out.println("file found");
			}
			else {
				throw new RequiredFileNotFoundException("your file is not found please check your file name");
				
			}
		}
		public static void main(String[] args) {
			try {
			Files file=new Files();
//		    file.RequiredFileNotFound("Java File");
			 file.RequiredFileNotFound("C++File");
			}catch(RequiredFileNotFoundException rf) {
				System.out.println(rf.getMessage());
			}
		}

	}


