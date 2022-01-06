package ch08.prac.example01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명 입력");
		String name = scan.next();
		File file = new File(name);
		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
			StringBuffer sb = new StringBuffer();
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = scan.nextLine();
				if("그만".equals(line)) break;
				line = line +"\n";
				sb.append(line);
			}
			writer.write(sb.toString());
			System.out.println("저장하였습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("지정한 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
				}
			}
		}
	}

}
