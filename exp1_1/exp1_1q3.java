package oopjprograms;

import java.util.*;

public class exp1_1q3
{
	public static void main(String[] args)
	{
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		num1 = sc.nextInt();
		System.out.print("enter the second number: ");
		num2 = sc.nextInt();
		if(num1>num2)
		{
			System.out.print(num1+" is larger than "+num2+"\nor\n"
							+num2+" is smaller than "+num1);
		}
		else if(num2>num1)
		{
			System.out.print(num2+" is larger than "+num1+"\nor\n"
							+num1+" is smaller than "+num2);
		}
		else
		{
			System.out.print(num1+" and "+num2+" are identical");
		}
	}
}
