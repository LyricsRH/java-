package ��;

import java.util.ArrayList;
import java.util.TreeSet;

import javax.xml.transform.Templates;

public class I8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer>treeSet=new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(3);
		System.out.println(new I8().isMeasurable(2, treeSet));
	}
	
	boolean isMeasurable(int target,TreeSet<Integer>set){
		
		if (set.isEmpty()) {
			System.out.println(target);
			return target==0;
		}else {
			Integer n= set.first();
//			set.remove(n);
			//Ϊ���Ƴ���ʱ��Ҫ ���½�set��ֵ��һ���µ�set?
			//����ֱ����set��������������ֻ�ᵯ��һ����Ȼ��false,
			//*****************************************
			TreeSet<Integer>treeSet1=new TreeSet<Integer>(set);
			treeSet1.remove(n);
			//Ҳ��������� ���¸�ֵ�Ļ������ʵĶ���һ��tree��ַ��tree�ڵ�һ���ݹ��У�remove�˺ܶ࣬��˱�ɾ���˺ö���֦��
//			TreeSet<Integer>treeSet2=new TreeSet<Integer>(set);
//			treeSet2.remove(n);
//			TreeSet<Integer>treeSet3=new TreeSet<Integer>(set);
//			treeSet3.remove(n);
			return isMeasurable(target-n, treeSet1)||isMeasurable(target, treeSet1)||isMeasurable(target+n, treeSet1);	
		}
	
	
}

}
