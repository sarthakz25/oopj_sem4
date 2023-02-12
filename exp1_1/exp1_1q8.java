package exp1_1;

import java.util.*;

public class exp1_1q8 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
        System.out.println("choose a letter from VIBGYOR");
        System.out.print("enter your choice ~ ");
        System.out.println("enter '0' to exit");
        char ch = in.next().charAt(0);
        switch(ch) 
        {
        	case 'V':
                System.out.println("Violet");
                break;
            case 'I':
                System.out.println("Indigo");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'R':
                System.out.println("Red");
                break;
            case '0':
            	System.out.println("bye-bye");
            	System.exit(0);
            default:
                System.out.println("incorrect choice!\nplease try again :)");
        }
	}
}
