package Èý;

import java.util.Scanner;

public class c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sysin=new Scanner(System.in);
		while(true)
		{System.out.print("Enter a number: ");
		 String  digits=sysin.nextLine();
		 if (digits.isEmpty()) break;
		 System.out.println(new c10().addCommas(digits));
		}
	}
	
	public String addCommas(String digits)
	{
		String finString="";
	    int len=digits.length();
		if (len<=3) {
			return digits;
		}else {
			finString=","+digits.substring(len-3);
			len=len-3;
		}
		
		while(len>3)
		{
			String temString=","+digits.substring(len-3,len);
			finString=temString+finString;
			len-=3;
		}
		return digits.substring(0,len)+finString;
	}

}
