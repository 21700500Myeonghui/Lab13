package edu.handong.csee.java.lab13.prob1;//Instructs the InstanceOf class to be complied and stored in edu.handong.csee.java.lab13.prob1

public class InstanceOf//The declaration of class InstanceOf
{

	public static void doYouKnowWhatFriend(Friend friend)//The declaration of static method doYouKnowWhatFriend() without return value, A parameter is a friend of Friend type
	{
		if(friend instanceof ClassFriend)//True if reference friend is class ClassFriend type, False if reference friend is not class ClassFriend type
		{
			((ClassFriend)friend).tellClassFriend();//Down-casting friend to class ClassFriend type, calling method tellClassFriend() in friend 
		}
		else if(friend instanceof SchoolFriend)//True if reference friend is not class ClassFriend type and reference friend is class SchoolFriend type
		{
			((SchoolFriend)friend).tellSchoolFriend();//Down-casting friend to class SchoolFriend type, calling method tellSchoolFriend() in friend
		}
		else if(friend instanceof Friend)//True if reference friend is not class ClassFriend type and reference friend is not class SchoolFriend and reference is class Friend type
		{
			friend.tellJustFriend();//calling method tellJustFriend() in friend
		}
	}
} 
