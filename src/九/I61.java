package ��;

import java.util.Set;
import java.util.TreeSet;

public class I61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer>set=new TreeSet<Integer>();
		set.add(1);set.add(2);
		set.add(3);set.add(4);
		System.out.println(new I61().ifHas(set, 1));
	}
	
	boolean ifHas(TreeSet<Integer>set ,int target){
		
		if (set.isEmpty()) {
			System.out.println(target);
			return target==0;
		}else {
			int a=set.first();	
			//����Ҫ��set���¸�ֵ��
			//����ݹ�ʱ������������仯��Ҫ���¸�ֵ��
			TreeSet<Integer>treeSet=new TreeSet<Integer>(set);
			treeSet.remove(a);
			return ifHas(treeSet, target)||ifHas(treeSet, target-a);
			
			}
			
		}
		
		
	}


