import java.util.*;
import java.util.regex.*;
import java.io.*;
import java.lang.*;

public class ClientSide
{
	public static void main(String[] args) 
	{
		name();
		gender();
		age();
		phone();
		email();
	}

	public static void name()
	{
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.print("Enter your Name : ");
			while (!in.hasNext("[A-Za-z]+")) 
			{
				System.out.print("\nPlease Enter Valid name only : ");
				in.next();
			}
      		String uname = in.next();
      		System.out.println("Your name is : " + uname);
      		System.out.println();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void gender()
	{
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.print("Enter your Gender : ");
			String regex = "MALE|FEMALE|OTHER";
      		String gen = in.nextLine();
      		gen = gen.toUpperCase();
      		Pattern p = Pattern.compile(regex);
      		Matcher m = p.matcher(gen);
      		if(m.matches()) 
      		{
      		   System.out.println("Your Gender is : " + gen);
      		   System.out.println();
      		} 
      		else 
      		{
      		   System.out.print("\nPlease Enter Valid gender only.\n male/female/other only.\n\n");      		   
      		   gender();
      		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void age()
	{
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.print("Enter your Age : ");
      		while(!in.hasNextInt())
			{
				System.out.print("\nPlease Enter Valid age only : ");
				in.next();
			}
			int age = in.nextInt();
			if (age>=20 && age<=60)
			{
				System.out.println("Your age is " + age + " and you are allowed to register for the company services.\n");
			}
			else
			{
				System.out.println("Your age is " + age + " and you are not allowed to register for the company services.");
				System.out.println("Eligibility is between 20 and 60 only.\n");
				age();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void phone()
	{
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.print("Enter your Mobile Number : ");
			String mobile = in.nextLine();
			Pattern p = Pattern.compile("(0/91)?[6-9][0-9]{9}");
			Matcher m = p.matcher(mobile);
			boolean check = m.find() && m.group().equals(mobile);
			if (check)
			{
        		System.out.println("Your Mobile Number is : " + mobile);
        		System.out.println();    
			}
    		else
    		{
        		System.out.println("Invalid Number");
        		phone();
    		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void email()
	{
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.print("Enter your Email Address : ");
			String emailid = in.nextLine();
			String regex = "^(.+)@(.+)$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(emailid);
			if(m.matches()) 
      		{
      		   System.out.println("Your Email Address is : " + emailid);
      		   System.out.println();
      		} 
      		else 
      		{
      		   System.out.print("\nPlease Enter Valid email only.\n");      		   
      		   email();
      		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}