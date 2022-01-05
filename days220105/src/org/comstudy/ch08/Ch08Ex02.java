package org.comstudy.ch08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class Ch08Ex02 {

	// 객체를 파일에 저장하고 객체를 읽어온다.
	// 자바는 객체지향 언어이므로 객체 저장이 더 효과적이다.
	// 객체 직렬화 - 객체를 저장하고 읽을 때 필요한 개념.
	// 객체를 집에 비유한다면...
	// 
	
	public static void main(String[] args) throws IOException {
		Fos(null);
		Dis(null);
	}
	
	public static void Fos(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Minhyeok\\Documents\\data2.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("저장 할 문장 입력 : ");
		String ins = null;
		StringBuffer stringData = new StringBuffer();
		while((ins = br.readLine()) != null) {
			stringData.append(ins);
			stringData.append("\n");
			
		}
		
		dos.writeUTF(stringData.toString());
		dos.close();
	}
	
	public static void Dis(String[] args) throws IOException {
		File file = new File("C:\\Users\\Minhyeok\\Documents\\data2.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String s = null;
		try {
			s = dis.readUTF(); // UTF로 기록된 데이터를 읽어온다.
		} catch (IOException e) {
			System.out.println("UTF 읽기 오류 발생");
		} finally {
			System.out.println(s);
			dis.close();	
		}
		
	}
	
	
	public static void test11(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		File file = new File("C:\\Users\\Minhyeok\\Documents\\data2.txt");
		FileWriter fw = new FileWriter(file);
		
		// 키보드로 데이터를 입력 받아서 fw를 이용해서 data2.txt파일에 기록하기
		System.out.println("데이터 입력");
		String s = scan.nextLine();
		fw.write(s);
		fw.close();
	}
	
	
	public static void test10(String[] args) throws IOException {
		File file = new File("C:\\Users\\Minhyeok\\Documents\\12회차_문제3-3_약수_소스.txt");
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		String s = null;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
	}
	
	
	
	public static void main06(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Minhyeok\\Documents\\12회차_문제3-3_약수_소스.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
	}
	
	
	
	public static void main05(String[] args) throws IOException {
		OutputStream os = System.out;
		byte[] by = new byte[255];

		System.out.print("문자 입력 << ");
		System.in.read(by);

		String s = new String(by).trim();

		os.write(s.getBytes());
		readfile(null);
	}

	public static void readfile(String[] args) throws IOException {
		// 파일에서 데이터 읽어오기
		File file = new File("C:\\Users\\Minhyeok\\Documents\\12회차_문제3-3_약수_소스.txt");
		FileInputStream is = new FileInputStream(file);
		int data = 0;
		while ((data = is.read()) != -1) {
			System.out.write(data);
		}
		is.close();
		System.out.println("파일 읽기 완료!");
	}

	public static void test04(String[] args) throws IOException {
		// File
		File file = new File("C:\\Users\\Administrator\\test_myfile.txt");
		if (file.exists()) {
			System.out.println(">>>> 있다!");
			if (file.isDirectory()) {
				String[] fileList = file.list();
				for (String fileName : fileList) {
					System.out.println(fileName);
				}
			} else {
				if (file.delete()) {
					System.out.println(">>>> 파일이 삭제 됨!");
				}
			}
		} else {
			System.out.println(">>>> 없다!");
			if (file.createNewFile()) {
				System.out.println("파일이 생성 되었습니다.");
			}
		}
	}

	public static void test03(String[] args) throws IOException {
		// 파일에서 데이터 읽어오기
		// InputStream is = System.in;
		File file = new File("C:\\Users\\Administrator\\data.txt");
		FileInputStream is = new FileInputStream(file);
		int data = 0;
		while ((data = is.read()) != -1) {
			System.out.write(data);
		}
		is.close();
		System.out.println("파일 읽기 완료!");
	}

	public static void test02(String[] args) throws IOException {
		// OutputStream os = System.out;
		FileOutputStream os = new FileOutputStream("C:\\Users\\Administrator\\data.txt");
		InputStream is = System.in;

		// int data = is.read(); // 아스키코드 a(97), A(65), 0(48), \n(13)
		// System.out.println(data);
		System.out.println("데이터를 입력 해 보세요. (끝내려면 Ctrl+z) :");
		int data = 0;
		while ((data = is.read()) != -1) { // EOF일때까지 (Ctrl + z)
			os.write(data);
		}
		os.close();
		System.out.println("입력 종료!");
	}

	public static void test01(String[] args) throws IOException {
		OutputStream os = System.out; // 업캐스팅
		byte[] by = new byte[255];

		System.out.print("문자 입력 << ");
		System.in.read(by);

		String s = new String(by).trim();

		os.write(s.getBytes());
	}

}
