package Îå;

import ¶þ.b16;
import ¶þ.b6;

public class E6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []perfect=new b6().perfectNums();
		for (int i = 0; i < perfect.length; i++) {
			String string=new E5().intToString(perfect[i], 2);
			System.out.printf("perfectnum: %4d  form of 2: %20s%n", perfect[i],string);
		}
	}

}
  