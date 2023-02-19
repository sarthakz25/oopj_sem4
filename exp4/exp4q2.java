package exp4;

import java.util.*;

class CE_Scores
{
	int numbers[][];
	Scanner sc;
	CE_Scores() 
	{
		this.numbers = new int[6][2];
		sc = new Scanner(System.in);
		for(int i=0; i<6; i++) 
		{
			System.out.print("enter the subject code: ");
			this.numbers[i][0] = sc.nextInt();
			System.out.print("enter the subject marks: ");
			this.numbers[i][1] = sc.nextInt();
		}
		sc.close();
	}
	public int point(int marks) 
	{
		if(marks >= 90) 
		{
			return 1;
		}
		else if(marks >= 80) 
		{
			return 2;
		}
		else if(marks >= 70) 
		{
			return 3;
		}
		else if(marks >= 60) 
		{
			return 4;
		}
		else if(marks >= 50) 
		{
			return 5;
		}
		else if(marks >= 40) 
		{
			return 6;
		}
		else 
		{
			return 7;
		}
	}
}

class Best_Four extends CE_Scores
{
	int points[];
	Best_Four() 
	{
		super();
		this.points = new int[6];
	}
	void calculatePoints() 
	{
		for(int i=0; i<6; i++) 
		{
			points[i] = point(numbers[i][1]);
		}
	}
	void sortPoints() 
	{
		for(int i=0; i<6; i++) 
		{
			for(int j=0; j<6; j++) 
			{
				if(points[i] < points[j]) 
				{
					int temp = points[i];
					points[i] = points[j];
					points[j] = temp;
					temp = numbers[i][0];
					numbers[i][0] = numbers[j][0];
					numbers[j][0] = temp;
					temp = numbers[i][1];
					numbers[i][1] = numbers[j][1];
					numbers[j][1] = temp;
				}
			}
		}
	}
	void bestSubjects() 
	{
		calculatePoints();
		sortPoints();
		System.out.println("subject Code\tsubject marks\tpoints");
		for(int i = 0; i < 4; i++) 
		{
			System.out.println(numbers[i][0]+"\t\t"+numbers[i][1]+"\t\t"+points[i]);
		}
	}
}
public class exp4q2 
{
	public static void main(String args[]) 
	{
		Best_Four bof = new Best_Four();
		bof.bestSubjects();
	}
}
