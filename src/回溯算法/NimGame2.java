package �����㷨;

public class NimGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=13;
		while(n>1){
			int first= new NimGame2().winnum(n);
			if(first==-1){
				first=(int)(3*Math.random()+1);
			System.out.println("first+random"+first);
			}else {
				System.out.println("first"+first);
			}
			n=n-first;
			int secont=new NimGame2().winnum(n);
			if(secont==-1){
				secont=(int)(3*Math.random()+1);
			System.out.println("secomd+random"+secont);
			}else {
				System.out.println("second"+secont);
			}
			n=n-secont;
		}
	
		
	}
	
	int winnum(int n){
		
		if (n==1)  {return -1;}
		else {
			for (int i = 1; i <4; i++) {
				if (n-i==1) {
					return i;
				}else {
					//��һ�� �����ˡ����ݵ���ӽ�ֵΪ-1 �ĸ��ĵط���
					if (winnum(n-i)==-1) {
						return i;
					}
				}
			}
		}
		return -1;
	}

}
