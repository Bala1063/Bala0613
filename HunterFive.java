import java.util.ArrayList;
import java.util.Scanner;

public class HunterFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Enter the Number");
		String str=s.next();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			result+=(char)(str.charAt(i)+48);
	    }
		list.add(result);
		result="";
		for(int i=0;i<str.length()-2;i++)
		{
			for(int k=0;k<i;k++)
			{
				result+=(char)(str.charAt(k)+48);
			}
			result+=(char)(Integer.parseInt((str.charAt(i)-48)+""+(str.charAt(i+1)-48))+96);
			
			for(int k=i+2;k<str.length()-1;k++)
				result+=(char)(str.charAt(k)+48);
			result+=(char)(str.charAt(str.length()-1)+48);
			list.add(result);
			result="";
		}
		if((str.length()-1)%2==0)
		{
			for(int i=0;i<str.length()-2;i=i+2)
			{
				result+=(char)(Integer.parseInt(str.substring(i,i+2))+96);
				
			}
			result+=(char)(str.charAt(str.length()-1)+48);
			list.add(result);
		}
	
      System.out.println(list.size());
	}

}
