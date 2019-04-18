package 一;

public class a11 {

	public static void main(String []args)
	{
	    double a=1,b=1;
	    double total=0;
	    for (int i = 0; i < 10000; i++) {
			total+=b*(1.00/a);
			a=a+2;
			b=-1*b;
		}
	    System.out.println("π的值为"+total*4);
	}
}
