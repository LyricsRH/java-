package Îå;

public class E9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean [][]result={{true ,false,false,false,false,true},
				            {false,false,false,false,false,true},
		                    {true ,true ,false,true ,false,true},
		                    {true ,false,false,false,false,false},
		                    {false,false,true ,false,false,false},
				            {false,false,false,false,false,false},};
		int [][]res= new E9().countMines(result);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.printf("|%1d",res[i][j]);
			}
			System.out.println();
		}
	}
	
	public int[][] countMines(boolean[][] mines){
		int rowsNum=mines.length;
		int linesNum=mines[0].length;
		
		int [][]result=new int [rowsNum][linesNum];
		
		for (int i = 0; i <rowsNum; i++) {
			for (int j = 0; j <linesNum; j++) {
				int leftU,up,rightU,left,right,leftD,down,rightD;
				if (i>=1&&j>=1&&mines[i-1][j-1]==true) {
			         result[i][j]+=1; 		
		  		}if (i>=1&&mines[i-1][j]==true) {
			         result[i][j]+=1; 		
		  		}if (i>=1&&j<linesNum-1&&mines[i-1][j+1]==true) {
			         result[i][j]+=1; 		
		  		}if (j>=1&&mines[i][j-1]==true) {
			         result[i][j]+=1; 		
		  		}if (j<linesNum-1&&mines[i][j+1]==true) {
			         result[i][j]+=1; 		
		  		}if (i<linesNum-1&&j>=1&&mines[i+1][j-1]==true) {
			         result[i][j]+=1; 		
		  		}if (i<linesNum-1&&mines[i+1][j]==true) {
			         result[i][j]+=1; 		
		  		}if (i<rowsNum-1&&j<linesNum-1&&mines[i+1][j+1]==true) {
			         result[i][j]+=1; 		
		  		}if (mines[i][j]==true) {
		  			 result[i][j]+=1; 
				}
			}
		}
	  return result;	
	}

}
