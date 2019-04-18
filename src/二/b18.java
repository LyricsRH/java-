package ¶ş;

public class b18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println(new b18().digitSum(1729));
	}
	
	public int digitSum(int n)
	{
		int sum=0;
		if (n/10==0) {
			return n;
		}else {
			return sum+n%10+digitSum(n/10);
		}
		
	}
	
//	public int fen(int k)
//	{
//		if(k/10==0)
//		{
//			return k;
//		}else {
//			return fen(k/10);
//		}
//	}
}

