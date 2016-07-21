import java.util.Scanner;

public class CamelCase {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str1=s.nextLine();
		String[] str=str1.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String x=str[i].substring(0,1).toUpperCase();
			
		
			String y=str[i].substring(1,str[i].length()).toLowerCase();
		
			str[i]=x+y;
		}
		String result="";
		for(int i=0;i<str.length;i++)
		{
			result+=str[i]+" ";
		}
     System.out.println(result);
	}

}
