package 二;

public class b21 {
	static int num1=0;
	static int num2=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("1递归"+new b21().fib1(4)+"次数"+num1);
//		System.out.println("2递归"+new b21().fib2(4)+"次数"+num2);
		System.out.println(" n      fib1       fib2");
		System.out.println("___     _____      _____ ");
		for (int i = 0; i < 10; i++) {
			new b21().fib1(i);
			new b21().fib2(i);
			System.out.println(  i+"        "+num1+"            "+num2);
			num1=0;
			num2=0;
		}
	}
	
	public int fib1(int n)
	{   
		if (n<2) {
			num1++;
			return n;
		}else {
			num1++;
			return fib1(n-1)+fib1(n-2);
		}
	}
	
	public int fib2(int n)
	{
		num2++;
		return additiveSequence(n,0,1);
	}
	
	public int additiveSequence(int n,int t0,int t1)
	{
		 if (n==0) {
			 num2++;
			 return t0;
		}if (n==1) {
			num2++;
			return t1;
		}else {
			num2++;
			return additiveSequence(n-1, t1, t0+t1);
		}
		
	}
	



}
