package GUI;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class TwoButtons {
	private JFrame frame;
	private JLabel label;
	
	public static void main(String[] args) {
		TwoButtons gui = new TwoButtons();
		gui.go();

	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton colorButton = new JButton("Change Button");
		JButton labelButton = new JButton("Change Label");
		
		label = new JLabel("A Label");
		
		MyDrawPanel panel = new MyDrawPanel();
		
		colorButton.addActionListener(new ColorButtonListener());
		labelButton.addActionListener(new LabelListener());
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		
		frame.setSize(900, 900);
		frame.setVisible(true);
		
		
	}
	
	class LabelListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			label.setText("Label has been changed");
		}
	}
	
	class ColorButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}

}
