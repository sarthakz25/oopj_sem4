package oopjprograms;

import java.util.*;

class muladdmatrices
{
	int m[][], n[][], rows, cols;
	private void inputMat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of rows: ");
		rows = sc.nextInt();
		System.out.print("enter the number of columns: ");
		cols = sc.nextInt();
		m = new int[this.rows][this.cols];
		n = new int[this.rows][this.cols];
		System.out.println("enter the elements of matrix 1 ~");
		for(int i=0; i<this.rows; i++)
		{
			for(int j=0; j<this.cols; j++)
			{
				System.out.println("m["+(i+1)+"]["+(j+1)+"]: ");
				m[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter the elements of matrix 2 ~");
		for(int i=0; i<this.rows; i++)
		{
			for(int j=0; j<this.cols; j++)
			{
				System.out.println("n["+(i+1)+"]["+(j+1)+"]: ");
				n[i][j] = sc.nextInt();
			}
		}
	}
	private void addMat()
	{
		System.out.println("matrix after addition is ~");
		for(int i=0; i<this.rows; i++)
		{
			for(int j=0; j<this.cols; j++)
			{
				System.out.print((m[i][j]+n[i][j])+" ");
			}
			System.out.println();
		}
	}
	private void mulMat()
	{
		System.out.println("matrix after multiplication is ~");
        for(int i = 0; i < this.rows; i++) 
        {
            for(int j = 0; j < this.cols; j++) 
            {
                int sum = 0;
                for(int k = 0; k < this.cols; k++) 
                {
                    sum += m[i][k] * n[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
	}
	public void display() 
	{
        this.inputMat();
        this.addMat();
        this.mulMat();
    }
}
public class prac
{
	public static void main(String[] args)
	{
		muladdmatrices z = new muladdmatrices();
        z.display();
	}
}
