package 一;

import java.util.Scanner;

public class a10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("请输入一个正整数");
		Scanner scanner=new Scanner(System.in);
	    int b=scanner.nextInt();
	    new a10().run(b);
	}
	
	public void run(int a)
	{
		if (a!=1) {
			while(a!=1){
			if (a%2==0) {
				System.out.println(a+"是偶数，除以二得到"+a/2);
				a/=2;
			}else {
				System.out.println(a+"是奇数，乘3加1得到"+(a*3+1));
				a=a*3+1;
			}
		}}
	}

}
