package oopjprograms;

import java.util.*;

public class exp1q12 
{
	void tfvowelornot(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("entered character "+ch+" is a vowel"); 
		}
		else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("entered character "+ch+" is a consonent");
		}
		else
		{
			System.out.println("entered character "+ch+" is not an alphabet!");
		}
	}
	public static void main(String[] args)
	{
		char c;
		Scanner sc=new Scanner(System.in);
		exp1q12 z=new exp1q12();
		System.out.print("enter a character: ");
		c = sc.next().charAt(0);	 		
		z.tfvowelornot(c);
	}
}
