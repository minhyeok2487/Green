package ch08.prac.example06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요 >>");
		String one = scan.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요 >>");
		String two = scan.nextLine();
		
		FileReader reader = null;
		BufferedReader br = null;
		FileWriter writer = null;
		String name = "append.txt";
		StringBuffer lines = null;
		
		try {
			reader = new FileReader(one);
			br = new BufferedReader(reader);
			String data = null;
			lines = new StringBuffer();
			while((data = br.readLine()) != null) {
				lines.append(data);
				lines.append("\n");
			}
			reader = new FileReader(two);
			br = new BufferedReader(reader);
			data = null;
			while((data = br.readLine()) != null) {
				lines.append(data);
				lines.append("\n");
			}
		} catch (Exception e) {
			System.out.println("지정한 파일이 없습니다.");
		}
		File file = new File(name);
		writer = new FileWriter(file);
		writer.write(lines.toString());
		System.out.printf("프로젝트 폴더 밑에 %s 파일에 저장하였습니다.",name);
	}
}
