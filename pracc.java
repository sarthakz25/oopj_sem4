package oopjprograms;

import java.util.*;

class array 
{
	int a[], b[], n;
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
	private void copyArr()
	{
		this.b = new int[this.n];
		for(int i=0; i<this.n; i++)
		{
			this.b[i] = this.a[i];
		}
	}
	public void dispArr()
	{
		this.inputArr();
		this.copyArr();
		System.out.println("the first array is ~");
        for(int i=0; i<this.n; i++) 
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("the second array is ~");
        for(int i=0; i<this.n; i++) 
        {
            System.out.print(b[i] + " ");
        } 

	}
}
public class pracc
{
	public static void main(String[] args)
	{
		array arr = new array();
		arr.dispArr();
	}
}