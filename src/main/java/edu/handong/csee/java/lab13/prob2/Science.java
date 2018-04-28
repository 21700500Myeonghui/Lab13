package edu.handong.csee.java.lab13.prob2;//Instructs the Science class to be complied and stored in edu.handong.csee.java.lab13.prob2

public class Science extends Book//The declaration of class Science to be inherited of Book
{

	private String publisher;//Create String type instance variable publisher
	
	public Science(String name, String publisher)//Constructor with parameter, parameters are String type name and String type publisher
	{
		totalId++;//Increasing totalId by 1
		bookName=name;//put value of parameter name in variable bookName
		this.publisher=publisher;//put the parameter publisher into the member variable publisher, 'this' is a reference to the object itself
		id=totalId;//put value of variable totalId in variable id
	}
	
	public void display()//The declaration of method display() without return value
	{
		System.out.println("<<<Science>>>");//Outputs the string literal "<<<Science>>>"
		System.out.println("     Id: "+id);//Outputs the string literal "     Id: 'value of variable id'"
		System.out.println("     Book Name: "+bookName);//Outputs the string literal "     Book Name: 'value of variable bookName'"
		System.out.println("     Publisher: "+publisher);//Outputs the string literal"     Publisher: 'value of variable publisher'"
		
	}
}
