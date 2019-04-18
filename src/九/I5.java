package ¾Å;

public class I5 {
	int nBits=3 ;int []a=new int[nBits];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

     new I5().generateB(0);		
	}
	
	
	void generateB(int m)
	{
		if (m==nBits) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
		}else {
			a[m]=0;
			generateB(m+1);
			a[m]=1;
			generateB(m+1);
		}
	}
}
