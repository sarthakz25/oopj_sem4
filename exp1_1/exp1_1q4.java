package exp1_1;

import java.util.Scanner;

public class exp1_1q4 
{
	public static void main(String[] args)
	{
		int yr;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year:");
		yr = sc.nextInt();
		if(((yr%4 == 0) && (yr%100 != 0)) || (yr%400 == 0))
		{
	        System.out.println(yr+" is a leap year");
		}
	    else
	    {
	    	System.out.println(yr+" is not a leap year");
	    }
	}
}
