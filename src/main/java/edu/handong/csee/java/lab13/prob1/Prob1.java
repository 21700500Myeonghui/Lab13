package edu.handong.csee.java.lab13.prob1;//Instructs the Prob1 class to be complied and stored in edu.handong.csee.java.lab13.prob1

public class Prob1//The declaration of class Prob1
{

	public static void main(String[] args)//The declaration of static main method without return value
	{
		// TODO Auto-generated method stub

		Friend friend1=new Friend();//Instantiate of an Friend object
		SchoolFriend friend2=new SchoolFriend();//Instantiate of an SchoolFriend object
		ClassFriend friend3=new ClassFriend();//Instantiate of an ClassFriend object

		InstanceOf.doYouKnowWhatFriend(friend1);//calling method doYouKnowWhatFriend() in InstanceOf, the parameter is friend1
		InstanceOf.doYouKnowWhatFriend(friend2);//calling method doYouKnowWhatFriend() in InstanceOf, the parameter is friend2
		InstanceOf.doYouKnowWhatFriend(friend3);//calling method doYouKnowWhatFriend() in InstanceOf, the parameter is friend3

	}

}
