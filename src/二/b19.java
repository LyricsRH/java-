package ¶þ;

public class b19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.out.print(new b19().digitalRoot(1729));
	}
	public int digitalRoot(int n)
	{
		int sum;
		if (n/10==0) {
			return n;
		}else {
			sum=n%10+digitalRoot(n/10);
			if (sum/10==0) {
				return sum; 
			}else {
				return digitalRoot(sum);
			}
		}
	}

}
