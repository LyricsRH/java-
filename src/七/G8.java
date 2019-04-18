package Æß;

public class G8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coin=0;
		int upNum=0;
		int totalNum=0;
		
		while(upNum!=3){
			if (Math.random()>0.50) {
				upNum++;
				System.out.println("up");
			}else {
				upNum=0;
				System.out.println("down");
			}
			totalNum++;
		}
		System.out.println("takes"+totalNum+"get 3 up");
		
	}

}


