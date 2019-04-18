package Áù;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F8 {

	
	public static void main (String []args){
		System.out.println("Morse code translate");
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextLine()){
			 String string= scanner.nextLine();
			 String result="";
			 if (string.charAt(0)=='.'||string.charAt(0)=='-') {
				Scanner scanner2=new Scanner(string);
				scanner2.useDelimiter(" ");
				while(scanner2.hasNext()){
					result+=returnMatch(scanner2.next());
				}
			}else {
				for (int i = 0; i < string.length(); i++) {
					if (Character.isLetter(string.charAt(i))) {
						result+=returnMatch(String.valueOf(string.charAt(i)))+" ";
					}
				}
			}
			 System.out.println(">"+result);
			
		}
	}
	
	
	public static String returnMatch(String string)
	{
		Map<String, String> dicMap=dict();
		return dicMap.get(string);
	}
	
	public static Map<String, String> dict(){
		Map<String, String> dicMap=new HashMap<String, String>();
		dicMap.put("A", ".-");
		dicMap.put("B", "-...");
		dicMap.put("C", "-.-.");
		dicMap.put("D", "-..");
		dicMap.put("E", ".");
		dicMap.put("F", "..-.");
		dicMap.put("G", "--.");
		dicMap.put("H", "....");
		dicMap.put("I", "..");
		dicMap.put("J", ".---");
		dicMap.put("K", "-.-");
		dicMap.put("L", ".-..");
		dicMap.put("M", "--");
		dicMap.put("N", "-.");
		dicMap.put("O", "---");
		dicMap.put("P", ".--.");
		dicMap.put("Q", "--.-");
		dicMap.put("R", ".-.");
		dicMap.put("S", "...");
		dicMap.put("T", "-");
		dicMap.put("U", "..-");
		dicMap.put("V", "...-");
		dicMap.put("W", ".--");
		dicMap.put("X", "-..-");
		dicMap.put("Y", "-.--");
		dicMap.put("Z", "--..");
		
		dicMap.put( ".-",  "A");
		dicMap.put( "-...","B");
		dicMap.put( "-.-.","C");
		dicMap.put( "-..", "D");
		dicMap.put( ".",   "E");
		dicMap.put( "..-.","F");
		dicMap.put( "--.", "G");
		dicMap.put( "....","H");
		dicMap.put( "..",  "I");
		dicMap.put( ".---","J");
		dicMap.put( "-.-", "K");
		dicMap.put( ".-..","L");
		dicMap.put( "--",  "M");
		dicMap.put( "-.",  "N");
		dicMap.put( "---", "O");
		dicMap.put( ".--.","P");
		dicMap.put( "--.-","Q");
		dicMap.put( ".-.", "R");
		dicMap.put( "...", "S");
		dicMap.put( "-",   "T");
		dicMap.put( "..-","U");
		dicMap.put( "...-","V");
		dicMap.put( ".--","W");
		dicMap.put( "-..-","X");
		dicMap.put( "-.--","Y");
		dicMap.put( "--..","Z");
		
		return dicMap;
	}
}
