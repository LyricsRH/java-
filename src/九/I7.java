package ��;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

//�ҳ��ɸ�����ʼ�����е���ĸ�Ӽ����ɵ�����Ӣ�ĵ���

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
		//����Ҫ��c[m]��ֵ������������
			//�ö�c[m]���θ�ֵ�����и��ǣ���ȡ���п��ܡ���������Ͷˣ������ж�������ݹ�ֽ������ò�Ҫ�������
			c[m]=s.charAt(m);
			EmbeddedWords(dicSet,c, m+1);
			c[m]='!';
			EmbeddedWords(dicSet,c, m+1);
		}	
    	
    
	}
}
