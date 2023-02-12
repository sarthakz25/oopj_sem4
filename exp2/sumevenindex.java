package exp2;

import java.util.*;

class sumeven
{
	int a[], n;
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
	private int sumArr()
	{
		int sum = 0;
		for(int i=0; i<this.n; i++)
		{
			sum += this.a[i];
		}
		return sum;
	}
	private void evenArrIndex()
	{
		for(int i=1; i<this.n; i+=2)
		{
			System.out.println("the array element at index '"+(i+1)+"' is "+a[i]);
		}
	}
	public void display()
	{
		this.inputArr();
		System.out.println("the array elements are:");
		for(int i=0; i<this.n; i++)
		{
			System.out.print(this.a[i]+" ");
		}
		System.out.println();
		System.out.println("the sum of all elements in the array -> "+this.sumArr());
		System.out.println("the array elements are even indexes are ~ ");
		this.evenArrIndex();
	}
}
public class sumevenindex
{
	public static void main(String[] args)
	{
		sumeven se = new sumeven();
		se.display();
	}
}
