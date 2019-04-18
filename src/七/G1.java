/**
 * 
 */
package Æß;

/**
 * @author Administrator
 *
 */
public class G1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <=6; i++) {
			for (int j = i+1; j <=6; j++) {
				Domino domino= new Domino(i,j);
				System.out.println(domino.toString());
			}
		}
	}
}

class Domino{
	private int LeftDots,RightDots;
	
	
	public Domino(){
		LeftDots=0;
		RightDots=0;
	}
	
	public Domino(int LeftDots,int RightDots){
		this.LeftDots=LeftDots;
		this.RightDots=RightDots;
	}
	
	public String toString(){
		return LeftDots+"-"+RightDots;
	}

	public int getLeftDots() {
		return LeftDots;
	}

	public int getRightDots() {
		return RightDots;
	}
	
	
	
	
	
	
	
}










