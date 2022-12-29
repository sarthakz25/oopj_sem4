package oopjprograms;

import java.util.*;

public class exp1q1 
{
	public static void main(String[] args)
	{
		int num1, num2, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		num1 = sc.nextInt();
		System.out.print("enter the second number: ");
		num2 = sc.nextInt();
		sum = num1+num2;
		System.out.println("the sum of "+num1+" and "+num2+" is "+ sum);
	}
}
