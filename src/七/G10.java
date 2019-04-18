package Æß;

import java.util.Scanner;
import java.util.Stack;

public class G10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new RPNcompute().run();
	}
	
}

class RPNcompute{
	
	
	Stack<String > stack=new Stack<String>();
	
	public void run(){
		
		Scanner scanner=new Scanner(System.in);
		String string;
		while(!(string=scanner.nextLine()).equals("Q")){
			
			if (!(string.contains("/")||string.contains("*")||string.contains("+")||string.contains("-"))) {
				stack.push(string);
			}else {
				char c=string.charAt(0);
				switch (c) {
				case '/':
					int[] n1= Rational.divide(stack.pop());
					Rational rational=new Rational(n1[0],n1[1]);
					int[] n2= Rational.divide(stack.pop());
                	String s=new Rational(n2[0],n2[1]).divideRational(rational).toString();
                	stack.push(s);
                	System.out.println(s);
                    break;
                case '+':
                	int[] n3= Rational.divide(stack.pop());
                	Rational rational2=new Rational(n3[0],n3[1]);
                	int[] n4= Rational.divide(stack.pop());
                	String s1=rational2.addRational(new Rational(n4[0],n4[1])).toString();
                	stack.push(s1);
                	System.out.println(s1);
                	break;
                case '-':
                	int[] n5= Rational.divide(stack.pop());
                	Rational rational3=new Rational(n5[0],n5[1]);
                	int[] n6= Rational.divide(stack.pop());
                	String s3=rational3.subRational(new Rational(n6[0],n6[1])).toString();
                	stack.push(s3);
                	System.out.println(s3);
                	break;
                case '*':
                	int[] n7= Rational.divide(stack.pop());
                	Rational rational4=new Rational(n7[0],n7[1]);
                	int[] n8= Rational.divide(stack.pop());
                	String s4=rational4.mutiplRational(new Rational(n8[0],n8[1])).toString();
                	stack.push(s4);
                	System.out.println(s4);
                	break;
				}
	
			}
			
		}
		
		
		
		
	}
	
	
	
	
	
}










class Rational{
	private int num;
	private int den;
	
	public Rational(int num,int den){
		if (den==0) throw new RuntimeException("·ÖÄ¸Îª0");
		if (num==0) {
			this.num=0;
			this.den=1;
		}else {
			int g=gcd(Math.abs(num),Math.abs(den) );
			this.num=num/g;
			this.den=Math.abs(den/g);
			if (den<0) {
				num=-num;
			}
		}
	}
	
	public Rational(){
		this(0);
	} 
	
	public Rational(int n){
		this(n,1);
	}
	
	public int gcd(int m,int n){
		int r=m%n;
		while(r!=0){
		m=n;
		n=r;
		r=m%n;
		}
		return n;
	}
	
	public Rational addRational(Rational r2){
		return new Rational( this.num*r2.den+this.den*r2.num
				,this.den*r2.den);
	}
	
	public Rational mutiplRational(Rational r2){
		return new Rational(this.num*r2.num,this.den*r2.den);
	}
	
	public Rational divideRational(Rational r2){
		return new Rational(this.num*r2.den,this.den*r2.num);
	}
	
	public Rational subRational(Rational r2){
		return new Rational(this.num*r2.den-this.den*r2.num,this.den*r2.den);
	}
	
	public String toString(){
		if (this.den==1) {
			return num+"";
		}else {
			return num+"/"+den;
		}
	}

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}
	
	public static int[] divide(String string){
		int []k=new int[2];
		if (string.contains("/")) {
			String num=string.substring(0, string.indexOf('/'));
			String den=string.substring(string.indexOf('/')+1);
			int n=Integer.parseInt(num);
			int d=Integer.parseInt(den);
			k[0]=n;
			k[1]=d;
			return k;
		}else {
			k[0]=Integer.parseInt(string);
			k[1]=1;
			return k;
		}
	}
	
} 
