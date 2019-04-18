package Èý;

import java.util.Scanner;

public class c14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter a word: ");
			String string=scanner.nextLine();
			if (string.isEmpty()) break;
			String transString=new c14().Obenglobish(string);
			System.out.println(transString);
		}
	}

	public String Obenglobish(String str)
	{
		int len=str.length();
		String result="";
		for (int i = 0; i < len; i++) {
			if (!isYuanyin(str.charAt(i))) {
				result+=str.charAt(i);
			}else if (i<=(len-2)) {
				if (isYuanyin(str.charAt(i+1))) {
					result+=str.charAt(i);
				}else {
					result+="ob"+str.charAt(i);
				}
			}else {
				if (str.charAt(i)=='e') {
					result+=str.charAt(i);
				}else {
					result+="ob"+str.charAt(i);
				}
			}
		}
		return result;
		
		
	}
	
	public boolean isYuanyin(char c)
	{
		switch (c) {
		case 'a':case 'e':case 'i':case 'o':case 'u':
		case 'A':case 'E':case 'I':case 'O':case 'U':
			return true;

		default:
			return false;
		}
	}
}
