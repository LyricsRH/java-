package ¾Å;

public class I4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new I4().generate(3,3);
	}
	
	int a[]=new int[20];
	void generate(int nBits,int n){
		
		
		if (nBits==0) {
			for (int i = 1; i <n+1 ; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
		}else {
			a[nBits]=0;
			generate(nBits-1,3);
			a[nBits]=1;
			generate(nBits-1,3);
		}
		
	}

}



