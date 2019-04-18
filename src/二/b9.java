package 二;

public class b9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("π大小为"+new b9().run()*6);
	}
	public double run()
	{
		double total=1.0/2 ,a=3.00,b=1.00 ;
		
		for (int i = 0; i < 10000; i++) {
			b=b*(1-1.00/(a-1));
			total+=(1.0/a)*Math.pow(1.0/2.0, a)*b;
			a=a+2;
		}
		
		return total;
	}

}
