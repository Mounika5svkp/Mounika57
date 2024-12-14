package org.tnsif.capgemini.c2tc.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class IoExceptionDemo {

	public static void main(String[] args) throws Exception{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\mouniv\\OneDrive\\Desktop\\html Notes\\demo.txt"));
			String data="";
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
			br.close();
		}catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}
