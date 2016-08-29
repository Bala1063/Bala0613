public class RepeatOne {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    String str="";
    int[] arr={1,2,6,9,9,1,3,6,2};
    for(int i=0;i<arr.length;i++)
    {if(!str.contains(arr[i]+""))
    {str+=arr[i];int count=0;
    	for(int j=i+1;j<arr.length;j++)
    	{
    		if(arr[i]==arr[j])
    		{
    			count++;
    		}
    	}
    	if(count>0 )
    	{
    		System.out.println(arr[i]);
    		break;
    	}
    
	}}
	}

}
