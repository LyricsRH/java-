package Èý;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new c2().indexOf("alklklklkl", "ll", 2));
	}
	public int indexOf(String s,char pattern,int k)
	{
		for (int i = k; i < s.length(); i++) {
			char a=s.charAt(i);
			if (a==pattern) {
				return i;
			}
		}
		return -1;
	}
	
	public int indexOf(String s,String suffix,int k)
	{
		for (int i = k; i <s.length()-suffix.length()+1; i++) {
			if (suffix.charAt(0)==s.charAt(i)) {
				for (int j = 1; j < suffix.length(); j++) {
					if (suffix.charAt(j)==s.charAt(i+j)) {
						return i;
					}
				}
			}
		}
		return -1;
	}

}
