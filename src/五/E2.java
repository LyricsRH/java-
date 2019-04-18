package Îå;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a =new E2().indexArray(10);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	 public int[] indexArray(int n){
		
		int [] result=new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i]=i;
		}
		return result;
	}

}
