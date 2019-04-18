package Îå;

public class E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new E12().sumDouble(1.2,1.2,1.3,1.4));
	}
	
	public double sumDouble(double...d){
		double sum=0;
		for (double e : d) {
			sum+=e;
		}
		return sum;
	}
	

}
