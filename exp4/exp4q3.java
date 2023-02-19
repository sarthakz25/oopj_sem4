package exp4;

import java.util.*;

class Teacher 
{
	String name[], dob[], doj[];
	Scanner sc;
	Teacher() 
	{
		sc = new Scanner(System.in);
		this.name = new String[5];
		this.dob = new String[5];
		this.doj = new String[5];
	}
	void getData() 
	{
		System.out.println("input teacher details ~");
		for(int i=0; i<5; i++) 
		{
			System.out.println("teacher-"+(i+1));
			System.out.print("name: ");
			this.name[i] = sc.nextLine();
			System.out.print("date of birth: ");
			this.dob[i] = sc.nextLine();
			System.out.print("date of joining: ");
			this.doj[i] = sc.nextLine();
		}
	}
	void show_getData() 
	{
		for(int i = 0; i < 5; i++) 
		{
			System.out.println("teacher-"+(i+1));
			System.out.println("name -> " +this.name[i]);
			System.out.println("date of birth -> "+this.dob[i]);
			System.out.println("date of joining -> "+this.doj[i]);
		}
	}
}
class Principal extends Teacher 
{
	Principal() 
	{
		super();
	}
	void sortData() 
	{
		for(int i=0; i<5; i++) 
		{
			for(int j=0; j<(5-i-1); j++) 
			{
				if(this.name[j].compareToIgnoreCase(this.name[j + 1]) > 0) 
				{
					String temp = this.name[j];
					this.name[j] = this.name[j+1];
					this.name[j+1] = temp;
					temp = this.dob[j];
					this.dob[j] = this.dob[j+1];
					this.dob[j+1] = temp;
					temp = this.doj[j];
					this.doj[j] = this.doj[j+1];
					this.doj[j+1] = temp;
				}
			}
		}
	}
	void display() 
	{
		for(int i=0; i<5; i++) 
		{
			System.out.println("teacher-"+(i+1));
			System.out.println("name -> " +this.name[i]);
			System.out.println("date of birth -> "+this.dob[i]);
			System.out.println("date of joining -> "+this.doj[i]);
		}
	}
	void searchData(String key) 
	{
		for(int i=0; i<5; i++) 
		{
			if(this.name[i].equalsIgnoreCase(key)) 
			{
				System.out.println(key+" found at - "+(i+1));
				return;
			}
		}
		System.out.println(key+" not found!");
	}
}
public class exp4q3 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		Principal p = new Principal();
		p.getData();
		p.show_getData();
		p.sortData();
		while(true) 
		{
			System.out.println("1) display the sorted data");
			System.out.println("2) search using teacher name");
			System.out.println("3) exit");
			System.out.print("enter a choice: ");
			int ch = Integer.parseInt(sc.nextLine());
			if(ch == 1) 
			{
				p.display();
			}
			else if(ch == 2) 
			{
				System.out.print("enter the teacher name to search: ");
				String key = sc.nextLine();
				p.searchData(key);
			}
			else if(ch == 3) 
			{
				break;
			}
			else 
			{
				System.out.println("invalid choice!");
			}
		}
		sc.close();
	}
}
