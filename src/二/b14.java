package ¶þ;

public class b14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new b14().jin(3));
	}
	public int jin(int h)
	{
		if (h==1) {
			return 1;
		}else {
			return h*h+jin(h-1);
		}
	}

}
