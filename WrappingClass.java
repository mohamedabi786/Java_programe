package com.dev;

public class WrappingClass {
	public static void main(String[] args)
	{
		boolean b2=true;
		byte b=10;
		short s=5;
		char c='a';
		int i=15;
		long l=67;
		float f=50.0F;
		double d=9.08D;
		
		Byte byteobj=b; //Autoboxing: converting primitive datatype to objects
		Boolean booleanobj=b2;
		Short shortobj=s;
		Integer intobj=i;
		Character charobj=c;
		Float floatobj=f;
		Double doubleobj=d;
		Long longobj=l;
		
		System.out.println("Printing the Object Values:");
		System.out.println("Byte object:"+byteobj);
		System.out.println("Boolean object:"+booleanobj);
		System.out.println("Short object:"+shortobj);
		System.out.println("Char object:"+charobj);
		System.out.println("Int object:"+intobj);
		System.out.println("long object:"+longobj);
		System.out.println("Double object:"+doubleobj);
		System.out.println("Float object:"+floatobj);
		System.out.println("");
		//unboxing object to primitive 
		System.out.println("Printing the primitive Values:");
		byte Bytevalue=byteobj;
		boolean Booleanvalue=booleanobj;
		short Shortvalue=shortobj;
		int Integervalue=intobj;
		char Charvalue=charobj;
		float Floatvalue=floatobj;
		double Doublevalue=doubleobj;
		long Longvalue=longobj;
		
		System.out.println("Byte value:"+Bytevalue);
		System.out.println("boolean value:"+Booleanvalue);
		System.out.println("Short value:"+Shortvalue);
		System.out.println("Byte value:"+Integervalue);
		System.out.println("Char value:"+Charvalue);
		System.out.println("Float value:"+Floatvalue);
		System.out.println("Double value:"+Doublevalue);
		System.out.println("long  value:"+Longvalue);
		
		
		
		
		
		
	}
	
	
	
	
}
