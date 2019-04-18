package 四;

import 二.b5;

public class D4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int a=5;
		//System.out.println(new b5().windChill(40, 10));
	    System.out.printf("%-6s|", "无风");
	     for (int i = 40; i >-45 ; i-=5) {
			System.out.printf("%4d", i);
		}
	     System.out.printf("%4d%n", -45);
	    
	     
		for (int i = 0; i < 12; i++) {	
			int b=40;
			System.out.printf("%-6s|", a+"");
			for (int j = 0; j < 18; j++) {	
				int temp=new b5().windChill(b, a);
		//		System.out.print(new b5().windChill(b, a));
		//		System.out.print("  ");
			   
			    if(j==17){System.out.printf("%4d%n", temp);}
			    else {
			    	System.out.printf("%4d",temp);
				}
				b-=5;
			}
		//	System.out.println(" ");
			a+=5;
		}
	}
	public int windChill(int t,int v)
	{
		if (v==0) {
			return t;
		}else if (t>40) {
			return t;
		}else {
			return (int) (35.74+0.6215*t-35.75*Math.pow(v, 0.16)+0.4275*t*Math.pow(v, 0.16));
		}
	}

}