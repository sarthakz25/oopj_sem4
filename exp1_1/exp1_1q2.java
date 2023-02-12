package exp1_1;

import java.util.*;

public class exp1_1q2 
{
	public static void main(String[] args)
	{
		int n, num, digit, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		num = sc.nextInt();
		n = num;
		while(n>0)
		{
			digit = n%10;
			sum += digit;
			n = n/10;
		}
		System.out.println("sum of the digits of "+num+" is "+sum);
	}
}
