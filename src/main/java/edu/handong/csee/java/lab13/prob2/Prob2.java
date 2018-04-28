package edu.handong.csee.java.lab13.prob2;//Instructs the Prob2 class to be complied and stored in edu.handong.csee.java.lab13.prob2

public class Prob2//The declaration of class Prob2
{

	public static void main(String[] args)//The declaration of static main method without return value
	{
		// TODO Auto-generated method stub

		Book book1=new Book("Simple Book");//Instantiate of an Book object, calling constructor, value of parameter is "Simple Book" at this time
		Science book2=new Science("Hello Physics!","ScienceWorld");//Instantiate of an Science object, calling constructor, value of parameters are "Hello Physics!" and "ScienceWorld" at this time
		History book3=new History("What Is history?", "E.H.Carr");//Instantiate of an History object, calling constructor, value of parameters are "What Is history?" and "E.H.Carr" at this time
		History book4=new History("The South Korea", "Judis");//Instantiate of an History object, calling constructor, value of parameters are "The South Korea" and "Judis" at this time
		
		book1.display();//calling method dispaly() in book1
		book2.display();//calling method dispaly() in book2
		book3.display();//calling method dispaly() in book3
		book4.display();//calling method dispaly() in book4
	}

}
