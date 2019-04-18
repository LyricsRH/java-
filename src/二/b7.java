package ¶þ;

public class b7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		for (int i = 2; i <=100; i++) {
			if (new b7().isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public boolean isPrime(int n)
	{
		int a=2,num=0;
		while(a!=n)
		{
			if (n%a==0) {
				num++;
			}
			a++;
		}
		if (num!=0) {
			return false;
		}else {
			return true;
		}
	}

}
