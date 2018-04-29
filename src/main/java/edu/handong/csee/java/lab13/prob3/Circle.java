package edu.handong.csee.java.lab13.prob3;//Instructs the Circle class to be complied and stored in edu.handong.csee.java.lab13.prob3

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of external objects created by other developer

public class Circle extends Shapes//The declaration of class Circle to be inherited of Shapes
{
	
	private double radius;//Create double type instance variable radius
	
	public Circle()//Constructor without parameter
	{
		Scanner keyboard = new Scanner(System.in);//Create an object of the Scanner class
		System.out.print("Enter radius: ");//Outputs the string literal "Enter radius: "
		radius=keyboard.nextDouble();//Take one double from the keyboard and place it in radius
		
	}
	
	public void displayRadius()//The declaration of method displayRadius() without return value
	{
		System.out.println("Radius: "+radius);//Outputs "Radius: 'value of variable radius'"
		
	}
	
	public double area()//The declaration of method area() with double type return value
	{
		return Math.PI * Math.pow(radius, 2);//Return pi * radius * radius
		
	}
	
	public double perimeter()//The declaration of method perimeter() with double type return value
	{
		return 2.0 * Math.PI *radius;//Return 2.0 * pi * radius
	}

}
