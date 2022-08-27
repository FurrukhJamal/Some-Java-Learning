package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui3 implements ActionListener {
	private JFrame frame;
	public static void main(String[] args) {
		SimpleGui3 gui = new SimpleGui3();
		gui.go();

	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Change Color");
		button.setBackground(Color.yellow);
		button.addActionListener(this);
		
		MyDrawPanel drawpanel = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.CENTER, drawpanel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		frame.setSize(800, 800);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		frame.repaint();
	}

}
