package Èý;

public class c7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(new c7().removeCharacters("abcadfaeg", "c"));
	}
	
	private String removeCharacters(String str,String remove)
	{
		String finalsString="";
		for (int i = 0; i < str.length(); i++) {
			char a =str.charAt(i);
			for (int j = 0; j < remove.length(); j++) {
				char b=remove.charAt(j);
				if(a==b)
				{
					break;
				}else if (a!=b&&j==remove.length()-1) {
					finalsString+=a;
				}
			}
			
		}
		return finalsString;
		
	}

}
