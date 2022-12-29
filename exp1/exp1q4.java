package oopjprograms;

import java.util.*;

public class exp1q4 
{
	public static void main(String[] args)
	{
		int n, num, rem, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		n = sc.nextInt();
		num = n;
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		System.out.println("the reverse of "+n+" is "+rev);
	}
}
