package minhyeok.test3;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Hashtable;

public class ServerThread extends Thread {
	// 다중 접속자들의 접속 정보를 저장하는 컬렉션 준비
	// 접속한 아이디의 소켓을 저장하거나 연결 스트리밍을 저장한다.

	static Hashtable<String, PrintWriter> map = new Hashtable<String, PrintWriter>();
	BufferedReader br;
	String userId;

	public ServerThread(BufferedReader br, String userId) {
		this.userId = userId;
		this.br = br;
	}

	@Override
	public void run() {
		while(true) {
			String line = null;
			try {
				line = br.readLine();
				Enumeration<String> keys = map.keys(); //userId가 Key
				while(keys.hasMoreElements()) {
					String key = keys.nextElement();
					PrintWriter pw = map.get(key);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// main 쓰래드에서는 접속자를 기다리는 역할을 한다.
	// 접속자가 접속되면 접속자의 출력정보를 map에 저장하고
	// 접속자의 쓰래드를 실행 시킨다.
	// 쓰래드는 클라이언트 보낸 데이터를 출력한다.
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket();
			System.out.println("서버에서 클라이언트 접속 대기 중....");
			
			while(true) {
				socket = serverSocket.accept(); // 접속이 들어올때까지 대기
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String userId = br.readLine();
				System.out.println(userId + "님이 접속 하였습니다.");
				PrintWriter pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
				map.put(userId, pw);
				// 하나 들어오면 서버 생성 및 쓰래드 실행
				new ServerThread(br,userId).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
