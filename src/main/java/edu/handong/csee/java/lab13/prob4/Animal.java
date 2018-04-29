package edu.handong.csee.java.lab13.prob4;//Instructs the Animal class to be complied and stored in edu.handong.csee.java.lab13.prob4

public class Animal//The declaration of class Animal
{
	private String name;//Create String type instance variable name
	
	public void setName(String name)//The declaration of method setName() without return value, A parameter is a name of String type
	{
		this.name=name;//put the parameter name into the member variable name, 'this' is a reference to the object itself
	}
	
	public void getName()//The declaration of method getName() without return value
	{
		System.out.println("Name: "+name);//Outputs "Name: 'value of variable name'"
	}

}
