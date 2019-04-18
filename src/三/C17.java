package Èý;

public class C17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(new C17().findDNAMatch("TTGCC", "TAACGGTACGTC"));
	}
	
	public  int findDNAMatch(String str1,String str2)
	{ 
		int len1=str1.length();
		int len2= str2.length();
		str1=transDna(str1);
	    return str2.indexOf(str1);
	}
	
	public  int findDNAMatch(String str1,String str2,int k)
	{ 
		int len1=str1.length();
		int len2= str2.length();
		str1=transDna(str1);
	    return str2.indexOf(str1,k);
	}
	
	
	
	public String transDna(String str)
	{
		String resultString="";
		int len=str.length();
		for (int i = 0; i < len; i++) {
			char temp=str.charAt(i);
			resultString+=transJ(temp);
		}
		return resultString;
		
	}
	
	public char transJ(char c)
	{
		switch (c) {
		case 'C':
			return 'G';
		case 'G':
			return 'C';
		case 'A':
			return 'T';
		case 'T':
			return 'A';
	
		}
		return 'L';
	}

}
