package Æß;

public class G2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card.run();
		
	}

}

class Card{
	//enum point{A,B,C,D,E,F,G,H,I,T,J,Q,K};
	private static int ACE=1,JACK=11,QUEEN=12,KING=13;
	enum color{C,D,H,S};
	private String cardString;;
    private int  rank;
    private color suit;
	
	public Card(){
		rank=0;
		suit=null;
	    this.cardString="";
	}
	


	

	public Card(String cardString){
		this.cardString=cardString;
	}
	
	public Card(int rank, color c){
		this.rank=rank;
		this.suit=c;
	}
	
	public String toString(){
		if (rank==1) {
		   return "A"+suit.toString();
		}else if (rank==11) {
	       return "J"+suit.toString();
		}else if (rank==12) {
		       return "Q"+suit.toString();
			}else if (rank==13) {
			       return "K"+suit.toString();
			}else {
		return rank+suit.toString();
	}
	}
	public static void run(){
		for (color color : color.values()) {
			for(int i=Card.ACE;i<=Card.KING;i++){
				System.out.print(" "+new Card(i,color).toString());
			}
			System.out.println( );
		}
		
	}
	
	
	
}
