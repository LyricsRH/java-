package Èý;

import java.util.Scanner;

public class c13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.println("write a sentence");
			String string=scanner.nextLine();
			System.out.println(new c13().PigLatin(string));
		}
	}
	
	public String PigLatin(String str)
	{
		String result="";
		String word="";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				word=word+str.charAt(i);
			}else {if (!word.isEmpty()) {
				result=result+transLetter(word)+str.charAt(i);
				word="";
			} else {
				result =result+str.charAt(i);
			}}
		}
		return result;
	}
	
	
	
	public String transLetter(String str)
	{
		if (!isContain(str)) {
			return str;
		}else if (isYuanyin(str.charAt(0))) {
			return str+"way";
		}else {
			int i=0;
			while(!isYuanyin(str.charAt(i)))
			{
				i++;
			}
			String s1=str.substring(0, i);
			String s2=str.substring(i+1);
			char c=str.charAt(i);
			String fString=s2+s1+"ay";
			fString=fString.toLowerCase();
			if (Character.isUpperCase(str.charAt(0))) {
				c=Character.toUpperCase(c);
				return c+fString;
			}else {
				return c+fString;
			}
		}
		
	}
	
	public boolean isContain(String str)
	{
		for (int i = 0; i <str.length(); i++) {
			if (isYuanyin(str.charAt(i))) {
				return true;
			}
		}
		return false;
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
