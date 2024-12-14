package org.tnsif.capgemini.c2tc.ScannerClass_bufferreader;
import java.util.Scanner;
public class ScannerAllMethod {
	//import the scanner class
		//create a scanner object
		//prompt the user for input
		//Read input using scanner method
		//validate
		//close the scanner
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name");
		String name= scan.nextLine();
		System.out.println("enter your age");
		int age= scan.nextInt();
		System.out.println("enter your height");
		float height= scan.nextFloat();
		System.out.println("are you a isstudent");
		Boolean Student= scan.nextBoolean();
		System.out.println("enter aadhar number");
		long aadhar= scan.nextLong();
		System.out.println("enter your favorite teacher");
		String teacher= scan.nextLine();
		System.out.println("enter your hobby");
		String hobby= scan.nextLine();
		System.out.println("enter your CGPA");
		float cgpa=scan.nextFloat();
		System.out.println("enter your daily reading time in minites");
		int Hours =scan.nextInt();
		System.out.println("enter number of siblings you have"); 
		int siblings =scan.nextInt();
		System.out.println("student information");
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("Height "+height);
		System.out.println("isstudent "+"isstudent");
		System.out.println("aadhar "+aadhar);
		System.out.println("fav teacher "+teacher);
		System.out.println("hobby "+hobby);
		System.out.println("cgpa "+cgpa);
		System.out.println("Reading time "+"readingtime");
		System.out.println("Siblings "+siblings);
	}
}

		
		
		
		
		
		
		
		
		

	


