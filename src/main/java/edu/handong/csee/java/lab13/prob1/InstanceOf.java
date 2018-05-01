package edu.handong.csee.java.lab13.prob1;//Instructs the InstanceOf class to be complied and stored in edu.handong.csee.java.lab13.prob1

public class InstanceOf//The declaration of class InstanceOf
{

	public static void whatFriend(Friend friend)//The declaration of static method whatFriend() without return value, A parameter is a friend of Friend type
	{
		if(friend instanceof ClassFriend)//True if reference friend is class ClassFriend type, False if reference friend is not class ClassFriend type
		{
			((ClassFriend)friend).classFriend();//Down-casting friend to class ClassFriend type, calling method classFriend() in friend 
		}
		else if(friend instanceof SchoolFriend)//True if reference friend is not class ClassFriend type and reference friend is class SchoolFriend type
		{
			((SchoolFriend)friend).schoolFriend();//Down-casting friend to class SchoolFriend type, calling method schoolFriend() in friend
		}
		else if(friend instanceof Friend)//True if reference friend is not class ClassFriend type and reference friend is not class SchoolFriend and reference is class Friend type
		{
			friend.justFriend();//calling method justFriend() in friend
		}
	}
} 
