package exp1_1;

import java.util.*;

public class exp1_1q9 
{
	public static void main(String[] args)
	{
		int n, num, evenc = 0, evens = 0,oddc = 0, odds = 0, avgeven, avgodd;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		num = sc.nextInt();
		n = num;
        while(n>0) 
        {  
             if(n%2 == 0) 
             {  
                  evenc++;  
                  evens += n;  
             } 
             else 
             {  
                  oddc++;  
                  odds += n;  
             }  
             n--;  
        }
        avgeven = evens/evenc;  
        avgodd = odds/oddc;  
        System.out.println("the average of even numbers till "+num+" is " + avgeven);  
        System.out.println("the average of odd numbers till "+num+" is " + avgodd);  
	}
}
