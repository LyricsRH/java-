package Èı;

import java.util.Scanner;

public class c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("²âÊÔÅĞ¶Ï»ØÎÄ");
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter a Sentence: ");
			String inS=scanner.nextLine();
			if (new c11().isSentencePalindrome(inS)) {
				System.out.println("This Sentence Is A Palindrome");
			}else {
				System.out.println("This Sentence Is Not A Palindrome");
			}
		}
	}               
	public boolean isSentencePalindrome(String str)
	{
		String newS="";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				newS+=str.charAt(i);
			}
		}
		newS=newS.toLowerCase();
		for (int i = 0; i < newS.length(); i++) {
			if (newS.charAt(i)!=newS.charAt(newS.length()-i-1)) {
				return false;
			}
		}
		return true;
		
	}

}
