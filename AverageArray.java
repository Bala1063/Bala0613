import java.util.Scanner;

public class AverageArray{

	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	   System.out.println("Enter the Number");
	   int x=s.nextInt();
	   String y=x+"";int z=0;
	   int[] arr=new int[y.length()];
	   while(x!=0)
	   {
		   arr[z++]=x%10;
		   x=x/10;
	   }
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]>arr[j])
			   {
				   int temp=arr[j];
				   arr[j]=arr[i];
				   arr[i]=temp;
			   }
		   }
	   }
		System.out.println(arr[0]+""+arr[1]);
	}

}
