package oopjprograms;

import java.util.*;

public class exp1q5 
{
	public static void main(String[] args)
	{
		int i, num, arr[], tot = 0, avg = 0, max;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of subjects: ");
		num = sc.nextInt();
		arr = new int[num];
		for(i=0; i<num; i++)
		{
			System.out.println("enter marks scored in subject "+(i+1)+":");
			arr[i] = sc.nextInt();
			tot += arr[i];
		}
		max = num*100;
		avg = tot/num;
		System.out.println("the total marks in "+num+" subjects is "+tot+" out of "+max);
		System.out.println("the average marks of "+num+" subjects is "+avg+" out of "+(max/num));
	}
}
