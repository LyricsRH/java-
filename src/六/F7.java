package ��;

import java.util.ArrayList;
import java.util.Random;

public class F7 {

	public static final int rows=25;
	public static final int lines=25;
//	public static final int allTime=;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ball=new ArrayList<Integer>();
		int time=0;
		ball.add(randNum(4)+1);
		int maxSkyNum=ball.size();
		int maxTime=0;
		
		int[][]Grid=new int[rows][lines];
	    //����randNum(4)+1;ʱ�䣬������//����ĸ���ֵΪ-1
		
		
		while(!ball.isEmpty()){
			int num=0;
			while(!ball.contains(0))
			{   num=0;
				for (int i = 0; i < ball.size(); i++) {
					int v=ball.get(i)-1;
					ball.set(i, v);
					if (v==0) {
						//removeֻ���Ƴ���һ��ֵ�������Ҫȷ���м���0���Ƴ����Ρ�
						num++;
					}
				}
				time++;
				if (ball.size()>maxSkyNum) {
					maxSkyNum=ball.size();
					maxTime=time;
				}
				
			}
			//n��������ˣ������õط�==0�����������򣬲���ֵ+1.����Ϊ0,���һ��
			for (int i = 0; i < num; i++) {
                int a=randNum(rows);
                int b=randNum(lines);
				if (Grid[a][b]==0) {
					Grid[a][b]+=1;
					ball.add(randNum(4)+1);
					ball.add(randNum(4)+1);
				}else {
					Grid[a][b]+=1;
				}
				ball.remove((Integer)0);
			}
		}
		
		System.out.println("����ʱ�䣺"+time+"����������ࣺ"+maxSkyNum+"��ʱʱ��"+maxTime);
		System.out.println(beAte(Grid));
	
	}
	//����0-m���������������m
	public static  int randNum(int m)
	{
		Random random=new Random();
		return random.nextInt(m);
	}
	
    //���ض�ά���������в�Ϊ0�ĸ���
	public static int beAte(int [][]a)
	{
		int num=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j]!=0) {
					num++;
				}
			}
		}
		return num;
	}
	

}
