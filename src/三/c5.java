package 三;

import java.util.Scanner;

public class c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("输入单词");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		System.out.println("得分为："+ new c5().give(str));
	}

	public int give(String str)
	{
		int total=0;
		for (int i = 0; i < str.length(); i++) {
			char a=str.charAt(i);
			total+=grade(a);
		}
		return total;
	}
	
	public int grade(char c)
	{
		switch (c) {
		case 'A':case'E':case'I':case'L':case'N':case'O':case'R':case'S':case'T':case'U':
			return 1;
		case 'D':case'G':
			return 2;
		case 'B':case'C':case'M':case'P':
			return 3;
		case 'F':case'H':case'V':case'W':case'Y':
			return 4;
		case 'K':
			return 5;
		case 'J':case'X':
			return 8;	
		case 'Q':case'Z':
			return 10;
		default:
			break;
		}
		return 0;
	}

}
