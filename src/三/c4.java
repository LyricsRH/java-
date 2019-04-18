package Èý;

public class c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new c4().capitalize("aAC!00xsAAa"));
	}

	public String capitalize(String str)
	{
		char first=str.charAt(0);
		String last=str.substring(1);
		first=Character.toUpperCase(first);
		last=last.toLowerCase();
		return first+last;
	}
}
