package ¶ş;

public class b11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new b11().findEaster(1844));
	}
	
	public String findEaster(int year)
	{
		int a,b,c,d,e=0;
		a=year%19;
		b=year%4;
		c=year%7;
		d=(19*a+23)%30;
		if (year>=1700&&year<=1799) {
			e=(2*b+4*c+6*d+3)%7;}
		else if (year>=1800&&year<=1899) {
			e=(2*b+4*c+6*d+4)%7;
		} 
		if ((d+e)>9) {
			return "April "+(d+e-9);
		}else {
			return "March "+(22+d+e); 
		}
	}

}
