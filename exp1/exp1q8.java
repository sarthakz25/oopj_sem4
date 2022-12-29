package oopjprograms;

import java.util.*;

public class exp1q8 
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to check: ");
        num = sc.nextInt();
        if(num%2 == 0)
        {
            System.out.println(num+" is an even number");
        }
        else
        {
            System.out.println(num+" is an odd number");
        }
	}
}
