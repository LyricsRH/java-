package Èý;

public class c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(new c8().createOrdinalForm(101));
	}
	public String createOrdinalForm(int n)
	{
		
	if (n==11||n==12||n==13) {
		return n+"th";
	}else {
		switch (n%10) {
		case 1:
			return n+"st";
		case 2:
			return n+"nd";
		case 3:
			return n+"rd";
		default:
			return n+"th";
		}
	}
	}

}
