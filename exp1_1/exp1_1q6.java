package oopjprograms;

import java.util.*;

public class exp1_1q6 
{
	public static void main(String[] args)
	{
		int i, j, num, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upto which number to print prime numbers:");
    	num = sc.nextInt();
    	System.out.println("the prime numbers till "+num+" are ~");    
		for(i=2; i<=num; i++)
    	{
        	c=0;
        	for(j=1; j<=i; j++)
        	{
        	    if(i%j==0)
        	    {
        	        c++;
        	    }
        	}
        	if(c==2)
       		{
        		System.out.print(i+" ");
        	}
    	}
	}
}
