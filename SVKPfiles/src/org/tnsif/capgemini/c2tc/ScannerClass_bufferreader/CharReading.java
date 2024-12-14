package org.tnsif.capgemini.c2tc.ScannerClass_bufferreader;
import java.util.Scanner;
public class CharReading {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a String");
		char c= scan.next().charAt(0);
		System.out.println("the first character of the input String" +c );
	

	}

}
