package ��;

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
	
	//�˿ͷ���ʱ��
	public int serveTime(){
		return (int) Math.floor(minServeTime+((double)maxServeTime-minServeTime+1)*Math.random());
	}
	
	//�˿͵���,����С��p�򵽴�
	public boolean isArriving(double p){
		return Math.random()<p;
	}
	
	//�Ŷӷ���
    
	public void run(){
		
		Queue<Integer> queue=new ArrayDeque<Integer>();
		int lastServeTime=0;
		double totalWaitTime=0;
		int nServer=0;
		double totalQueLen=0;
		
		for (int i = 0; i < sumTime; i++) {
			
			//��i�뵽�������У�iΪ����ʱ��
			if (isArriving(arrivePossible)) {
				queue.add(i);
			}	
			//һֱ����ʱ��Ϊ0
			if (lastServeTime>0) {
				lastServeTime--;
			}
			//���ж϶����ǲ��ǿա�������գ���ʱʣ�����ʱ��Ϊ0��Ӧ�ó�����
			else if(!queue.isEmpty()){
				//�Ƴ�ֵΪ�������ʱ�䣬��ǰʱ���ȥ-����ʱ��=���˵ȴ�ʱ�䡣
				totalWaitTime+=i-queue.remove();
				//��ȥ��ÿһ����
				nServer++;
				//������һ������ʱ��
				lastServeTime=serveTime();
			}
			//ÿһ��Ķӳ�֮��
			totalQueLen+=queue.size();
		}
		
		printResult(nServer, totalWaitTime, totalQueLen);
	}

	//������
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
