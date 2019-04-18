package ËÄ;

public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%5s | %10s | %10s |%n", "theta","sin(theta)","cos(theta)");
		System.out.println("------+------------+------------+");
		for (int i = -90; i < 100; i+=15) {
			double m=Math.PI*2*(i/360.0);
			System.out.printf("%5.0f | %10.7f | %10.7f |%n", (float)i,(float)Math.sin(m),(float)Math.cos(m));
		}
	}

}
