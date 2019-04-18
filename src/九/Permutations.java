package ��;

import java.util.TreeSet;

//P247��������
//���ذ���ָ���ַ������������еļ���
public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String>treeSet= new Permutations().generatePermutations("ABC");
        for (String string : treeSet) {
			System.out.println(string);
		}
	}
	
	TreeSet<String> generatePermutations(String string){
		
		TreeSet<String>treeSet=new TreeSet<String>();
		if (string.length()==0) {
			treeSet.add("");
		}else {
			for (int i = 0; i < string.length(); i++) {
				char c=string.charAt(i);
			    //�������±���string2,��������string��������������
				String string2=string.substring(0,i)+string.substring(i+1);
				for (String string3 : generatePermutations(string2)) {
					treeSet.add(c+string3);
				}
			}
		}
		return treeSet;
	}
}
