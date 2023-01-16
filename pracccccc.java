package oopjprograms;

import java.util.*;

class areyyy 
{
	int a[], n, max;
	private void inputArr()
	{
		Scanner sc = new Scanner(System.in);
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
	private int largestEle()
	{
		max = 0;
		int index = 0;
		for(int i=0; i<this.n; i++)
		{
			if(this.a[i]>max)
			{
				max = this.a[i];
				index = i;
			}
		}
		this.a[index] = 0;
		return max;
	}
	private int smallestEle()
	{
		int min = max;
		for(int i=0; i<this.n; i++) 
		{
            if(this.a[i]<min) 
            {
                min = this.a[i];
            }
        }
        return min;
	}
	public void display()
	{
		this.inputArr();
        System.out.println("the largest element of the array -> "+this.largestEle());
        System.out.println("the second largest element of the array -> "+this.largestEle());
        System.out.println("the smallest element of the array -> "+this.smallestEle());
	}
}

public class pracccccc
{
	public static void main(String[] args)
	{
		areyyy z = new areyyy();
        z.display();
	}
}
