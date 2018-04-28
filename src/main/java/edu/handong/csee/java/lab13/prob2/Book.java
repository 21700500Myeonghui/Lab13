package edu.handong.csee.java.lab13.prob2;//Instructs the Book class to be complied and stored in edu.handong.csee.java.lab13.prob2

public class Book//The declaration of class Book 
{

	public static int totalId=0;//Create integer type variable totalId, its modifier is static and public, Initialize totalId to 0
	protected String bookName;//Create String type variable bookName, its modifier is protected, Protected can be accessible to subclass
	protected int id;//Create integer type variable id, its modifier is protected, Protected can be accessible to subclass
	
	public Book()//Constructor without parameter
	{
		
	}
	
	public Book(String bookName)//Constructor with parameter, parameter is String type bookName
	{
		totalId++;//Increasing totalId by 1
		this.bookName=bookName;//put the parameter bookName into the member variable bookName, 'this' is a reference to the object itself
		id=totalId;//put value of variable totalId in variable id
	}
	
	public void display()//The declaration of method display() without return value
	{
		System.out.println("<<<Book>>>");//Outputs the string literal "<<<Book>>>"
		System.out.println("     Id: "+id);//Outputs the string literal "     Id: 'value of variable id'"
		System.out.println("     Book Name: "+bookName);//Outputs the string literal "     Book Name: 'value of variable bookName'"
		
	}
}
