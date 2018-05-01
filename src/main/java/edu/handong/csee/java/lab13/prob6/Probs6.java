package edu.handong.csee.java.lab13.prob6;//Instructs the Probs6 class to be complied and stored in edu.handong.csee.java.lab13.prob6

public class Probs6//The declaration of class Probs6
{

	public static void main(String[] args)//The declaration of static main method without return value
	{
		// TODO Auto-generated method stub

		UpPoint p1 = new UpPoint(3,3);;//Instantiate of an UpPoint object, calling constructor, values of parameter are 3 and 3 at this time
		DownPoint p2 = new DownPoint(2,5);//Instantiate of an DownPoint object, calling constructor, values of parameter are 2 and 5 at this time
		DownPoint p3= new DownPoint(4,7);//Instantiate of an DownPoint object, calling constructor, values of parameter are 4 and 7 at this time
		UpPoint p4=new UpPoint(9,12);//Instantiate of an UpPoint object, calling constructor, values of parameter are 9 and 12 at this time

		Printer.print(p1);//calling method print in Class Printer, A parameter is p1 at this time
		Printer.print(p2);//calling method print in Class Printer, A parameter is p2 at this time
		Printer.print(p3);//calling method print in Class Printer, A parameter is p3 at this time
		Printer.print(p4);//calling method print in Class Printer, A parameter is p4 at this time

	}

}
