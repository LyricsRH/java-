package Èý;

import java.util.Scanner;

public class c16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner( System.in);
		while(true)
		{
			System.out.print("Enter a codeKey for 26 numbers:   ");
			String codekey=scanner.nextLine();
			System.out.print("Enter a secreat message:  ");
			String str=scanner.nextLine();
			System.out.println("Encoded message:  "+new c16().condeSelf(str, codekey));
		}
	}
	
	public String condeSelf(String str,String codeKey)
	{
		String resultString="";
		int len=str.length();
		int codelen=codeKey.length();
		for (int i = 0; i < len; i++) {
			char t=str.charAt(i);
			if (Character.isLetter(t)) {
				resultString+=changeAlp(t, codeKey);
			}else {
				resultString+=t;
			}
		}
		return resultString;
	}
	
	public char changeAlp(char c,String str)
	{
		//String codeString="QWERTYUIOPASDFGHJKLZXCVBNM";
		String alpabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int num=0;
		while(alpabet.charAt(num)!=c)
		{
			num++;
		}
		return str.charAt(num);
	}

}
