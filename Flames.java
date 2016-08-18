import java.util.Scanner;

public class Flames {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] flamesExp=new String[]{"Friendship","Love","Affection","Marriage","Enemies","Sibling"};
		System.out.println("Enter name 1");
		String name1=s.next().toLowerCase();
		System.out.println("Enter name 2");
		String name2=s.next().toLowerCase();
		StringBuffer buffer=new StringBuffer(name1);
		StringBuffer buffer2=new StringBuffer(name2);
		String common="";
		for(int i=0;i<buffer.length();i++){
		
			for(int j=0;j<buffer2.length();j++)
			{
				if(buffer.charAt(i)==buffer2.charAt(j))
				{
					common+=buffer2.charAt(j)+"";
					buffer2.deleteCharAt(j);
					j--;
				}
				}
			}
			for(int i=0;i<common.length();i++)
			{
				for(int j=0;j<buffer.length();j++)
				{
					if(common.charAt(i)==buffer.charAt(j))
					{
						buffer.deleteCharAt(j);
						j--;
					}
				}
			}
			String str=buffer.toString()+buffer2.toString();
			int count=str.length();
		StringBuffer flames=new StringBuffer("FLAMES");
	
		while(flames.length()!=1)
		{
			int position=count%flames.length();
			if(position==0)
				position=flames.length();
		flames.deleteCharAt(position-1);
			}
	for(int i=0;i<flamesExp.length;i++)
	{
		if(flames.charAt(0)==flamesExp[i].charAt(0))
		{
			System.out.println(flamesExp[i]);
		}
	}
	}

}
