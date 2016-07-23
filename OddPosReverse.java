public class OddPosReverse {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		 String[]  str1=str.split(" ");
		 String str2="";
		 for(int i=0;i<str1.length;i++)
		 {
			 if(i%2==0)
			 {
				 StringBuffer buffer=new StringBuffer(str1[i]);
				str1[i]=buffer.reverse().toString();
				str2+=str1[i]+" ";
			 }
			 else
				 str2+=str1[i]+" ";
		 }
		 System.out.println(str2);
		 
		 
		
		
		

	}

}
