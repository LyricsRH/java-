package ªÿÀ›À„∑®;

public class NimGame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new NimGame3().winNim(12));
	}
	
	int winNim(int n){
		if (n==1) {
			return -1;
		}for (int i = 1; i < 4; i++) {
			if (winNim(n-i)==-1) {
				return i;
			}
		}
		return -1;
	}

}
