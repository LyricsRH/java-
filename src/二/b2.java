package ��;

import java.util.Scanner;

public class b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true){
	    System.out.println("����һ������");
		Scanner scanner=new Scanner(System.in);
		int b= scanner.nextInt();
	     System.out.println("����"+new b2().run(b)+"λ��");
		}
		}
	
	public int run(int a)
	{
		int num=1;
		while(a/10!=0)
		{
			a/=10;
			num++;
		}
		return num;
	}
}
