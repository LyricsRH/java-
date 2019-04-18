package °Ë;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class H4 {

	public static final int  width=500;
	public static final int  length=500;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame=new JFrame();
		frame.add(new compne());
		frame.setSize(width, length);;
		frame.setBackground(Color.WHITE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	private static class compne extends JComponent{

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawLine(0, length/2, width/2, 0);
			g.drawLine(0, length/2, width/2, length);
			g.drawLine(width/2, length, width, length/2);
			g.drawLine(width/2, 0, width, length/2);
			
			g.fillRect(length/4, width/4, width/2, width/2);
			g.setColor(Color.red);
			g.fillOval(length/4, width/4, width/2, width/2);
		}
		
		
	}

}
