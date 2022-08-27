package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class SimpleAnimation {

	private int xPos = 70;
	private int yPos = 70;
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel panel = new MyDrawPanel();
		
		frame.getContentPane().add(panel);
		
		frame.setSize(900, 900);
		frame.setVisible(true);
		
		for(int i = 0 ; i < 130; i++)
		{
			xPos++;
			yPos++;
			
			panel.repaint();
			try {
				TimeUnit.MILLISECONDS.sleep(50);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	class MyDrawPanel extends JPanel{
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(Color.magenta);
			g.fillOval(xPos, yPos, 100, 100);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleAnimation animation = new SimpleAnimation();
		animation.go();

	}

}
