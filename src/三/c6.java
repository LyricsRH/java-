package Èý;

public class c6 {
	public static void main(String []args)
	{
		System.out.println(new c6().acronym("asd wq-wee ssd"));
	}

	public String acronym(String str)
	{
		String finalString;
		if (Character.isLetter(str.charAt(0))) {
			finalString=""+str.charAt(0);
		}else {
			finalString="";
		}
		for (int i = 1; i < str.length(); i++) {
			char x=str.charAt(i);
			char y=str.charAt(i-1);
			if (!Character.isLetter(y)&&Character.isLetter(x)) {
				finalString+=x;
			}
		}
		return finalString;
	}
}

