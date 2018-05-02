package edu.handong.csee.java.lab13.prob4;//Instructs the Master class to be complied and stored in edu.handong.csee.java.lab13.prob4

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of external objects created by other developer

public class Master//The declaration of class Master
{

	public static void feed(Pet pet)//The declaration of static method feed() without return value, A parameter is a pet of interface Pet type
	{
		System.out.println("feed: "+pet.giveFood());//Outputs "feed: 'return value of calling method giveFood() in pet'"
	}
 
	public static void main(String[] args)//The declaration of static main method without return value
	{
		// TODO Auto-generated method stub

		String name1, name2;//Create String type local variable name1, name2
		Scanner keyboard = new Scanner(System.in);//Create an object of the Scanner class


		System.out.print("Enter the cat name and dog name: ");//Outputs the string literal "Enter the cat name and dog name: "
		name1=keyboard.next();//Take one word from the keyboard and place it in name1
		name2=keyboard.next();//Take one word from the keyboard and place it in name2

		Cat cat1=new Cat();//Instantiate of an Cat object
		cat1.setName(name1);//calling method setName() in cat1, the parameter is name1
		cat1.getName();//calling method getName() in cat1
		Master.feed(cat1);//calling method feed() in class Master, the parameter is cat1

		Dog dog1=new Dog();//Instantiate of an Dog object
		dog1.setName(name2);//calling method setName() in dog1, the parameter is name2
		dog1.getName();//calling method getName() in dog1
		Master.feed(dog1);//calling method feed() in class Master, the parameter is dog1

	}
}
