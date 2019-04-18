package ËÄ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream inp=new FileInputStream(new File("a.txt"));
			FileOutputStream ops=new FileOutputStream(new File("b.txt"));
			new D5().inout3(inp, ops);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void inout3(InputStream inp,OutputStream ops) 
	{
		try {
			while(true){
				int c=inp.read();
				if (c==-1) break;
			    if (c=='-') {
					int num=0;
					while(c!='|'){
						num++;
						c=inp.read();
					}
					c=inp.read();
					for (int i = 0; i <=num; i++) {
						ops.write(' ');
					}
				}
			    ops.write(c);
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
	
	
	
	
	
	public void inout2(InputStream inp,OutputStream ops,char k) 
	{
		try {
			while(true){
				int c=inp.read();
				if (c==-1) break;
				if(c!=k){
				ops.write(c);}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	public void inout(InputStream inp,OutputStream ops)
	{
		try {
			byte[] data=new byte[1024];
			int length=-1;
			while((length=inp.read(data))!=-1){
				ops.write(data, 0, length);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("a");
		}
	}
}
