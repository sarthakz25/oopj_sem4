package oopjprograms;

import java.util.*;

public class exp1q6 
{
	public static void main(String[] args)
	{
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		num1 = sc.nextDouble();
		System.out.print("enter the second number: ");
		num2 = sc.nextDouble();
		System.out.println("select an operation from the following ~");
		System.out.println("1) addition\n2) subtraction\n3) multiplication\n4) division\n5) exit");
	    char ch = sc.next().charAt(0);
	    switch(ch) 
	    {
	    	case '1':
	        System.out.println("the sum of "+num1+" and "+num2+" is "+(num1+num2));
	        break;
	        case '2':
	        System.out.println("the difference between "+num1+" and "+num2+" is "+(num1-num2));
	        break;
	        case '3':
	        System.out.println("the product of "+num1+" and "+num2+" is "+(num1*num2));
	        break;
	        case '4':
	        System.out.println("the division of "+num1+" and "+num2+" is "+(num1/num2));
	        break;
	        case '5':
		    break;
	        default:
	        System.out.println("invalid input!\nplease try again :)");
	    }
	}
}
