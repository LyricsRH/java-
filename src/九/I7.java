package 九;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

//找出由给定起始单词中的字母子集构成的所有英文单词

public class I7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>dicSet=new TreeSet<String>();
		
		dicSet.add("happy");
		dicSet.add("a");
		dicSet.add("ay");
		dicSet.add("hap");
		dicSet.add("ha");
		dicSet.add("hay");
		ArrayList<Character>startC=new ArrayList<Character>();
		startC.add('h');startC.add('a');startC.add('p');startC.add('p');startC.add('y');
		char []c={'h','a','p','p','y'};
	new I7().EmbeddedWords(dicSet,c,0);
	}
	
        void EmbeddedWords(Set<String>dicSet,  char []c,int m){
		String s="happy";
    	if (m==c.length) {
			String string="";
    		for (char d : c) {
    			if (d!='!') {
    				string+=d;
				}
			}
    		if(dicSet.contains(string)){
    			System.out.println(string);
    		}
		}else {
		//必须要对c[m]赋值。？？？？？
			//用对c[m]两次赋值，进行覆盖，获取所有可能。再在树最低端，进行判断输出。递归分解过程最好不要管输出。
			c[m]=s.charAt(m);
			EmbeddedWords(dicSet,c, m+1);
			c[m]='!';
			EmbeddedWords(dicSet,c, m+1);
		}	
    	
    
	}
}
