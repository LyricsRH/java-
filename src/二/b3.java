package ¶þ;

public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 16; i++) {
			System.out.println("2^"+i+"="+b3.jihe(i,3));
			
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

}
