package ¶þ;

public class b15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int i = 1; i < 9; i++) {
        	System.out.println(new b15().getTitiusBodeDistance(i));
		}
	}
	public double  getTitiusBodeDistance(int k)
	{
	  return (4+b(k))/10.0;
	}
	public int b(int k)
	{
		if (k==1) {
			return 1;
		}else {
			if (k==2) {
				return 3;
			}else {
				return 2*b(k-1);
			}
		}
	}

}
