package Èý;

public class c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new c12().removeDoubleLetters("adeeefk"));
	}
	
	public String removeDoubleLetters(String str)
	{
		String finalS="";
		for (int i = 0; i <str.length()-1; i++) {
			if (str.charAt(i)!=str.charAt(i+1)) {
				finalS+=str.charAt(i);
			}
		}
		finalS+=str.charAt(str.length()-1);
	    return finalS;
	}

}
