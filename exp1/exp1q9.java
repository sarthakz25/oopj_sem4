package oopjprograms;

import java.util.*;

public class exp1q9 
{
	public static void main(String[] args)
	{
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		num1 = sc.nextInt();
		System.out.println("enter the second number:");
		num2 = sc.nextInt();
		System.out.println("enter the third number:");
		num3 = sc.nextInt();
		if(num1>=num2 && num1>=num3)
		{
			System.out.println(num1+" is the largest");
		}
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println(num2+" is the largest");
		}
		else
		{
			System.out.println(num3+" is the largest");
		}
	}
}
