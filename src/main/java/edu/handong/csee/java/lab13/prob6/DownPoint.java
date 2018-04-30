package edu.handong.csee.java.lab13.prob6;//Instructs the DownPoint class to be complied and stored in edu.handong.csee.java.lab13.prob6

public class DownPoint //The declaration of class DownPoint
{
	private int x,y;//Create integer type instance variables x,y
	
	public DownPoint(int x, int y)//Constructor with parameter, parameters are x,y of integer type
	{
		this.x=x;//put the parameter x into the member variable x, 'this' is a reference to the object itself
		this.y=y;//put the parameter y into the member variable y, 'this' is a reference to the object itself
	}
	
	public String toString()//The declaration of method toString() with String type return value
	{
		return "x: "+x+" y: "+y;//Return "x: 'value of variable x' y: 'value of variable y'"
	}
}
