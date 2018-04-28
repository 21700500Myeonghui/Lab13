package edu.handong.csee.java.lab13.prob2;//Instructs the History class to be complied and stored in edu.handong.csee.java.lab13.prob2

public class History extends Book//The declaration of class History to be inherited of Book

{
	private String author;//Create String type instance variable author

	public History(String name, String author)//Constructor with parameter, parameters are String type name and String type author
	{
		totalId++;//Increasing totalId by 1
		bookName=name;//put value of parameter name in variable bookName
		this.author=author;//put the parameter author into the member variable author, 'this' is a reference to the object itself
		id=totalId;//put value of variable totalId in variable id
	}

	public void display()//The declaration of method display() without return value
	{
		System.out.println("<<<History>>>");//Outputs the string literal "<<<History>>>"
		System.out.println("     Id: "+id);//Outputs the string literal "     Id: 'value of variable id'"
		System.out.println("     Book Name: "+bookName);//Outputs the string literal "     Book Name: 'value of variable bookName'"
		System.out.println("     Author: "+author);//Outputs the string literal"     Author: 'value of variable author'"

	}
}
