package edu.handong.csee.java.lab13.prob6;

public class Printer {
	
	public static void print(Object object)
	{
		String str = object.toString();
		if(object instanceof CapitalPrintable)
			str=str.toUpperCase();
		System.out.println(str);
	}

}
