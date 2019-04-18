package ¶þ;

public class b22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println(new b22().conbinations(4, 2));
	}
	
	public int conbinations(int n,int k)
	{
		if(n==k||k==0)
		{
			return 1;
		}else {
			return conbinations(n-1, k-1)+conbinations(n-1, k);
		}
		
	}

}
