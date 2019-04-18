package 七;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class G11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
	}
	
	
	
	public  double caculate(String string){
		
		ArrayDeque<String> arrayDeque=tranInput(string);
		Queue<String >aQueue=new ArrayDeque<String>();
		String s1="";
		
		
		while(!arrayDeque.isEmpty()){
			//弹出一个数字
			s1=arrayDeque.remove();
			//最后一个数字
			if (arrayDeque.isEmpty()) 
				{aQueue.add(s1);
				break;}
			//弹出一个符号，并判断
			String fuhao= arrayDeque.remove();
			int n=returnVarit(fuhao);
			//
			
			if (n==1||n==2) {
				aQueue.add(s1);
				aQueue.add(fuhao);
				
			}
			else {
			
			while(n!=1&&n!=2){
				if (n==3) {
				  s1=String.valueOf(Double.parseDouble(s1)*Integer.parseInt(arrayDeque.remove()));
				  if (arrayDeque.isEmpty()) {fuhao="";break;}
				  fuhao=arrayDeque.remove();
				//  System.out.println(fuhao+" "+n);
				  n=returnVarit(fuhao);
				//  System.out.println(fuhao+" "+n);
				}else if(n==4) {
				  s1=String.valueOf(Double.parseDouble(s1)/Double.parseDouble(arrayDeque.remove()));
				  if (arrayDeque.isEmpty()) break;
				  fuhao=arrayDeque.remove();
				  n=returnVarit(fuhao);
				}
			}
			  aQueue.add(s1);
			  aQueue.add(fuhao);
			}	
		}

		
		
		
		
		double finalRe=Double.parseDouble(aQueue.remove());
	
		int n=0;
		while(!aQueue.isEmpty()){
			n=returnVarit(aQueue.remove());
			if (n==1) {
				finalRe+=Double.parseDouble(aQueue.remove());	
			}else if (n==2){
				finalRe-=Double.parseDouble(aQueue.remove());
			}else {
				 finalRe=finalRe;
			}
		}
		
		return finalRe;
	}
	
	public ArrayDeque<String> tranInput(String string){
		ArrayDeque<String> arDeque=new ArrayDeque<String>();
		String teString="";
		
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			if (returnVarit(c+"")!=-1) {
				//符号，加入队列
				arDeque.add(teString);
				teString="";
				arDeque.add(c+"");
			}else {
				teString+=c;
			}
		}
		arDeque.add(teString);
		
		return arDeque;
		
	}
	
	public int returnVarit(String string){
		switch (string) {
		case "+":
			return 1;
		case "-":
			return 2;
		case "*":
			return 3;
		case "/":
			return 4;
		default:
			return -1;
		}
	}
	
	public int returnVarit2(String string){
		switch (string) {
		case "+":
			return 1;
		case "-":
			return 2;
		case "*":
			return 3;
		case "/":
			return 4;
		case "(":
			return 5;
		case ")":
			return 6;
		default:
			return -1;
		}
	}

	public double caculatInclud(String string){
		
		Stack<String> stack=new Stack<String>();
		String teString="";
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			if (returnVarit(c+"")!=-1) {
				//符号，加入队列
				stack.push(teString);
				teString="";
				stack.push(c+"");
			}else {
				teString+=c;
			}
		}
		//压入栈过程中有)，就一直弹出直到有（。计算中间值，再压入栈。
		return 0;
	}
}
