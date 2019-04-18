package ¶þ;

public class b10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new b10().exp(2, 100));
	}
	
	public double exp(int x,int num)
	{
		double tot=0;
		for (int i = 0; i <num ; i++) {
			tot+=Math.pow(x, i)/liancheng(i);
		}
		return tot;
	}
	
	public int liancheng(int n)
	{
		int i=1,total=1;
		if (n==0) {
			return 1;
		}else {
		while(i<=n)
		{
			total*=i;
			i++;
		}return total;
		
	}
	}

}
