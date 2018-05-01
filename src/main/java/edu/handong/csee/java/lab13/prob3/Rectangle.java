package edu.handong.csee.java.lab13.prob3;//Instructs the Rectangle class to be complied and stored in edu.handong.csee.java.lab13.prob3

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of external objects created by other developer

public class Rectangle extends Shapes//The declaration of class Rectangle to be inherited of Shapes
{

	private double length;//Create double type instance variable length
	private double width;//Create double type instance variable width

	public Rectangle()//Constructor without parameter
	{
		Scanner keyboard = new Scanner(System.in);//Create an object of the Scanner class
		System.out.print("Enter length and width: ");//Outputs the string literal "Enter length and width: "
		length=keyboard.nextDouble();//Take one double from the keyboard and place it in length
		width=keyboard.nextDouble();//Take one double from the keyboard and place it in width
	}

	public void displayLength()//The declaration of method displayLength() without return value
	{
		System.out.println("Length: "+length);//Outputs "Length: 'value of variable length'"
	}

	public void displayWidth()//The declaration of method displayWidth() without return value
	{
		System.out.println("Width: "+width);//Outputs "Width: value of variable width'"

	}

	public double area()//The declaration of method area() without return value
	{
		return length*width;//Return length * width
	}

	public double perimeter()//The declaration of method perimeter() without return value
	{
		return 2*(length+width);//Return 2*(length+width)
	}
}
