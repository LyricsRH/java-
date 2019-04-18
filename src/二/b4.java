package ¶þ;

public class b4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 16; i++) {
			System.out.println("2^"+i+"="+b4.jihe(i,2.21));
			
		}
	}
	public static int jihe(int a,int n)
	{
		int total=1;
		for (int i = 0; i < a; i++) {
			total=total*n;
		}
		return total;
	}
	
	public static double jihe(int a,double n)
	{
		double total=1;
		for (int i = 0; i < a; i++) {
			total=total*n;
		}
		return total;
	}
	
	public static long  jihe(int a,long  n)
	{
		long total=1;
		for (int i = 0; i < a; i++) {
			total=total*n;
		}
		return total;
	}

}