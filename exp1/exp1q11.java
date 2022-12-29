package oopjprograms;

import java.util.*;

public class exp1q11 
{
	public static void main(String[] args)
	{
		boolean boo1, boo2, boo3, boof;
		Scanner sc = new Scanner(System.in);
	    System.out.print("enter the first boolean value: ");
	    boo1 = sc.nextBoolean();
	    System.out.print("enter the second boolean value: ");
	    boo2 = sc.nextBoolean();
	    System.out.print("enter the third boolean value: ");
	    boo3 = sc.nextBoolean();
	    if(boo1) 
	    {
	        boof = boo2 || boo3;
	    } 
	    else 
	    {
	    	boof = boo2 && boo3;
	    }
	    if(boof) 
	    {
	        System.out.println("two or more of the three values are true");
	    } 
	    else 
	    {
	         System.out.println("two or more of the three values are false");
	    }
	}
}
