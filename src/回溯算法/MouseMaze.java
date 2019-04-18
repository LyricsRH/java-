package 回溯算法;

public class MouseMaze {

	public static int Exit_X=8;
	public static int Exit_Y=10;
	public static int [][]Maze={
		{1,1,1,1,1,1,1,1,1,1,1,1},
		{1,0,0,0,1,1,1,1,1,1,1,1},
		{1,1,1,0,1,1,0,0,0,0,1,1},
		{1,1,1,0,1,1,0,1,1,0,1,1},
		{1,1,1,0,0,0,0,1,1,0,1,1},
		{1,1,1,0,1,1,0,1,1,0,1,1},
		{1,1,1,0,1,1,0,1,1,0,1,1},
		{1,1,1,0,1,1,0,1,1,0,1,1},
		{1,1,0,0,0,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,1,1,1,1},
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Start start=new Start(1, 1);
		Maze[start.getX()][start.getY()]=9;
		
		System.out.println(new MouseMaze().isExistEnd(start));
	    
		for (int[] m : Maze) {
			for (int maze : m) {
				System.out.print(maze+" ");
			}
			System.out.println();
		}
	}

	boolean isOutMaze(Start start){
		if (start.getX()==Exit_X&&start.getY()==Exit_Y) {
			Maze[Exit_X][Exit_Y]=9;
			return true;
		}else {
			return false;
		}
	}

	//将此点标记
	void mark(Start start){
		Maze[start.getX()][start.getY()]=2;
	}

	//判断这个点是否被标记，被标记值为2
	boolean isMarked(Start start){
		if(Maze[start.getX()][start.getY()]==2){
			return true;
		}else {
			return false;
		}
	}

	//将此点改为0,取消标记
	void quitMarked(Start start){
		Maze[start.getX()][start.getY()]=0;
	}
	
	//返回新的坐标点
	Start goStart(Start start,Direct direct){
		Start reStart=new Start(0, 0); 
		switch (direct) {
		case NORTH:
			reStart.setX(start.getX());
			reStart.setY(start.getY()-1);
			return reStart;
		case SOUTH:
			reStart.setX(start.getX());
			reStart.setY(start.getY()+1);
			return reStart;
		case WEST:
			reStart.setX(start.getX()-1);
			reStart.setY(start.getY());
			return reStart;	
		case EAST:
			reStart.setX(start.getX()+1);
			reStart.setY(start.getY());
			return reStart;
		}
		return reStart;
	
	}
	
	//判断这个方向的下一步是否是墙
	boolean isWall(Start start,Direct direct){
		if(Maze[goStart(start, direct).getX()][goStart(start, direct).getY()]==1){
			return true;
		}
		else{
			return false;
		}
	}
	
	/*
	boolean isExistEnd(Start start){
		
		if (isOutMaze(start)) {
			return true;
		}if (isMarked(start)) {
			return false;
		}
		mark(start);
		for (Direct direct : Direct.values()) {
			if (!isWall(start, direct)) {
			if(	isExistEnd(goStart(start, direct))){
				return true;
			}
		    } 
		}
		quitMarked(start);
		return false;
	}
}

*/
	int minN=100;	
int  isExistEnd(Start start){
	
	
		if (isOutMaze(start)) {
			return 1;
		}if (isMarked(start)) {
			return -1;
		}
		mark(start);
		int  min=100;
		for (Direct direct : Direct.values()) {
			
			if (!isWall(start, direct)) {		
				int n;
				if ((n=isExistEnd(goStart(start, direct)))!=-1) {
					n= n+1;
					if (n<min) {
						min=n;
					}
				}
		    }
		}
		if (min!=100) {
			return min;
		}else {
			quitMarked(start);
			return -1;
		}
		
	}
}

class Start{
	int x;
	int y;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Start(int x,int y){
		this.x=x;
		this.y=y;
	}
	
}

enum Direct{
	NORTH,SOUTH,EAST,WEST
}



