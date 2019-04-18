package ¶þ;

import org.omg.CORBA.PUBLIC_MEMBER;

public class b8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(new b8().sqrt(49));
	}
	
	public double sqrt(double x)
	{   double g,bef;
		    g=x/2;
		do {
			bef=g;
			g=(g+x/g)/2;
		} while (g!=bef&&g!=x/bef);
		  
		return g;
	}

}
