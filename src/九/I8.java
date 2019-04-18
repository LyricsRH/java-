package 九;

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
			//为甚移除的时候要 重新将set赋值给一个新的set?
			//如上直接用set，后面两棵树，只会弹出一个，然后false,
			//*****************************************
			TreeSet<Integer>treeSet1=new TreeSet<Integer>(set);
			treeSet1.remove(n);
			//也许是如果不 重新赋值的话。访问的都是一个tree地址，tree在第一个递归中，remove了很多，因此被删掉了好多树枝；
//			TreeSet<Integer>treeSet2=new TreeSet<Integer>(set);
//			treeSet2.remove(n);
//			TreeSet<Integer>treeSet3=new TreeSet<Integer>(set);
//			treeSet3.remove(n);
			return isMeasurable(target-n, treeSet1)||isMeasurable(target, treeSet1)||isMeasurable(target+n, treeSet1);	
		}
	
	
}

}
