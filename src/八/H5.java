package °Ë;



import java.awt.Color;

import javax.swing.JFrame;
import javax.xml.stream.events.StartDocument;

import acm.graphics.GCanvas;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class H5 extends GraphicsProgram{
	
	 
	 
	private static final int getW=500;
	private static final int HEIGHT=500;
	private static final int BRICK_WIDTH=30;
	private static final int BRICK_HEIGHT=14;
	private static final int BRICK_IN_BASE=15;
	private static final int Lowest_NUM=12;
	private static final int HEGHT_NUM=Lowest_NUM;
	
	
	
	public void run(){
	
		int startWid;
	    int startHei;			
	    startWid=(getWidth()-Lowest_NUM*BRICK_WIDTH)/2;
	    startHei=(2*getHeight()-HEGHT_NUM*BRICK_HEIGHT)/2;
	    int num=Lowest_NUM;
 
	    
	    for (int i = 0; i < HEGHT_NUM; i++) {
			int layou_wid=startWid;
	    	for (int j = 0; j <num ; j++) {
				
				GRect gRect=new GRect(layou_wid,startHei ,BRICK_WIDTH,BRICK_HEIGHT);
				layou_wid+=BRICK_WIDTH;
				gRect.setFilled(false);
		        gRect.setColor(Color.RED);
		        add(gRect);
			}
	    	num--;
			startHei-=BRICK_HEIGHT;
			startWid+=BRICK_IN_BASE;
		}
	  
	}
	
	  public static void main(String[] args) {
			new H5().start(args);;
		}
}
