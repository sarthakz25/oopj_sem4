package oopjprograms;

import java.util.*;

public class exp1q14 
{
	public static void main(String[] args)
	{
		double pamt, rate, time, famt;
		Scanner sc = new Scanner(System.in);
	    System.out.print("enter the principal amount: ");
	 	pamt = sc.nextDouble();
	 	System.out.print("enter the rate of interest: ");
		rate = sc.nextDouble();
		System.out.print("enter the time: ");
		time = sc.nextInt();
		famt = pamt*(rate/100)*time;
		System.out.println("the principal amount is "+pamt);
		System.out.println("the rate of interest is "+rate);
		System.out.println("the time duration is "+time);
		System.out.println("future amount = "+famt);
	}
}
