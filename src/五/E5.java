package Îå;

import org.omg.CORBA.StringHolder;

public class E5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new E5().intToString(451, 32));
		System.out.println(new E5().stringToInt("E3", 32));
	//	System.out.println(new E5().charAcc('A'));
	}
	
	public String intToString(int value ,int base)
	{
	
		int n=0;
		while(nCf(base, n)<=value)
		{
			n++;
		}
		char []result=new char[n];
	
		int a=0; 
		int b=0;
		char []bases=bases();
		for (int i = n-1; i >=0; i--) {
			int k=nCf(base, i);
			a=value/k;
			b=value%k;
			result[i]=bases[a];
			value=b;

		}
		
		String string="";
		for (int i = 0; i < result.length; i++) {
			string=result[i]+string;
		}
		
		return string;
	}
	
	public int stringToInt(String str,int base)
	{
		if (overRound(str, base)) {
			System.out.println("³¬³ö·¶Î§");
		}else{
			int len=str.length();
			int account=0;
		for (int i = 0; i < str.length(); i++) {
		//	int c=Integer.parseInt(String.valueOf(str.charAt(i)));
		    int c=charAcc(str.charAt(i));
			account+=nCf(base, len-i-1)*c;
		 
		}return account;
		}
		return -1;
	}
	
	
	public int nCf(int base,int n)
	{
		int result=1;
		for (int i = 0; i < n; i++) {
			result*=base;
		}
		return result;
	}
	
	public char[] bases() {
		char []result=new char[36];
		for (int i = 0; i < result.length; i++) {
			if (i<10) {
				result[i]=String.valueOf(i).charAt(0);
			}else {
				result[i]=(char) ('A'+i-10);
			}
		}
		return result;
	}
    	
	public boolean overRound(String str,int base)
	{
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			int k=charAcc(c);
			if (k>base||base<2||base>36) {
				return true;
			}
		}
		return false;
	}

	public int charAcc(char k)
	{
		char[]bases=bases();
		int len=bases.length;
		for (int i = 0; i < len; i++) {
			if (k==bases[i]) {
				return i ;
			}
		}
		return -1;
		
	}
}
