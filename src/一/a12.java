package һ;

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
		System.out.println("������ǣ�"+total);
		System.out.println("ʵ�����Ϊ��"+Math.PI*r*r/4);
	}

}
