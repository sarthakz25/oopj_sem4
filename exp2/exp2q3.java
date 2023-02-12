package exp2;

import java.util.*;

public class exp2q3 
{
	void rpls(int num1, int num2)
	{
		int i, j, arr1[], arr2[], temp;
		Scanner sc = new Scanner(System.in);
		arr1 = new int[num1];
		arr2 = new int[num2];
		for(i=0; i<num1; i++)
		{
			System.out.print("enter element '"+(i+1)+"' of the array 1: ");
			arr1[i] = sc.nextInt();
		}
		System.out.println("the array 1 elements are ~");
		for(i=0; i<num1; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(i=0; i<num2; i++)
		{
			System.out.print("enter element '"+(i+1)+"' of the array 2: ");
			arr2[i] = sc.nextInt();
		}
		System.out.println("the array 2 elements are ~");
		for(i=0; i<num2; i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
		sc.close();
	}
	public static void main(String[] args)
	{
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		exp2q3 z=new exp2q3();
        System.out.print("enter the number of elements to store in array 1: ");
		n1 = sc.nextInt();
		System.out.print("enter the number of elements to store in array 2: ");
		n2 = sc.nextInt();
		z.rpls(n1,n2);
		sc.close();
	}
}
