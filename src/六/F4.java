package ��;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

public class F4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Queue<String> qStrings=new Queue<String>();����!  Queue��һ���ӿڣ�����һ���ࡣ������ArrayDeque��Linkedlist������
		Queue<String> qStrings=new ArrayDeque<String>();
		qStrings.add("abc");
		qStrings.add("def");
		qStrings.add("ghi");
		
		new F4().reserveQueue(qStrings);
			
	}
	public void reserveQueue(Queue<String> queue){
		int numb=queue.size();
		Stack<String> tempStack=new Stack<String>();
		
		while(!queue.isEmpty()){
			tempStack.push(queue.remove());
		}
		
		while(!tempStack.isEmpty()){
			queue.add(tempStack.pop());
		}
		
		while(!queue.isEmpty()){
		System.out.println(queue.remove());
		}
		
	}

}
