package һ;

import java.util.Scanner;

public class a6 {

	public static final int StopW = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
	      System.out.println("��������������0ֹͣ�����������ֵ");
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
	      System.out.println("���ֵ="+max);
	      System.out.println("�ڶ���ֵ="+secondMax);
	      
		
	}

}
