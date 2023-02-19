package exp4;

import java.util.*;

class Employee 
{
	int empc;
	double bpay;
	Employee() 
	{
		this.empc = 0;
		this.bpay = 0.0;
	}
	Employee(int c, double b) 
	{
		this.empc = c;
		this.bpay = b;
	}
	void display() 
	{
		System.out.println("employee details ~");
		System.out.println("employee code -> "+this.empc);
		System.out.println("employee basic salary -> "+this.bpay);
	}
}
class Overtime extends Employee 
{
	int nd;
	float rate;
	Overtime(int n, float r, int c, double b) 
	{
		super(c, b);
		this.nd = n;
		this.rate = r;
	}
	double calculate() 
	{
		return this.bpay+(this.nd*this.rate);
	}
	void show() 
	{
		this.display();
		System.out.println("gross Salary -> "+this.calculate());
	}
}

public class exp4q4 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the employee code: ");
		int c = sc.nextInt();
		System.out.print("enter the employee basic salary: ");
		double b = sc.nextDouble();
		System.out.print("enter the employee overtime hours: ");
		int n = sc.nextInt();
		System.out.print("enter the overtime rate per hour: ");
		float r = sc.nextFloat();
		Overtime o = new Overtime(n, r, c, b);
		o.show();
		sc.close();
	}
}
