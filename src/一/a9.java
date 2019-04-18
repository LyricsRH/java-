package 一;

import java.util.Scanner;

public class a9 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        while(true){
		System.out.println("请输入一个数，获得其质因数分解");
		Scanner scanner =new Scanner(System.in);
		int bef=scanner.nextInt();	
		new a9().run(bef);
	}
	}

	public static boolean ifZhiShu(int a)
	{
		int number=0,b=2;
		while(b!=a)
		{
			if (a%b==0) {
				number++;
			}
			b++;
		}
		
		if (number!=0) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public void run(int bef)
	{
		if (a9.ifZhiShu(bef)) {
			System.out.println(bef);
		}else {
			while(a9.ifZhiShu(bef)==false)
			{
				int k=2;
				while(k<=bef)
				{
					while(bef%k==0)
					{
						bef=bef/k;
						if (bef==1) {
							System.out.print(k);
						}else {
						System.out.print(k+"x");
						}
					}
				k++;	
				}
			}
		}
	}
	
	

	
	
}
