package minhyeok.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Server01 {

	public static void main(String[] args) {
		// 서버에서 클라이언트 요청 대기
		byte[] by = new byte[65535];
		DatagramPacket packet = null;
		DatagramSocket socket = null;
		InetAddress ia = null;

		System.out.println("서버 준비 ...");
		try {
			ia = InetAddress.getLocalHost();
			System.out.println("LocalHost >>> " + ia.toString());
			try {
				socket = new DatagramSocket(1234, ia);
				packet = new DatagramPacket(by, by.length);
				try {
					socket.receive(packet);
					packet.setData(by);
					System.out.println(new String(by).trim());
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (SocketException e) {
				e.printStackTrace();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
