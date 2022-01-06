package ch08.prac.example02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Example02 {

	public static void main(String[] args) {
		File file = new File("phone.txt");
		FileReader reader = null;
		BufferedReader br = null;
		
		try {
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			String data = null;
			StringBuffer lines = new StringBuffer();
			while((data = br.readLine()) != null) {
				lines.append(data);
				lines.append("\n");
			}
			System.out.println(lines.toString());
		} catch (Exception e) {
			System.out.println("지정한 파일이 없습니다.");
		}
		
	}

}
