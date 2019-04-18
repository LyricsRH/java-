package Îå;

import javax.xml.transform.Templates;

public class E7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new E7().eratosthenes(1000);
		
	}
	
	
	
	public void eratosthenes(int n)
	{
	  int []init=init(n);
	  int state=0;
	  for (int i = 0; i < init.length-1; i++) {
		  if (init[i]!=-1) {
			 int startNum=init[i];

		     for (int j = i+1; j < init.length; j++) {
			     int competeNum=init[j];
		    	 if (isMulti(startNum, competeNum)) {
				    init[j]=-1;
			     }
		     }
		  }
	   }
	  
	  for (int i = 0; i < init.length; i++) {
			if (init[i]!=-1) {
				System.out.println(init[i]);
			}
		}
	  
	}
	
	public int[] init(int n)
	{
		int []complete=new int[n-1];
		int len=complete.length;
		
		for (int i = 0; i < complete.length; i++) {
			complete[i]=i+2;
		}
		return complete;
	}
	
	public boolean isMulti(int min ,int max)
	{
		if (max%min==0) {
			return true;
		}else {
			return false;
		}
	}

}
