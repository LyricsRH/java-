package Îå;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new E1().GymnasticsJudge();
	}
	public void GymnasticsJudge()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of judgers:  ");
		int num=scanner.nextInt();
		System.out.println("Enter the goals from every judger:  ");
		double []goals=new double[num];
		
		for (int i = 0; i < num; i++) {
			goals[i]=scanner.nextDouble();
		}
		
		System.out.printf("the average of the competition is %4.2f%n",average(goals));
		
	}
	
	public double average(double []goals){
		double total=0.0;
		int num=goals.length;
		
		for (int i = 0; i < num; i++) {
			total+=goals[i];
		}
		
		return (total-max(goals)-min(goals))/(num-2);
	}
	
	public double average(double []goals,int k){
		double total=0.0;
		int num=goals.length;
		
		for (int i = 0; i < num; i++) {
			total+=goals[i];
		}
		
		return total/num;
	}
	
	public double max(double []goals){
		double max=goals[0];
		for (int i = 1; i < goals.length; i++) {
			if (goals[i]>max) {
				max=goals[i];
			}
		}
		return max;
	}
	
	public double min(double[]goals){
		double min=goals[0];
		for (int i = 1; i < goals.length; i++) {
			if (goals[i]<min) {
				min=goals[i];
			}
		}
		return min;
		
	}

}
