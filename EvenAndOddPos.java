import java.util.Scanner;

public class EvenAndOddPos {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		StringBuffer  str1=new StringBuffer(str);
		for(int i=0;i<str.length()-1;i++)
		{  if(i%2==0)
		{
			char temp=str1.charAt(i+1);
			str1.setCharAt(i+1, str1.charAt(i));
			str1.setCharAt(i,temp);
			
		}
			
		}
		System.out.println("The swapped string:"+str1);

	}

}
