package exp1_1;

import java.util.*;

public class exp1_1q1 
{
	public static void main(String[] args)
	{
		int i, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upto which number to print even numbers:");
		num = sc.nextInt();
		for(i=0; i<=num; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
