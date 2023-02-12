package exp2;

import java.util.*;

class search
{
	int a[], n;
	Scanner sc;
	search()
	{
		sc = new Scanner(System.in);
	}
	private void inputArr()
	{
		System.out.print("enter number of elements in the array: ");
        this.n = sc.nextInt();
        System.out.println("enter the array elements:");
        this.a = new int[this.n];
        for(int i=0; i<this.n; i++)
        {
        	System.out.print("a[" + (i + 1) + "]: ");
            this.a[i] = sc.nextInt();
        }
	}
	private void searchArr()
	{
		System.out.print("enter an element to search: ");
		int ele = sc.nextInt();
		boolean flag = true;
		for(int i=0; i<this.n; i++) 
		{
            if(this.a[i] == ele) 
            {
                System.out.println("element '"+ele+"' was found at position '"+(i+1)+"'");
                flag = false;
            }
        }
        if(flag) 
        {
            System.out.println("element '"+ele+"' was not found!");
        }
	}
	public void display()
	{
		this.inputArr();
		this.searchArr();
	}
}

public class searcharr
{
	public static void main(String[] args)
	{
		search s = new search();
		s.display();
	}
}
