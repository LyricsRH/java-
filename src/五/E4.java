package Îå;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class E4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	//	int []data={100,95,47,88,86,92,75,89,87,70,55,80};
		BufferedReader bReader=new BufferedReader(new FileReader("zhifangtu.txt"));
		Scanner scanner=new Scanner(bReader);
		scanner.useDelimiter(" ");
		int []data=new int[12];
		int k=0;
    	while(scanner.hasNext()){	
			int d=scanner.nextInt();
			data[k]=d;
			k++;
		}
		new E4().photo(data);
	}
	
	public void photo(int[] data){
		
		int[] numbers=new int [11];
		for (int i = 0; i < data.length; i++) {
			int n=gard(data[i]);
			numbers[n]++;
		}
		draw(numbers);
	}
	
	public void draw(int []numbers ){
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%3d: ", i*10);
			while(numbers[i]!=0){
				System.out.printf("*");
				numbers[i]--;
			}
			System.out.println("");
		}
	}
	
	public int gard(int n){
		if (n>=0&&n<10) {
			return 0;
		}else if (n>=10&&n<20) {
			return 1;
		}else if (n>=20&n<30) {
			return 2;
		}else if (n>=30&&n<40) {
			return 3;
		}else if (n>=40&n<50) {
			return 4;
		}else if (n>=50&&n<60) {
			return 5;
		}else if (n>=60&n<70) {
			return 6;
		}else if (n>=70&&n<80) {
			return 7;
		}else if (n>=80&n<90) {
			return 8;
		}else if (n>=90&&n<100) {
			return 9;
		}else if (n==100) {
			return 10;
		}else {
			return 121212;
		}
	}
	

}
