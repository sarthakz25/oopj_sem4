package exp1;

import java.util.*;

public class exp1q2 
{
	public static void main(String[] args)
	{
		int pp, noyr, dep, salv = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the purchase price: ");
		pp = sc.nextInt();
		System.out.print("enter the number of years: ");
		noyr = sc.nextInt();
		System.out.print("enter the depriciation amount: ");
		dep = sc.nextInt();
		salv = pp - (dep*noyr);
		System.out.print("the salvage value corresponding to:\npurchase price -> "
		+pp+"\nnumber of years -> "+noyr+"\ndepreciation amount -> "+dep+"\nis "+salv);
	}
}
