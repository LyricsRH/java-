package °Ë;

import java.util.Stack;

public class HanioT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		problem problem=new problem(3, 'A', 'B', 'C');
		Stack<problem> stack=new Stack<problem>();
		stack.add(problem);
		problem newProblem=null;
		while(!stack.isEmpty()&&(newProblem=stack.pop())!=null){
			if (newProblem.n==1) {
				System.out.println("moveOneFrom "+newProblem.start+" To "+newProblem.end);
			}
			else {
				stack.push(new problem(newProblem.n-1, newProblem.temp, newProblem.end, newProblem.start));
				stack.push(new problem(1, newProblem.start, newProblem.end, newProblem.temp));
				stack.push(new problem(newProblem.n-1, newProblem.start, newProblem.temp,newProblem.end));
			}
		}
	}

}

class problem{
	
	char start ,end, temp;
	int n;
	public problem(int n,char start ,char end ,char temp){
		this.n=n;
		this.start=start;
		this.end=end;
		this.temp=temp;
	}
}
