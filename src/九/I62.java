package ��;

import java.util.TreeSet;

public class I62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> sampleSet = new TreeSet<Integer>();
		sampleSet.add(1);
		sampleSet.add(3);
		sampleSet.add(4);
		sampleSet.add(5);
		System.out.println(new I62().subsetSumWays(sampleSet,5));
		
	}
	
    int subsetSumWays(TreeSet<Integer>set,int target){
    	int num=0;
    	
    	if (set.isEmpty()) {
			if (target==0) {
				//n++���ȷ���n,�ټ�1�����һֻ���ص���n=0;
				return num+1;
			}else {
				return num;
			}
		}else {
			int a=set.first();
			TreeSet<Integer> treeSet=new TreeSet<Integer>(set);
			treeSet.remove(a);
			return subsetSumWays(treeSet, target)+subsetSumWays(treeSet, target-a);
		}
    }

}
