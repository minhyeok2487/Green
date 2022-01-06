package ch08.prac.example05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요 >>");
		String one = scan.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요 >>");
		String two = scan.nextLine();
		System.out.printf("%s와 %s를 비교합니다\n",one,two);
		
		File file1 = new File(one);
		File file2 = new File(two);

		FileReader reader1 = null;
		BufferedReader br1 = null;
		FileReader reader2 = null;
		BufferedReader br2 = null;
		
		int count = 0;
		try {
			reader1 = new FileReader(file1);
			br1 = new BufferedReader(reader1);
			reader2 = new FileReader(file2);
			br2 = new BufferedReader(reader2);
			if(br1.readLine() != br2.readLine()) {
				System.out.println("파일이 다릅니다.");
				count++;
			}
			if(count == 0) {
				System.out.println("파일이 같습니다.");
			}
		} catch (Exception e) {
			System.out.println("지정한 파일이 없습니다.");
		}
		
		
		
	}

}
