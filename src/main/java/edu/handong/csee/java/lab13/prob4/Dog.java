package edu.handong.csee.java.lab13.prob4;//Instructs the Dog class to be complied and stored in edu.handong.csee.java.lab13.prob4

public class Dog extends Animal implements Pet //The declaration of class Dog to be inherited of Animal, Implementing the Interface Pet
{

	public String giveFood()//The declaration of method giveFood() with String type return value
	{
		return "(Dog!)"+"Sauage";//Return "(Dog!)Sauage"
	}

} 
