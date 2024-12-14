package org.tnsif.capgemini.c2tc.ScannerClass_bufferreader;
import java.util.Scanner;
public class AdavancedScannerClass {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter some data you can enter number or text");
		while(scan.hasNext())
			if(scan.hasNextInt())
			{
				int intvalue=scan.nextInt();
				System.out.println("read an integer"+intvalue);
			}
			else if (scan.hasNextDouble())
			{
				double doublevalue=scan.nextDouble();
				System.out.println("read an double + double value");
			}
			else
			{
				String Stringvalue=scan.next();
				System.out.println("unknow input"+Stringvalue);
			}
	}
}
			
				
			
		

	


