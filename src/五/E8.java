package Îå;

public class E8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]square={{8,1,6},{3,5,7},{4,9,2}};
		System.out.println(new E8().isMagicSquare(square));
	}
	
	public boolean isMagicSquare(int[][] square)
	{
		int row=square.length;
		int line=square[0].length;
		if (row==line) {
			int mainSum=sumMainLine(square);
			int secondSum=secondLine(square);
			if (mainSum==secondSum) {
			   for (int i = 0; i < square.length; i++) {
				int []rows=square[i];
				if (sumRow(rows)!=mainSum) {
					return false;
				   }
			    }
			   int sum=0;
			   for (int i = 0; i < square.length; i++) {
				  
				   for (int j = 0; j < square.length; j++) {
					sum+=square[j][i];
				    }
				   if (sum!=mainSum) {
						
						return false;
					}
				    sum=0;
			   }
			   return true;
			}else {
				return false;
			}
		}
		else {
			   return false;
		     }

	}
	
	public int sumRow(int []a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public int sumMainLine(int [][]a)
	{
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i==j) {
					sum+=a[i][j];
				}
			}
		}
		return sum;
	}

	public int secondLine(int [][]a)
	{
		int len=a.length;
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i+j==len-1) {
					sum+=a[i][j];
				}
			}
		}
		return sum;
	}
}
