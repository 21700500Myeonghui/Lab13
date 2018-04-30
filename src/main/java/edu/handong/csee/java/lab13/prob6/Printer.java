package edu.handong.csee.java.lab13.prob6;//Instructs the Printer class to be complied and stored in edu.handong.csee.java.lab13.prob6

public class Printer //The declaration of class Printer
{
	
	public static void print(Object object)//The declaration of static method print() without return value, A parameter is object of Object type
	{
		String str = object.toString();//Create String type local variable str, calling method toString() in object, put its return value in str
		if(object instanceof CapitalPrintable)//if reference object is interface CapitalPrintable type
			str=str.toUpperCase();//calling method toUpperCase() in str, put its return value in str
		System.out.println(str);//Outputs "'value of variable str'"
	}

}
