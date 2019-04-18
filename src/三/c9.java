 package Èý;

public class c9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new c9().createRegularPlural("butterfhch"));
	}
	
	public String createRegularPlural(String word)
	{
		char sec= word.charAt(word.length()-2);
		char lastW=word.charAt(word.length()-1);
		if (lastW=='s'||lastW=='x'||lastW=='z') {
			return word+"es";
		}else if (lastW=='h'&&(word.charAt(word.length()-2)=='c'||word.charAt(word.length()-2)=='s')) {
			return word+"es";
		}else if (lastW=='y'&&sec!='a'&&sec!='e'&&sec!='i'&&sec!='o'&&sec!='u') {
			return word.substring(0, word.length()-1)+"ies";
		}else {
			return word+"s";
		}
		
		
	}

}
