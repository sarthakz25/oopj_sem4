package exp4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class student 
{
	private String name, dob;
	private int roll;
	BufferedReader br;
	student() 
	{
		this.name = "";
		this.dob = "";
		this.roll = 0;
	}
	public void inputData() throws IOException
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter the student name: ");
		this.name = br.readLine();
		System.out.print("enter the date of birth of "+this.name+": ");
		this.dob = br.readLine();
		System.out.print("enter the roll number of "+this.name+": ");
		this.roll = Integer.parseInt(br.readLine());
	}
	public void printData() 
	{
		System.out.println("student gradesheet ~");
		System.out.println("name -> " + this.name);
		System.out.println("date of birth -> " + this.dob);
		System.out.println("roll number -> " + this.roll);
	}
}
class marks extends student 
{
	private float p, c, m, cts, e, tot, per;
	private char gd;
	marks() 
	{
		super();
		this.p = 0.0f;
		this.c = 0.0f;
		this.m = 0.0f;
		this.cts = 0.0f;
		this.e = 0.0f;
		this.tot = 0.0f;
		this.per = 0.0f;
		this.gd = '\u0000';
	}
	private void readData() throws IOException
	{
		super.inputData();
		System.out.println("enter the marks in physics:");
		this.p = Float.parseFloat(br.readLine());
		System.out.println("enter the marks in chemistry:");
		this.c = Float.parseFloat(br.readLine());
		System.out.println("enter the marks in mathematics:");
		this.m = Float.parseFloat(br.readLine());
		System.out.println("enter the marks in computer science:");
		this.cts = Float.parseFloat(br.readLine());
		System.out.println("enter the marks in english:");
		this.e = Float.parseFloat(br.readLine());
	}
	private void compute() 
	{
		this.tot = (this.p+this.c+this.m+this.cts+this.e);
		this.per = this.tot/5;
		if(this.per >= 90) 
		{
			this.gd = 'A';
		}
		else if(this.per >= 60 && this.per < 90) 
		{
			this.gd = 'B';
		}
		else if(this.per >= 40 && this.per < 60) 
		{
			this.gd = 'C';
		}
		else
		{
			this.gd = 'D';
		}
	}
	public void showData() 
	{
		try {
            this.readData();
        }
        catch(IOException ie) {
            System.out.print(ie);
        }
		this.compute();
		super.printData();
		System.out.println("physics -> "+this.p);
		System.out.println("chemistry -> "+this.c);
		System.out.println("maths -> "+this.m);
		System.out.println("computer science -> "+this.cts);
		System.out.println("english -> "+this.e);
		System.out.println("total -> "+this.tot);
		System.out.println("percentage -> "+this.per);
		System.out.println("grade -> "+this.gd);
	}
}
public class exp4q1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter the number of students: ");
		int n = Integer.parseInt(br.readLine());
		marks m[] = new marks[n];
		for(int i=0; i<n; i++) 
		{
			m[i] = new marks();
			m[i].showData();
		}
		br.close();
	}
}
