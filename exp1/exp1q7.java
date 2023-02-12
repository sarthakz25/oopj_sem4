package exp1;

import java.util.*;

public class exp1q7 
{
	public static void main(String[] args)
	{
		int num1, num2, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number:");
		num1 = sc.nextInt();
        System.out.println("enter 2nd number:");
        num2 = sc.nextInt();
        System.out.println("before swap ~");
        System.out.println("first number -> "+num1);
        System.out.println("second number -> "+num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swap ~");
        System.out.println("first number -> "+num1);
        System.out.println("second number -> "+num2);
	}
}
