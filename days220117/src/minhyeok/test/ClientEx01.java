package minhyeok.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx01 {

	public static void main(String[] args) {
		String str = null;
		Scanner scan = new Scanner(System.in);
		System.out.print("내용 입력 : ");
		str = scan.nextLine();
		
		InetAddress ia = null;
		DatagramPacket packet = null;
		DatagramSocket socket = null;
		
		try {
			ia = InetAddress.getLocalHost();
			packet = new DatagramPacket(str.getBytes(), str.getBytes().length, ia, 1234);
			try {
				socket = new DatagramSocket();
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				socket.send(packet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
