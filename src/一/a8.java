package һ;

import java.util.Scanner;

public class a8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    Scanner scanner=new Scanner(System.in);
	    int b= scanner.nextInt();
	    int c=new a8().reserve(b);
	    System.out.println(c);
	}
	public int reserve(int a)
	{
		int m,f=0;
		while(a!=0) {
			m=a%10;
			a=a/10;
			f=f*10+m;
		}
		return f;
	}
	

}
