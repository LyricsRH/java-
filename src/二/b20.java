package ¶þ;

public class b20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(new b20().fib(9));
	}
	 
	public int fib(int n)
	{
		int a=0,b=1,c;
		if (n==0||n==1) {
			return n;
		}else {
			for (int i = 2; i <= n; i++) {
				c=a;
				a=b;
				b=c+b;
			}
		return b;	
		}
	}

}
