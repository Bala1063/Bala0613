

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int reverse=0;
		while(n!=0)
		{int y=n%10;
		reverse=reverse*10+y;
		n=n/10;
			
		}
System.out.println(reverse);
	}

}
