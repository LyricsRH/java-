package ªÿÀ›À„∑®;

import “ª.a1;

public class EightQueen {

	public static int num=8;
	int []q=new int[num];
	static int totalN=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new EightQueen().qs(0);

	}
	
	void qs(int n){
		
		if (n==num) {
			System.out.println(totalN=totalN+1);
			return;
		}else {
			for (int i = 0; i < num; i++) {
				q[n]=i;
				if (n>0) {
				for (int j = 0; j < n; j++) {
					if (q[n]!=q[j]&&Math.abs(q[n]-q[j])!=Math.abs(n-j)) {
						qs(n+1);
					}
				    }
			    }else{
			    	qs(n+1);
			    }
				
			}
		}
	}

}
