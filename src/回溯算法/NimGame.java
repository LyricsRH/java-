package �����㷨;
/*
 * ��13öӲ�ң�ÿһ�֣�û������1ö��2ö������3ö�������Ƿ���һ��
 * ��ϷĿ���Ǳ��ⱻ���������һöӲ��
 * 
 * ����˼·������ż������˫���������ż������ʣ��һö������ԡ�
 */

public class NimGame {
/*
 * ����a-b������������a��b. (int)(Math.random()*(b-a+1)+a)
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new NimGame().winNumer(13));
	}
	
	int winNumer(int nowNum){
		
		for (int i = 1; i < 4; i++) {
			if ((nowNum-i)%4==1) {
				return i;
			}
		}
		return (int)(3*Math.random()+1);
				
	}

}
