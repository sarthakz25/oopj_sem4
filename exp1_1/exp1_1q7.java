package oopjprograms;

import java.util.*;

public class exp1_1q7 
{
	public static void main(String[] args)
	{
		int i, j, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range of the reversed pyramid:");
		num = sc.nextInt();
		for(i=num; i>0; i--)
		{
			for(j=0; j<i; j++)
			{
				System.out.print((j+1)+" ");
			}
			System.out.println("");
		}
	}
}
