package ¶þ;

public class b16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println(new b16().raiseToPower(2, 5));
	}
	
	public int  raiseToPower(int n, int k)
	{
		if (k==0) {
			return 1;
		}else {
			return n*raiseToPower(n, k-1);
		}
	}

}
