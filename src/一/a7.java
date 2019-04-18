package 一;

import java.util.Scanner;

public class a7 {

	public static final int stopW=-1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new a7().run();
	}
	 
    public void run()
    {
    	Scanner scanner=new Scanner(System.in);
    	int total=0,num=0;
    	int a;
    	while((a=scanner.nextInt())!=stopW)
    	{
    		total+=a;
    		num++;
    		
    	}
    	System.out.println("平均成绩成为："+total/num);
    }

}
