package Guvi;

import java.util.Scanner;

public class binary {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number of elements");
     int n=s.nextInt();
     int[] arr=new int [n];
     int[] count=new int[n];
     for(int i=0;i<arr.length;i++)
    	 arr[i]=s.nextInt();
     for(int i=0;i<arr.length;i++)
     {
    	 String str=""+Integer.toString(arr[i], 2);int count1=0;
    	 for(int j=0;j<str.length();j++)
    	 {
    		 if('1'==str.charAt(j))
    			 count1++;
    	 }
    	 count[i]=count1;
     }
     for(int i=0;i<count.length;i++)
    	 for(int j=i+1;j<count.length;j++)
    	 {
    		 if(count[i]<count[j])
    		 {
    			 int temp=count[j];
    			 count[j]=count[i];
    			 count[i]=temp;
    			 int temp1=arr[j];
    			 arr[j]=arr[i];
    			 arr[i]=temp1;
    		 }
    	 }
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.println(arr[i]);
     }
    		 }

}
