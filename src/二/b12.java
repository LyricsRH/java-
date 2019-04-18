package ¶þ;

public class b12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(new b12().permutations(52, 2));
	}
	public int permutations(int n,int k)
	{
		int total=1;
		for (int i = n; i > n-k; i--) {
			total*=i;
		}
		return total;
	}

}
