package edu.handong.csee.java.lab13.prob3;//Instructs the Shapes class to be complied and stored in edu.handong.csee.java.lab13.prob3

public abstract class Shapes//The declaration of abstract class Shapes
{

	abstract public double calculateArea();//The declaration of abstract method calculateArea()
	abstract public double calculatePerimeter();//The declaration of abstract method calculatePerimeter()

	public void display()//The declaration of method display() without return value
	{
		System.out.println("Area: "+calculateArea()+"\nPerimeter: "+calculatePerimeter()+"\n");//Outputs "Area: ' return value of method area()' <change line>Perimeter: 'return value of method calculatePerimeter() <change line>"
	}
}
 