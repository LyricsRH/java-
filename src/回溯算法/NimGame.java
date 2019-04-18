package 回溯算法;
/*
 * 共13枚硬币，每一轮，没人拿走1枚，2枚，或者3枚。将他们放在一起。
 * 游戏目标是避免被迫拿走最后一枚硬币
 * 
 * 初步思路，奇数偶数区别双方，最后是偶数，且剩余一枚。则可以。
 */

public class NimGame {
/*
 * 返回a-b的整数，包括a和b. (int)(Math.random()*(b-a+1)+a)
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
