package oopjprograms;

import java.util.*;

public class exp1q3 
{
	public static void main(String[] args)
	{
		int t;
		double a,u,d;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter time in seconds: ");
		t = sc.nextInt();
		System.out.print("enter initial velocity: ");
		u = sc.nextInt();
		System.out.print("enter acceleration: ");
		a = sc.nextInt();
		d = (u*t) + (a*t*t)/2;
		System.out.print("travelled distance = "+d);
	}
}
