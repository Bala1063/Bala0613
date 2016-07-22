

public class StringKeyTwo {
	public static String key(String Input1) {
		String[] str1 = Input1.split(" ");
		String str2 = "";
		for (int i = 0; i < str1.length; i++) {
			char key = ' ';
			int keyIndex = 0;
			for (int j = str1[i].length() - 1; j >= 0; j--) {
				if (Character.isLetter(str1[i].charAt(j))) {
					key = str1[i].charAt(j);
					keyIndex = j;
					break;
				}
			}
			for (int k = 0; k < str1[i].length(); k++) {
				int x = 0;
				if (Character.isUpperCase(key)) {
					x = (int) key - 64;
				} else if (Character.isLowerCase(key)) {
					x = (int) key - 96;
				}
				
					if (!(Character.isLetter(str1[i].charAt(k)))) {
						str2 += str1[i].charAt(k);
					} 
					else if(keyIndex==k)
					{
						str2 += str1[i].charAt(k);
					}
						else if (Character.isUpperCase(str1[i].charAt(k))) {
						int y = (int) str1[i].charAt(k);
						int z = y - x;
						int l = (y - 64) - x;
						if (l < 1) {
							z = z + 26;
						}
						str2 += (char) z;
					} else if (Character.isLowerCase(str1[i].charAt(k))) {
						int y = (int) str1[i].charAt(k);
						int z = y - x;
						int l = (y - 96) - x;
						if (l < 1) {
							z = z + 26;
						}
						str2 += (char) z;
					}
				
			}
			str2 += " ";
		}
		return str2;
	}

	public static void main(String[] args) {
		System.out.println(key("Engineering"));

	}

}
