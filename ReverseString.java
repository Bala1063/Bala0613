

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String to reverse:");
		String str = s.next();
		StringBuffer buffer = new StringBuffer(str);
		System.out.println("the reversed string:" + buffer.reverse());

	}

}
