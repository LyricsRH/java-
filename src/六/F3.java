package ��;

import java.util.Stack;

public class F3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Character> stack=new Stack<Character>();
		stack.push('A');
		stack.push('B');
		stack.push('C');
		stack.push('D');
		
	//	new F3().printStack(stack);
		new F3().roll(stack, 2, 4);
	}
	
	public void roll(Stack<Character>stack,int n,int k){
		int num=k%n;
		int size=stack.size();
		if (n<0||k<0||n>size) {
			System.out.println("Wrong");
		}
		
	//	printStack(stack);�����ȴ�ӡ����Ϊ��ӡҪpop,��ӡ��stackҲ�Ϳ��ˡ�
		Stack<Character> temp=new Stack<Character>();
		
		for (int m = 0; m < num; m++) {
		
		
		char c=stack.pop();
	
		for (int i = 0; i < n-1; i++) {
			char te=stack.pop();
			temp.push(te);
		}
		stack.push(c);
		int numb=temp.size();
		//ע��  ��i<numb.size()д��������Ϊ�����Ĵ�Сһֱ�ڼ�С��popһ����С1.���̶���
		for (int i = 0; i <numb; i++) {
			stack.push(temp.pop());
		}	
		
		}
		
		System.out.println("===================");
		printStack(stack);
		
		
		
		
	}

	public void printStack(Stack<Character>stack){
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
}
