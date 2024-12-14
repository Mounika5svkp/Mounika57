package basicsofjava;

public class DatatypeDemo {

	public static void main(String[] args) {
		//byte=1 byte
		byte bytemax=127;
		byte bytemin=-128;
		System.out.println("min range of byte is"+bytemin+"max range of byte is"+bytemax);
		//short=2 byte
		short shortmax=32767;
		short shortmin=-32768;
		System.out.println( "min range of short is"+shortmin+"max range of short is"+shortmax);
		//int=4 byte
		int intmax=2147483647;
		int intmin=-2147483647;
		System.out.println( "min range of int is"+intmin+"max range of int is"+intmax);
		//long=8 byte
		long maxlong=9223372036854775807L;
		long minlong= -9223372036854775808L;
		System.out.println();
		//float=4 byte
		float f = 3234.141243278345f;
		double d =3456.14124512345678902345678914d;
		System.out.println("float value"+f+"double"+d);
		//boolean=1 byte
		boolean status =false;
		System.out.println("boolean value is"+ status);
		char c ='m';
		System.out.println("char value"+c);
	}
}
	
			
		
		

	


