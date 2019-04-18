package ËÄ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 System.out.println(new D1().findLongest());
	}
	
	String findLongest()
	{
		int lenB=0;
		String finalString="";
		try {
			BufferedReader brReader=new BufferedReader(new FileReader("ÎÄ¼þ.txt"));
			
			while(true){
			String lineString=brReader.readLine();
			if (lineString==null) break;
			int lenN=lineString.length();
			if (lenN>lenB) {
				lenB=lenN;
				finalString=lineString;
			}
			}
			return finalString;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e.toString());
		}
	}
	

}
