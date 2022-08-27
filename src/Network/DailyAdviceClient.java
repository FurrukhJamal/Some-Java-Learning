package Network;


//import java.io.*;
//import java.net.InetSocketAddress;
//import java.nio.channels.Channels;
//import java.nio.channels.SocketChannel;
//import java.nio.charset.StandardCharsets;
//
//public class DailyAdviceClient {
//
//	public void go() {
//		InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);
//		try(SocketChannel socketChannel = SocketChannel.open(serverAddress))
//		{
//			Reader channelReader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
//			BufferedReader bufferedReader = new BufferedReader(channelReader);
//			
//			String advice = bufferedReader.readLine();
//			
//			System.out.println("Today you Should : " +advice);
//			
//			bufferedReader.close();
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new DailyAdviceClient().go();
//
//	}
//
//}


import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class DailyAdviceClient {
  public void go() {
    InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);
    try (SocketChannel socketChannel = SocketChannel.open(serverAddress)) {
      Reader channelReader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
      BufferedReader reader = new BufferedReader(channelReader);
      String advice = reader.readLine();
      System.out.println("Today you should: " + advice);
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new DailyAdviceClient().go();
  }
}

