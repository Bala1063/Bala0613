import java.util.Scanner;

public class ActivitySix {

	public static void main(String[] args) {
		String str = "";int count=0;
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		StringBuffer str1 = new StringBuffer(str);
		for (int i = 0; i < str.length(); i++)
			for (int j = i+1; j < str1.length(); j++) {
				if (str.charAt(i) == str1.charAt(j)) {
					str1 = str1.deleteCharAt(j);
					count++;
					j--;
				}
			}
		System.out.println("Output:"+str1+ ""+count);
	}

}
