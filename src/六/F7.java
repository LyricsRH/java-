package 六;

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
	    //经过randNum(4)+1;时间，球落下//落入的格子值为-1
		
		
		while(!ball.isEmpty()){
			int num=0;
			while(!ball.contains(0))
			{   num=0;
				for (int i = 0; i < ball.size(); i++) {
					int v=ball.get(i)-1;
					ball.set(i, v);
					if (v==0) {
						//remove只能移除第一个值，因此需要确定有几个0，移除几次。
						num++;
					}
				}
				time++;
				if (ball.size()>maxSkyNum) {
					maxSkyNum=ball.size();
					maxTime=time;
				}
				
			}
			//n个球都落地了，如果落得地方==0，激活两个球，并将值+1.若不为0,则加一。
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
		
		System.out.println("仿真时间："+time+"空中球数最多："+maxSkyNum+"当时时间"+maxTime);
		System.out.println(beAte(Grid));
	
	}
	//返回0-m随机整数，不包含m
	public static  int randNum(int m)
	{
		Random random=new Random();
		return random.nextInt(m);
	}
	
    //返回二维数组中所有不为0的个数
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
