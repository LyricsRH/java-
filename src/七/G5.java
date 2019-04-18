package Æß;

public class G5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LabelGenerator figureGenerator=new LabelGenerator("Figure",1);
		LabelGenerator pointGenerator=new LabelGenerator("P", 0);
		for (int i = 0; i < 3; i++) {
			System.out.print(figureGenerator.nextLabel());
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print(pointGenerator.nextLabel());
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print(figureGenerator.nextLabel());
		}
	}

}

class LabelGenerator{
	
	String preString;
	int initNum;
	
	public LabelGenerator(){
		
	}
	
	public LabelGenerator(String preString,int initNum){
		this.preString=preString;
		this.initNum=initNum;
	}
	
    public String nextLabel(){
    	
    	String resultString= preString+" "+initNum;
    	this.initNum++;
    	return resultString;
    }	
}