package 七;

public class G6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	new G6().run();
		
	}
	
	public void run(){
		int []atoms=new int[5000];
		int year=0;
		while(!isAllDie(atoms)){
			for (int i = 0; i < atoms.length; i++) {
				if (Math.random()>0.50) {
					atoms[i]++;
				}
			}
			year++;
			System.out.println("第"+year+"年末还有原子数目"+numOfAtom(atoms));
		}
	}
	
	
	public  boolean isAllDie(int []atoms)
	{
		for (int i = 0; i < atoms.length; i++) {
			if (atoms[i]==0) {
				return false;
			}
		}
		return true;
	}

	public int numOfAtom(int[] atoms){
		int num=0;
		for (int i = 0; i < atoms.length; i++) {
			if (atoms[i]==0) {
				num++;
			}
		}
		return num;
	}
}
