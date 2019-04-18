package 二;

import java.util.Scanner;

public class b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true){
	    System.out.println("输入一个整数");
		Scanner scanner=new Scanner(System.in);
		int b= scanner.nextInt();
	     System.out.println("共有"+new b2().run(b)+"位数");
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
