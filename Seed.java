import java.util.Scanner;

public class Seed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the digit");
	int y=s.nextInt();
	String str=y+"";
	
	String x="1";
	if(str.length()==1)
	{
		System.out.println("No seed for this number");
	}
	else
	{
	for(int i=0;i<str.length()-1;i++)
	{
		x+="0";
	}
	int z=Integer.parseInt(x);int count=0;
	for(int i=z;i<y/2;i++)
	{int mul=i;int a=i;
		while(i!=0)
		{
		 mul*=i%10;
		 i=i/10;
		}i=a;
		if(mul==y){count++;
			System.out.println("the seed of the entered number is "+i);
			break;
		}
		
	}
	if(count==0)
	{
		System.out.println("no seed for the entered number");
	}
	}	

	}

}
