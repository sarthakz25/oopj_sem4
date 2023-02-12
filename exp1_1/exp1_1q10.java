package exp1_1;

import java.util.*;

public class exp1_1q10 
{
	public static void main(String[] args)
	{
		char ch;
		float f;
		String str;
		double d;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a character: ");
		ch = sc.next().charAt(0);
		System.out.print("enter a float number: ");
		f = sc.nextFloat();
		sc.nextLine(); //this line is used to consume the \n character
		System.out.print("enter a string: ");
		str = sc.nextLine();
		System.out.print("enter a double number: ");
		d = sc.nextDouble();
		System.out.println("entered character -> "+ch);
		System.out.println("entered float number -> "+f);
		System.out.println("entered string -> "+str);
		System.out.println("entered double number -> "+d);
	}
}
