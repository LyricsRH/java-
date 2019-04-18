package Áù;

import java.util.Scanner;
import java.util.Stack;

public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a list of integers,ending with 0: ");
		Scanner scanner=new Scanner(System.in);
		Stack<Integer> s=new Stack<Integer>();
		while(true){
			System.out.print("?");
			int n=scanner.nextInt();
			if (n==0) break;
			s.push(n);
		}
		System.out.println("Those integers in reverse order are:");
		while(!s.isEmpty()){
			System.out.printf(" %3d%n",s.pop());
		}
	}
	
	

}
