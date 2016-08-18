public class Guvi {

	public static void main(String[] args) {
	
     
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		String result="";
		for(int i=0;i<str.length()-1;i++)
		{
			int x=str.charAt(i+1)-str.charAt(i);
			if(x>0)
			{
			 result=str.substring(i+1);
			 break;
			}
		}
		if(result.length()==0)
		{
			System.out.println("there is no lexicographical substring");
		}
		else
		{
			System.out.println("the longest lexicographical substring is:"+result);
		}
	}

}
