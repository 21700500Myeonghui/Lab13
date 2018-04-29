package edu.handong.csee.java.lab13.prob4;//Instructs the Cat class to be complied and stored in edu.handong.csee.java.lab13.prob4

public class Cat extends Animal implements Pet//The declaration of class Cat to be inherited of Animal, Implementing the Interface Pet
{
	public String food()//The declaration of method food() with String type return value
	{
		return "(Cat!)"+"Fish";//Return "(Cat!)Fish"
	}

}
