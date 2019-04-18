package ¶þ;

public class b6 {

	public static void main(String []args)
	{
		for (int i = 1; i <= 9999; i++) {
			if (new b6().isPerfect(i)) {
				System.out.println(i);
			}
		}
	}
	
	public int[] perfectNums()
	{
		int []perfect=new int[4];
		int num=0;
		for (int i = 1; i <= 9999; i++) {
			if (new b6().isPerfect(i)) {
				perfect[num]=i;
				num++;
			}
		}
		return perfect;
	}
	
	public boolean isPerfect(int n)
	{
		int a=1,total=0;
		while(a!=n)
		{
			if (n%a==0) {
				total+=a;
			}
			a++;
		}
		if (total==n) {
			return true;
		}else {
			return false;
		}
	}
}
