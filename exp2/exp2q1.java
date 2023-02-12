package exp2;

import java.util.*;

public class exp2q1 
{
	void rpsd(int num)
	{
		int i, arr[], sum = 0;
		Scanner sc = new Scanner(System.in);
		arr = new int[num];
		for(i=0; i<num; i++)
		{
			System.out.print("enter element '"+(i+1)+"' of the array: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("the array elements are ~");
		for(i=0; i<num; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nsum of the elements of the array -> "+sum);
		System.out.println("the array elements are even indexes are ~ ");
		for(i=1; i<arr.length; i+=2)
		{
			System.out.println("the array element at index '"+(i+1)+"' is "+arr[i]);
		}
		sc.close();
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		exp2q1 z=new exp2q1();
        System.out.print("enter the number of elements to store: ");
		n = sc.nextInt();
		z.rpsd(n);
		sc.close();
	}
}
