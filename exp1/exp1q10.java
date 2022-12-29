package oopjprograms;

import java.util.*;

public class exp1q10 
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		num = sc.nextInt();
		if(num>0)
		{
			System.out.println(num+" is a positive number");
		}
		else if(num<0)
		{
			System.out.println(num+" is a negative number");
		}
		else
		{
			System.out.println(num+" is a zero");
		}
	}
}
