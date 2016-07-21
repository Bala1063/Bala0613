

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
		System.out.println("Enter the Roman");
		String str = s.next();int sum=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='I')
			{   if(i<str.length()-1){
				if(str.charAt(i+1)=='V'){
					sum+=4;
				i++;
				}
				else if(str.charAt(i+1)=='X')
				{
					sum+=9;
					i++;
					
				}
				else 
				{
					sum+=1;
				}
				}
				else if(i==str.length()-1)
				{
					sum+=1;
				}
			}
			else if(str.charAt(i)=='X')
			{ if(i<str.length()-1){
				if(str.charAt(i+1)=='L'){
					sum+=40;
				i++;
				}
				else if(str.charAt(i+1)=='C')
				{
					sum+=90;
					i++;
					
				}
				else
				{
					sum+=10;
				}
				}
				else if(i==str.length()-1)
				{
					sum+=10;
					
				}
			}
			else if(str.charAt(i)=='L')
			{
				sum+=50;
			}
			else if(str.charAt(i)=='C')
			{ if(i<str.length()-1){
				if(str.charAt(i+1)=='D'){
					sum+=400;
				i++;
				}
				else if(str.charAt(i+1)=='M')
				{
					sum+=900;
					i++;
				
				
				}
				else
				{
					sum+=100;
				}
				}
				else if(i==str.length()-1)
				{
					sum+=100;
				}
			}
			else if(str.charAt(i)=='D')
			{
				sum+=500;
			}
			else if(str.charAt(i)=='M')
			{
				sum+=1000;
			}
			else if(str.charAt(i)=='V')
				sum+=5;
  		}
		System.out.println(sum);
	}

}
