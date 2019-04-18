package 六;

import java.util.ArrayDeque;
import java.util.Queue;

public class F52 {
	static final int seconds=1;
	static final int minutes=60;
	public static final double arrivePossible=0.007;
	public static final int  sumTime=500*minutes;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new F52().run();
	}
	
	public void run(){
		
		Que que1=new Que();
		int len1=que1.size();
		Que que2=new Que();
		int len2=que2.size();
		Que que3=new Que();
		int len3=que3.size();
		
		for (int i = 0; i <sumTime ; i++) {
			//加入队列。
		if (Math.random()<arrivePossible) {
			int minN=F51.minNum(len1, len2, len3);
			if (minN==len1) {
				que1.add(i);
			}else if (minN==len2) {
				que2.add(i);
			}else if(minN==len3){
				que3.add(i);
			}			
		}
		
		que1.server(i);
		que2.server(i);
        que3.server(i);
		}
	    System.out.println("1"+que1.lastTime+"2"+que2.lastTime+"3"+que3.lastTime);
	}
	


}

 class Que extends ArrayDeque<Integer>{
	public static final int minServeTime=30*F52.seconds;
	public static final int maxServeTime=5*F52.minutes;
	public  int lastTime=0;
	Queue<Integer> queue;
	public static int totalWT=0;
	public static int nSer=0;
	public static int totalL=0;
	
	public Que(){
	     queue=new ArrayDeque<Integer>();
	}
	
	public void add(int nowTime){
		queue.add(nowTime);
	}
	public void server(int nowTime){
		if (lastTime>0) {
			lastTime--;
		}else if (!queue.isEmpty()) {
			 totalWT+=nowTime-queue.remove();
			 nSer++;
			 lastTime=serverRandomTime(minServeTime, maxServeTime);
			 totalL+=queue.size();
		}
	}
	
	public int serverRandomTime(int minServeTime, int maxServeTime){
		return (int) Math.floor(minServeTime+((double)maxServeTime-minServeTime+1)*Math.random());
	}
	
}
