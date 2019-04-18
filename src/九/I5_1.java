package ¾Å;

import java.util.ArrayList;
import java.util.Stack;

public class I5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer>arraylist=new Stack<Integer>();
		new I5_1().generate(3,arraylist);
	}
	
	String s1,s2;
	void generate(int nBits,Stack<Integer> arrayList){
		if (nBits==0) {
			for (Integer integer : arrayList) {
				System.out.print(integer);
			}
			System.out.println();
		}else {
			arrayList.push(0);
			generate(nBits-1,arrayList );
			arrayList.pop();
			arrayList.push(1);
			generate(nBits-1, arrayList);
			arrayList.pop();
		}
		
	}


}
