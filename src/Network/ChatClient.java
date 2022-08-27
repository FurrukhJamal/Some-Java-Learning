package Network;


import java.awt.BorderLayout;
import java.io.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

import javax.swing.*;

public class ChatClient {
	private JTextField outgoing;
	private PrintWriter writer;
	
	public void go() {
		this.setupNetwork();
		JFrame frame = new JFrame("Chat Client");
		
		outgoing = new JTextField(20);
		
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(e -> sendMessage());
		
		JPanel mainPanel = new JPanel();
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(400, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void setupNetwork() {
		try
		{
			InetSocketAddress address = new InetSocketAddress("127.0.0.1", 5000);
			SocketChannel socketChannel = SocketChannel.open(address);
			writer = new PrintWriter(Channels.newWriter(socketChannel, "UTF_8"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private void sendMessage() {
		writer.println(outgoing.getText());
		writer.flush();
		outgoing.setText("");
		outgoing.requestFocus();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatClient().go();
	}

}
