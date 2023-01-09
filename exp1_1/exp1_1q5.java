package oopjprograms;

import java.util.*;

public class exp1_1q5 
{
	public static void main(String[] args)
	{
		int n, num, rem, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		num = sc.nextInt();
		n = num;
		while(n>0)
		{
			rem = n%10;
			sum = (sum*10) + rem;
			n = n/10;			
		}
		if(num==sum)
		{
			System.out.println(num+" is a palindrome number");
		}
		else
		{
			System.out.println(num+" is not a palindrome number");
		}
	}
}
