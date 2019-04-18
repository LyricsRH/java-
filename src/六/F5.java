package 六;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Queue;


public class F5 {

	private static final int seconds=1;
	private static final int minutes=60;
	public static final double arrivePossible=0.007;
	public static final int minServeTime=30*seconds;
	public static final int maxServeTime=5*minutes;
    public static final int  sumTime=500*minutes;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new F5().run();
		
	}
	
	//顾客服务时间
	public int serveTime(){
		return (int) Math.floor(minServeTime+((double)maxServeTime-minServeTime+1)*Math.random());
	}
	
	//顾客到达,概率小于p则到达
	public boolean isArriving(double p){
		return Math.random()<p;
	}
	
	//排队方法
    
	public void run(){
		
		Queue<Integer> queue=new ArrayDeque<Integer>();
		int lastServeTime=0;
		double totalWaitTime=0;
		int nServer=0;
		double totalQueLen=0;
		
		for (int i = 0; i < sumTime; i++) {
			
			//第i秒到达，加入队列，i为到达时间
			if (isArriving(arrivePossible)) {
				queue.add(i);
			}	
			//一直服务到时间为0
			if (lastServeTime>0) {
				lastServeTime--;
			}
			//再判断队列是不是空。如果不空，此时剩余服务时间为0，应该出队列
			else if(!queue.isEmpty()){
				//移除值为进入队列时间，当前时间减去-进入时间=此人等待时间。
				totalWaitTime+=i-queue.remove();
				//出去的每一个人
				nServer++;
				//定义下一个服务时间
				lastServeTime=serveTime();
			}
			//每一秒的队长之和
			totalQueLen+=queue.size();
		}
		
		printResult(nServer, totalWaitTime, totalQueLen);
	}

	//输出结果
	public void printResult(int nServer,double   totalWaitTime,double totalLength){
		System.out.println("Simulation result given the following constants");
		System.out.printf("  %-23s:%7d %3s%n", "sumTime",sumTime/60,"min");
		System.out.printf("  %-23s:%7d %3s%n", "minServeTime",minServeTime,"sec");
		System.out.printf("  %-23s:%7d %3s%n", "maxServeTime",maxServeTime,"sec");
		System.out.printf("  %-23s:%7.3f%n", "arrivePossible",arrivePossible);
		
		System.out.println("  ");
		
		System.out.printf("%-25s:%7d%n", "Customers served",nServer);
		System.out.printf("%-25s:%7.2f %3s%n", "Average waiting time",totalWaitTime/(nServer*60),"min");
		System.out.printf("%-25s:%7.2f%n", "Average queue length",totalLength/sumTime);
		
		
	}
}
