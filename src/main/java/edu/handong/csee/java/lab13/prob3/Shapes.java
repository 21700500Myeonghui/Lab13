package edu.handong.csee.java.lab13.prob3;//Instructs the Shapes class to be complied and stored in edu.handong.csee.java.lab13.prob3

public abstract class Shapes//The declaration of abstract class Shapes
{

	abstract public double area();//The declaration of abstract method area()
	abstract public double perimeter();//The declaration of abstract method perimeter()

	public void display()//The declaration of method display() without return value
	{
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter()+"\n");//Outputs "Area: ' return value of method area()' <change line>Perimeter: 'return value of method perimeter() <change line>"
	}
}
