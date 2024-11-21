package org.tnsif.capgemini.c2tc.Scannerclass;
import java.util.Scanner;

	//import the scanner class
	//create a scanner object
	//prompt the user for input
	//Read input using scanner method
	//validate
	//close the scanner

	public class ScannerClassDemo{
		
		public static void main(String []args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter your name");
			String name=scan.nextLine();
			System.out.println("enter your age");
			int age=scan.nextInt();
			System.out.println("name:"+name+" "+"age:"+age);
			scan.close();
			
			
		}

}
