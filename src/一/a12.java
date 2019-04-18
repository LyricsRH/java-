package 一;

public class a12 {

	public static final double width=2.0000000000/10000;
	public static final double r=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    double x,h,total=0;
		for (int i = 0; i < 10000; i++) {
			x=width/2+i*width;
			h=Math.sqrt(r*r-x*x);
			total+=width*h;
		}
		System.out.println("总面积是："+total);
		System.out.println("实际面积为："+Math.PI*r*r/4);
	}

}
