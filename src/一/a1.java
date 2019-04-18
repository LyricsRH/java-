package 一;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;


public class a1 {
	
	public static final int StopW=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("输入整数，输入0停止，并弹出最大值");
      System.out.print("?");
      int b;
      int max=StopW;
      while((b=scan.nextInt())!=StopW)
      {
    	  System.out.print("?");
    	  if (b>=max) {
			max=b;
		}  
      }
      System.out.println("最大值="+max);
      
	
		
	}

}
