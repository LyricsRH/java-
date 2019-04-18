package ¾Å;

import java.util.ArrayList;

public class GrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String>arrayLis= new GrayCode().generateGrayCode(3);
		
		for (String string : arrayLis) {
			System.out.println(string);
		}
		
		
    
	}
	

	
	
	ArrayList<String> reserveAA(ArrayList<String>s){
		int n=s.size();
		for (int i = 0; i < n; i++) {
			s.add(s.get(n-1-i));
		}
		return s;
	}
	
    ArrayList<String> updateArrayList(ArrayList<String> arrayList){
    	int n=arrayList.size();
    	for (int i = 0; i < n/2; i++) {
			arrayList.set(i, '0'+arrayList.get(i));
		}
    	for (int i = n/2; i < n; i++) {
    		arrayList.set(i, '1'+arrayList.get(i));
		}
    	return arrayList;
    }

    ArrayList<String> s=new ArrayList<String>();
  
    
    ArrayList<String> generateGrayCode(int nBits){
    	
    	if (nBits==0) {
    		s.add("");
    		return s;	
		}else {
		  return  updateArrayList(reserveAA(generateGrayCode(nBits-1))) ;
		}
    }

}
