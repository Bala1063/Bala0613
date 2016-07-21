import java.util.Scanner;

public class Isomorphic {
public boolean isIsomorphic(String str1,String str2)
{int count=0;
if(str1.length()!=str2.length())
	return false;
else{
	for (int i = 1; i < str1.length(); i++) {
	
	if (str1.charAt(i) == str1.charAt(i-1)) {
		if (str2.charAt(i) == str2.charAt(i-1)) {
                      count++;     
		}
	}
	else if(str1.charAt(i)!=str1.charAt(i-1))
	{
		if(str2.charAt(i)!=str2.charAt(i-1))
		{
			count++;
		}
	}
}

if (count==str1.length()-1)
 return true;
else 
 return false;}
}

	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the two string");
		String x = s.next();
		String y = s.next();
		Isomorphic isomorphic=new Isomorphic();
		System.out.println(isomorphic.isIsomorphic(x, y));
		
}
}
