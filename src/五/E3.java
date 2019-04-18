package Îå;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double []data={1.0,2.0,3.0};
		System.out.println(new E3().stddev(data));
	}

	public double stddev(double[] data){
		double u=new E1().average(data, 1);
        double total=0.0;
        for (int i = 0; i < data.length; i++) {
			total+=(u-data[i])*(u-data[i]);
		}
        return Math.sqrt(total/data.length);
	}
	

}
