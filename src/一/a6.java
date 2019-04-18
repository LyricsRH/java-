package 一;

import java.util.Scanner;

public class a6 {

	public static final int StopW = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
	      System.out.println("输入整数，输入0停止，并弹出最大值");
	      System.out.print("?");
	      int b;
	      int max=StopW;
	      int secondMax=StopW;
	      while((b=scan.nextInt())!=StopW)
	      {
	    	  System.out.print("?");
	    	  if (b>=max) {
				  secondMax=max;
	    		  max=b;
			}  
	      }
	      System.out.println("最大值="+max);
	      System.out.println("第二大值="+secondMax);
	      
		
	}

}
