package edu.handong.csee.java.lab13.prob5;//Instructs the Prob5 class to be complied and stored in edu.handong.csee.java.lab13.prob5

import java.util.Scanner;//importing a package, java.util.Scanner. A package is a kind of external objects created by other developer

public class Prob5 //The declaration of class Prob5
{

	public static void main(String[] args)//The declaration of static main method without return value
	{
		// TODO Auto-generated method stub

		boolean tf;//Create boolean type local variable tf
		int i,j;//Create integer type local variable i,j
		int row1, row2;//Create integer type local variable row1, row2
		int column1, column2;//Create integer type local variable colum1, colum2
		Scanner keyboard = new Scanner(System.in);//Create an object of the Scanner class
		
		System.out.print("Enter row size(maximum 5): ");//Outputs the string literal "Enter row size(maximum 5): "
		row1= keyboard.nextInt();//Take one word from the keyboard and place it in row1
		System.out.print("Enter column size(maximum 5): ");//Outputs the string literal "Enter column size(maximum 5): "
		column1=keyboard.nextInt();//Take one word from the keyboard and place it in colum1
		
		int array1[][]=new int[row1][column1];//Creation row1*colum1 integer type array 
		
		System.out.print("Enter row size(maximum 5): ");//Outputs the string literal "Enter row size(maximum 5): "
		row2= keyboard.nextInt();//Take one word from the keyboard and place it in row2
		System.out.print("Enter column size(maximum 5): ");//Outputs the string literal "Enter column size(maximum 5): "
		column2=keyboard.nextInt();//Take one word from the keyboard and place it in colum2
		
		int array2[][]=new int[row2][column2];//Creation row2*colum2 integer type array 
		
		System.out.print("Enter list1: ");//Outputs the string literal "Enter list1: "
		
		for(i=0;i<row1;i++)//Put the 0 in i, increase i by 1, Repeat until i is less than row1
		{
			for(j=0;j<column1;j++)//Put the 0 in j, increase j by 1, Repeat until j is less than column1
			{
				array1[i][j]=keyboard.nextInt();//Take one word from the keyboard and place it in array1[i][j]
			}
		}
		
        System.out.print("Enter list2: ");//Outputs the string literal "Enter list2: "
		
		for(i=0;i<row2;i++)//Put the 0 in i, increase i by 1, Repeat until i is less than row2
		{
			for(j=0;j<column2;j++)//Put the 0 in j, increase j by 1, Repeat until j is less than column2
			{
				array2[i][j]=keyboard.nextInt();//Take one word from the keyboard and place it in array2[i][j]
			}
		}
		
		for(i=0;i<row1;i++)//Put the 0 in i, increase i by 1, Repeat until i is less than row1
		{
			for(j=0;j<column1;j++)//Put the 0 in j, increase j by 1, Repeat until j is less than column1
			{
				System.out.print(array1[i][j]+" ");//Outputs "value of array1[i][j] "
			}
			System.out.print("\n");//Outputs one line
		}
		
		System.out.println();//Outputs one line
		
		for(i=0;i<row2;i++)//Put the 0 in i, increase i by 1, Repeat until i is less than row2
		{
			for(j=0;j<column2;j++)//Put the 0 in j, increase j by 1, Repeat until j is less than column2
			{
				System.out.print(array2[i][j]+" ");//Outputs "value of array2[i][j] "
			}
			System.out.print("\n");//Outputs one line
		}
		
		tf=equals(array1,array2);//calling method equals with the parameters are array1, array2, and put return value of calling method equals in tf
		displayResult(tf);//calling method displayResult, the parameter is tf
		
		
	}

	public static boolean equals(int[][] array1, int[][] array2)//The declaration of static method equals with boolean type return value, A parameters are array1, array2 of integer[][] type 
	{
		// TODO Auto-generated method stub
		
		int count=0;//Create integer type local variable count
		int i,j;//Create integer type local variable i,j
		
	
		if(array1.length!=array2.length)//if length of array1(row size of array1) and length of array2(row size of array2) are not same
			return false;//Return false
		else//if length of array1(row size of array1) and length of array2(row size of array2) are same
		{
			if(array1[0].length>array2[0].length)//If length of array1[0] is larger than length of array2[0]
			{
				count=(array1[0].length-array2[0].length)*array1.length;//Put ((length of array1[0]-length of array2[0])*length of array1) in count
				for(i=0;i<array1.length;i++)//Put the 0 in i, increase i by 1, Repeat until i is less than length of array1
				{
					for(j=0;j<array2[0].length;j++)//Put the 0 in j, increase j by 1, Repeat until j is less than length of array2[0]
					{
						if(array1[i][j]!=array2[i][j])//if array1[i][j] and array2[i][j] are not same
							count++;//Increasing the count by 1
					}
				}
			}
			else if(array1[0].length<array2[0].length)//If length of array2[0] is larger than length of array1[0]
			{
				count=(array2[0].length-array1[0].length)*array1.length;//Put ((length of array2[0]-length of array1[0])*length of array1) in count
				for(i=0;i<array1.length;i++)//Put the 0 in i, increase i by 1, Repeat until i is less than length of array1
				{
					for(j=0;j<array1[0].length;j++)//Put the 0 in j, increase j by 1, Repeat until j is less than length of array1[0]
					{
						if(array1[i][j]!=array2[i][j])//if array1[i][j] and array2[i][j] are not same
							count++;//Increasing the count by 1
					}
				}
			}
			else//if length of array1[0] and length of array2[0] are same
				for(i=0;i<array1.length;i++)//Put the 0 in i, increase i by 1, Repeat until i is less than length of array1
				{
					for(j=0;j<array1[0].length;j++)//Put the 0 in j, increase j by 1, Repeat until j is less than length of array1[0]
					{
						if(array1[i][j]!=array2[i][j])//if array1[i][j] and array2[i][j] are not same
							count++;//Increasing the count by 1
					}
				}
				
			
		}
		if(count>3)//If count is more than 3
			return false;//Return false
		else//If count is less than or equal to 3
			return true;//Return true
	}
	
	public static void displayResult(boolean tf)//The declaration of static method displayResult without return value, A parameter is tf of boolean type
	{
		if(tf==true)//if value of tf is true
			System.out.println("The two arrays are approximately identical");//Outputs the string literal "The two arrays are approximately identical"
		else if(tf==false)//if value of tf is false
			System.out.println("The two arrays are not identical");//Outputs the string literal "The two arrays are not identical"
	}

}
