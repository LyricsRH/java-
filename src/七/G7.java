package Æß;

public class G7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new G7().run();
	}

	public void run(){
		point point=new point();
		int inNum=0;
		int ouNum=0;
		for (int i = 0; i < 100000; i++) {
			if( point.len()){
				inNum++;
			}else {
				ouNum++;
			};
		}
		System.out.println(4.000*inNum/(ouNum+inNum));
	}
}


class point{
	private  double x;
	private double y;
	
	boolean len(){
		this.x=(2*Math.random())-1;
		this.y=(2*Math.random())-1;
		return (x*x+y*y)<1;
	}
}
