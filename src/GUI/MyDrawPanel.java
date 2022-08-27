package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class MyDrawPanel extends JPanel {

	public void paintComponent(Graphics g) {
		//g.setColor(Color.orange);
		//g.fillRect(0,50, 300, 300);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		Random random = new Random();
		int red = random.nextInt(256);
		int green = random.nextInt(256);
		int blue = random.nextInt(256);
		
		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		//fill a circle at the center of the screen
		g.fillOval(this.getWidth()/2 -150/2, this.getHeight()/2 - 150/2, 150, 150);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.red);
		g2d.fill3DRect(20, 20, 80, 80, true);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MyDrawPanel());
		frame.setSize(600, 600);
		frame.setVisible(true);

	}

}
