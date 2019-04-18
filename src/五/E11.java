package Îå;

public class E11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a=new E11().posibilityPlate(50);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public int[] posibilityPlate(int n){
		int []ball=new int[n];
		for (int i = 0; i < n; i++) {
			int num=0;
			for (int j = 0; j < 10; j++) {
				double random=Math.random();
				if (random>=0.50) {
					num++;
				}
			}
			ball[i]=num;
		}
		int []result=new int[10];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < ball.length; j++) {
				if(ball[j]==i){
					result[i]++;
				}
			}
		}
		return result;			
	}
}
  