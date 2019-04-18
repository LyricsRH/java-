package 六;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 *结果： 失败
 *原因：变量在方法内外定义，变量值随着方法调用而不同改变。每个队列有一个自己服务时间，没有解决
 *分析：每个队列服务相互独立，我使用一个方法，一个变量，使三个队列共用一个服务时间，
 * */
public class F51 {

	private static final int seconds=1;
	private static final int minutes=60;
	public static final double arrivePossible=0.007;
	public static final int minServeTime=30*seconds;
	public static final int maxServeTime=5*minutes;
    public static final int  sumTime=500*minutes;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Simulation result given the following constants");
		System.out.printf("  %-23s:%7d %3s%n", "sumTime",sumTime/60,"min");
		System.out.printf("  %-23s:%7d %3s%n", "minServeTime",minServeTime,"sec");
		System.out.printf("  %-23s:%7d %3s%n", "maxServeTime",maxServeTime,"sec");
		System.out.printf("  %-23s:%7.3f%n", "arrivePossible",arrivePossible);
		
		new F51().run();
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
		
		Queue<Integer> queue1=new ArrayDeque<Integer>();
		Queue<Integer> queue2=new ArrayDeque<Integer>();
		Queue<Integer> queue3=new ArrayDeque<Integer>();
		
		for (int i = 0; i < sumTime; i++) {
			if (isArriving(arrivePossible)) {
				int len1=queue1.size();
				int len2=queue2.size();
				int len3=queue3.size();
				
				int minLen=minNum(len1, len2, len3);
				if (minLen==len1) {
					queue1.add(i);
				}else if (minLen==len2) {
					queue2.add(i);
				}else if (minLen==len3) {
					queue3.add(i);
				}
			}
			
			serve(queue1, i,1);
			serve(queue2, i,2);
			serve(queue3, i,3);
		}
	    //变量定义在方法外，每次调用方法，使用的都是同一个变量。
		double[]queResult1=serve(queue1, sumTime-1,1);

		
        double nserver1=queResult1[0];
        double totalWaitTime1=queResult1[1]/60.0;
        double totalQueLen1=queResult1[2];

	
     printResult(nserver1, totalWaitTime1, totalQueLen1, 1);	

	}
	
	//返回最小值
	public static int minNum(int a,int b,int c){
		if (a<=b) {
			if (a<=c) {
				return a;
			}else {
				return c;
			}
		}else {
			if (b<=c) {
				return b;
			}else {
				return c;
			}
		}
	}
	
	int lastServeTime=0,lastServeTime1=serveTime(),lastServeTime2=serveTime(),lastServeTime3=serveTime();
	double totalWaitTime=0;
	double nServer=0;
	double totalQueLen=0;
	double []result=new double[3];
	public double[] serve(Queue<Integer> queue,int nowTime,int k )
	{
		   //先判断是哪个服务台，为其安排相应的服务时间
		    switch (k) {
			case 1:
				lastServeTime=lastServeTime1;
				break;
			case 2:
				lastServeTime=lastServeTime2;
				break;
			case 3:
				lastServeTime=lastServeTime3;
				break;
			default:
				break;
			}
		
			//一直服务到时间为0
			if (lastServeTime>0) {
				lastServeTime--;
			}
			//再判断队列是不是空。如果不空，此时剩余服务时间为0，应该出队列
			else if(!queue.isEmpty()){
				//移除值为进入队列时间，当前时间减去-进入时间=此人等待时间。
				totalWaitTime+=nowTime-queue.remove();
				//出去的每一个人
				nServer++;
				//定义下一个服务时间
				int  lastServeTime1=serveTime();	
				int  lastServeTime2=serveTime();
				int  lastServeTime3=serveTime();
			}
			//每一秒的队长之和
			totalQueLen+=queue.size();
		System.out.println("现在时间:"+nowTime +"总队列长: "+totalQueLen+"当前队列长："+queue.size()+"当前人数："+nServer
				+"当前等待时长："+totalWaitTime+"当前队列"+k+"当前服务时长"+lastServeTime);
		
		
		result[0]=nServer;result[1]=totalWaitTime;result[2]=totalQueLen;
		return result;
	}

	//输出结果
	public void printResult(double nServer,double   totalWaitTime,double totalLength,int n){
		System.out.println("第"+n+"个队列");
		System.out.printf("%-25s:%7f%n", "Customers served",nServer);
		System.out.printf("%-25s:%7.2f %3s%n", "Average waiting time",totalWaitTime/(nServer*60),"min");
		System.out.printf("%-25s:%7.2f%n", "Average queue length",totalLength/sumTime);
		System.out.println();
		
	}
}
