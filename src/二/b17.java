package ¶þ;

public class b17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new b17().gcd(0,40 ));
	}
	
	public int gcd(int x,int y)
	{
		if (y==0) {
			return x;
		}else {
			return gcd(y, x%y);
		}
	}

}
