package Èý;

import java.util.Scanner;

public class c15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Scanner scanner=new Scanner(System.in);
	
	   while(true){
		System.out.print("Enter the shift number:   ");
		int shift=scanner.nextInt(); scanner.nextLine();
	    System.out.print("Enter a message:  ");
		String str=scanner.nextLine();
		System.out.println("Encode  message:   "+new c15().encodeCaesarCipher(str, shift));
	}
	}
	
	
	public String encodeCaesarCipher(String str,int shift)
	{
		int len=str.length();
		String resultString="";
		for (int i = 0; i < len; i++) {
			if (Character.isLetter(str.charAt(i))) {
				resultString+=moveAlp(str.charAt(i), shift);
			}else {
				resultString+=str.charAt(i);
			}
		}
		return resultString;
	}
	
	public char moveAlp(char c,int shift)
	{
		int num=0,isUP=0;
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		int len=alphabet.length();
		if (Character.isUpperCase(c)) {
			c=Character.toLowerCase(c);
			isUP=1;
		}
		
		while(alphabet.charAt(num)!=c)
		{
			num++;
		}
        
		char result =alphabet.charAt((len+num+shift)%len);
		
        if (isUP==1) {
			return Character.toUpperCase(result);
		}else {
			return result;
		}
	}

}
