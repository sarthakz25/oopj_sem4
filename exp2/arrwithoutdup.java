package exp2;

import java.util.*;

class arrdup
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
	private void dupArr()
	{
		int index = 0;
		this.b = new int[this.n];
		for(int i=0; i<this.n; i++)
		{
			boolean flag = true;
			for(int j=0; j<index; j++)
			{
				if(a[i]==b[j])
				{
					flag = false;
				}
			}
			if(flag)
			{
				b[index++] = a[i];
			}
		}
		System.out.println("the elements without duplication are:");
		for(int i=0; i<=index; i++) 
		{
            System.out.print(b[i]+" ");
        }
	}
	public void display()
	{
		this.inputArr();
		this.dupArr();
	}
}

public class arrwithoutdup
{
	public static void main(String[] args)
	{
		arrdup ad = new arrdup();
		ad.display();
	}
}
