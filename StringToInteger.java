

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String x=s.next();
		try
		{
			int y=Integer.parseInt(x);
			System.out.println(y);
		}
		catch(NumberFormatException e)
		{
			System.out.println("invalid input:");
		}

	}

}
