package Èý;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(new c1().endwith("Happy", "apy"));
	}
	
	public boolean endwith(String str,String suffix)
	{
		int lenA,lenB;
		lenA=str.length();
		lenB=suffix.length();
		int num=0;
		for (int i = 0; i < lenB; i++) {
			char a=str.charAt(lenA-i-1);
			char b=suffix.charAt(lenB-i-1);
			if (a!=b) {
				num++;
			}
		}
		if (num==0) {
			return true;
		}else {
			return false;
		}
	}

}
