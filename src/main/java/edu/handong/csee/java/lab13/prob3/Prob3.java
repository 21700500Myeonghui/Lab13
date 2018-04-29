package edu.handong.csee.java.lab13.prob3;//Instructs the Prob3 class to be complied and stored in edu.handong.csee.java.lab13.prob3

public class Prob3//The declaration of class Prob3
{

	public static void main(String[] args) //The declaration of static main method without return value
	{
		// TODO Auto-generated method stub
		
		Circle shape1 = new Circle();//Instantiate of an Circle object, calling constructor
		shape1.displayRadius();//calling method displayRadius() in shape1
		shape1.display();//calling method display() in shape1
		
		Rectangle shape2= new Rectangle();//Instantiate of an Rectangle object, calling constructor
		shape2.displayLength();//calling method displayLength() in shape2
		shape2.displayWidth();//calling method displayWidthth() in shape2
		shape2.display();//calling method display() in shape2

	}

}
