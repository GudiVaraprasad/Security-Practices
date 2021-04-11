import java.util.*;
import java.io.*;
import java.lang.*;

public class InputValidator
{
	public static void main(String args[])
	{
		try 
		{
			Scanner in = new Scanner(System.in);

			// INT DATA TYPE
			System.out.print("Enter an Integer : ");
      while(!in.hasNextInt()) 
			{
				System.out.print("\nPlease Enter Valid Integer only : ");
				in.next();
			}
			int input1 = in.nextInt();
			System.out.println("You entered : " + input1);
			System.out.println();

      // DOUBLE DATA TYPE
			System.out.print("Enter a Decimal : ");
      while(!in.hasNextDouble()) 
			{
				System.out.print("\nPlease Enter Valid Decimal only : ");
				in.next();
			}
			double input2 = in.nextDouble();
			System.out.println("You entered : " + input2);
			System.out.println();

      // STRING DATA TYPE
			System.out.print("Enter a String : ");
			while (!in.hasNext("[A-Za-z]+")) 
			{
        System.out.print("\nPlease Enter Valid String only : ");
        in.next();
      }
      String input3 = in.next();
      System.out.println("You entered : " + input3);
      System.out.println();

      // CAPITAL LETTERS ONLY
      System.out.print("Enter a CAPITAL String : ");
			while (!in.hasNext("[A-Z]+")) 
			{
        System.out.print("\nPlease Enter Valid CAPITAL String only : ");
        in.next();
      }
      String input4 = in.next();
      System.out.println("You entered : " + input4);
      System.out.println();

      // VOTING CRITERIA
      System.out.print("Enter your age : ");
      while(!in.hasNextInt())
			{
				System.out.print("\nPlease Enter Valid Integer only : ");
				in.next();
			}
			int input5 = in.nextInt();
			if (input5<18)
			{
				System.out.println("Your age is " + input5 + " and you not are eligible to vote.");
			}
			else
			{
				System.out.println("Your age is " + input5 + " and you are eligible to vote.");
			}
			System.out.println();
		}
    catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}