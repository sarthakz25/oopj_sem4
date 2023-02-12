package exp2;

import java.util.*;

public class exp2q2 
{
	void rpls(int num)
	{
		int i, j, arr[], temp;
		Scanner sc = new Scanner(System.in);
		arr = new int[num];
		for(i=0; i<num; i++)
		{
			System.out.print("enter element '"+(i+1)+"' of the array: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("the array elements are ~");
		for(i=0; i<num; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(i=0; i<num; i++)
        {
            for(j=i+1; j<num; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		System.out.println("\nlargest element of the array -> "+arr[0]);
        System.out.println("second largest element of the array -> "+arr[1]);
        System.out.println("second smallest element of the array -> "+arr[num-2]);
		sc.close();
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		exp2q2 z=new exp2q2();
        System.out.print("enter the number of elements to store: ");
		n = sc.nextInt();
		z.rpls(n);
		sc.close();
	}
}
