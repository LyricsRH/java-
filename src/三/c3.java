package Èý;

public class c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new c3().trim("    a v   c   a "));
	}
	public String trim(String str)
	{
		String rs = "";
		for (int i = 0; i < str.length(); i++) {
			char a=str.charAt(i);
			if (a!=' ') {
				rs+=a;
			}
		}
		return rs;
	}

}
