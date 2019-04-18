package Áù;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Stack<String>stack=new Stack<String>();
		Scanner scanner=new Scanner(System.in);
		while(true){
			String line=scanner.nextLine();
			int k=0;
			for (int i = 0; i < line.length(); i++) {
				char c=line.charAt(i);
				int n=new F2().direction(c);
				if (n==-1) {
					stack.push(String.valueOf(c));
				}else if(n==1){
					String top= stack.pop();
				    if (!new F2().isDouble(top, String.valueOf(c))) {
				    	System.out.println("wrong");
				    	k++;	
				    }
				    
				    }
				}if (k==0&&stack.isEmpty()) {
					System.out.println("right");
				}else {
					System.out.println("Wrong");
				}
				k=0;
			}
		}
	

	public boolean isDouble(String  m,String n){
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("{", "}");
		map.put("(", ")");
		map.put("[", "]");
		
		String result=map.get(m);
		if (result.equals(n)) {
			return true;
		}else {
			return false;
		}
	}
	
	public int direction(char n){ 
		switch (n) {
		case '{':case '(':case '[':
			return -1;
		case '}':case ')':case ']':
			return  1;
		default:
			return 0;
		}
	}
	

}
