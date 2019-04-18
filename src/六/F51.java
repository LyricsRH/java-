package ��;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 *����� ʧ��
 *ԭ�򣺱����ڷ������ⶨ�壬����ֵ���ŷ������ö���ͬ�ı䡣ÿ��������һ���Լ�����ʱ�䣬û�н��
 *������ÿ�����з����໥��������ʹ��һ��������һ��������ʹ�������й���һ������ʱ�䣬
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
	    //���������ڷ����⣬ÿ�ε��÷�����ʹ�õĶ���ͬһ��������
		double[]queResult1=serve(queue1, sumTime-1,1);

		
        double nserver1=queResult1[0];
        double totalWaitTime1=queResult1[1]/60.0;
        double totalQueLen1=queResult1[2];

	
     printResult(nserver1, totalWaitTime1, totalQueLen1, 1);	

	}
	
	//������Сֵ
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
		   //���ж����ĸ�����̨��Ϊ�䰲����Ӧ�ķ���ʱ��
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
		
			//һֱ����ʱ��Ϊ0
			if (lastServeTime>0) {
				lastServeTime--;
			}
			//���ж϶����ǲ��ǿա�������գ���ʱʣ�����ʱ��Ϊ0��Ӧ�ó�����
			else if(!queue.isEmpty()){
				//�Ƴ�ֵΪ�������ʱ�䣬��ǰʱ���ȥ-����ʱ��=���˵ȴ�ʱ�䡣
				totalWaitTime+=nowTime-queue.remove();
				//��ȥ��ÿһ����
				nServer++;
				//������һ������ʱ��
				int  lastServeTime1=serveTime();	
				int  lastServeTime2=serveTime();
				int  lastServeTime3=serveTime();
			}
			//ÿһ��Ķӳ�֮��
			totalQueLen+=queue.size();
		System.out.println("����ʱ��:"+nowTime +"�ܶ��г�: "+totalQueLen+"��ǰ���г���"+queue.size()+"��ǰ������"+nServer
				+"��ǰ�ȴ�ʱ����"+totalWaitTime+"��ǰ����"+k+"��ǰ����ʱ��"+lastServeTime);
		
		
		result[0]=nServer;result[1]=totalWaitTime;result[2]=totalQueLen;
		return result;
	}

	//������
	public void printResult(double nServer,double   totalWaitTime,double totalLength,int n){
		System.out.println("��"+n+"������");
		System.out.printf("%-25s:%7f%n", "Customers served",nServer);
		System.out.printf("%-25s:%7.2f %3s%n", "Average waiting time",totalWaitTime/(nServer*60),"min");
		System.out.printf("%-25s:%7.2f%n", "Average queue length",totalLength/sumTime);
		System.out.println();
		
	}
}
