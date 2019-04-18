package 五;

public class E10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]a={
		{3,9,2,4,6,5,8,1,7},
		{7,4,1,8,9,3,6,2,5},
		{6,8,5,2,7,1,4,3,9},
		{2,5,4,1,3,8,7,9,6},
		{8,3,9,6,2,7,1,5,4},
		{1,7,6,9,5,4,2,8,3},
		{9,6,7,5,8,2,3,4,1},
		{4,2,3,7,1,9,5,6,8},
		{5,1,8,3,4,6,9,7,2}};
		
		System.out.println(new E10().checkSudokuSolution(a));
	}
	
	public boolean checkSudokuSolution(int [][] puzzle){
		
		int rowsN=puzzle.length;
		int lineN=puzzle[0].length;
		
		if (rowsN!=9&&lineN!=9) {
			System.out.println("输入矩阵不合格");
		}
		
		for (int i = 0; i < rowsN; i++) {
			int []a=row(puzzle, i);
			if (isSame(a)) {
				return false;
			}
		}
		
		for (int i = 0; i < lineN; i++) {
			int []a=line(puzzle, i);
			if (isSame(a)) {
				return false;
			}
		}
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {
				int []a =smallSquare(puzzle, i, j);
				if (isSame(a)) {
					return false;
				}
			}
		}
		
		return true;
	}

	public int[] row(int a[][],int n)
	{
		return a[n];
	}
	
	public int[] line(int a[][],int n){
		int len=a.length;
		int []result=new int[len];
		
		for (int i = 0; i < result.length; i++) {
			result[i]=a[i][n];
		}
		return result;
	}
	
	public int[] smallSquare(int a[][],int x,int y)
	{
		int m=x*3;
		int n=y*3;
		int []result=new int[9];
		int num=0;
		
		for (int i = m; i < m+3; i++) {
			for (int j = n; j < n+3; j++) {
				result[num]= a[i][j];
			    num++;
			}
		}
		return result;
	}

    public boolean isSame(int a[])
    {
    	for (int i = 0; i < a.length-1; i++) {
			int init=a[i];
    		for (int j = i+1; j < a.length; j++) {
				int compete=a[j];
				if (init==compete) {
					return true;
				}
			}
		}if (a[a.length-2]==a[a.length-1]) {
			return true;
		}
		return false;
    }
}
