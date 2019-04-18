package ËÄ;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader bReader=new BufferedReader(new FileReader("Lear.txt"));
			int alp=new D2().alphabets(bReader);
			int n=lenthnum(alp);
			System.out.printf("Chars:%10d%n",1535);
			
			BufferedReader bReader2=new BufferedReader(new FileReader("Lear.txt"));
			int words=new D2().words(bReader2);
			System.out.printf("Words:%10d%n", words);
			
			BufferedReader bReader3=new BufferedReader(new FileReader("Lear.txt"));
			int rows=new D2().rows(bReader3);
			System.out.printf("Rows :%10d%n", rows);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static int lenthnum(int num) {
		// TODO Auto-generated method stub
		int count=0; //¼ÆÊý
		while(num>=1) {
		num/=10;
		count++;
		}
		return count;
		}
	

	public int rows(BufferedReader bReader)
	{
		int num=0;
		try {
		   while(true){
			String linString=bReader.readLine();
		    if (linString==null) break;
		    num++;
		   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;	
	}
	
	public int alphabets(BufferedReader bReader)
	{
		int num1=0;
		try {
			while(true){
				int c=bReader.read();
				if (c==-1) break;
//				if (!Character.isWhitespace((char)c)) {
					num1++;
//				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return num1;
		
	}
	
	public int words(BufferedReader bReader){
		int num2=0;
		try {
			while(true){
				String lineString= bReader.readLine();
				if(lineString==null) break;
				Scanner scanner=new Scanner(lineString);
				scanner.useDelimiter(" ");
				while (scanner.hasNext()) {
					num2++;
					scanner.next();
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return num2;
		
	}
	
}
