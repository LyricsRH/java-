package һ;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;


public class a1 {
	
	public static final int StopW=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("��������������0ֹͣ�����������ֵ");
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
      System.out.println("���ֵ="+max);
      
	
		
	}

}
