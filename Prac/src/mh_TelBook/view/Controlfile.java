package mh_TelBook.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import mh_TelBook.model.Number;
import mh_TelBook.model.save;

public class Controlfile {
	public static Scanner scan = new Scanner(System.in);

	public static void SaveAll() {
		System.out.println("::::::::::::::: 파일저장 :::::::::::::::");
		while (true) {
			System.out.print("전화번호부를 txt형식으로 저장합니까?(y/n)");
			String yesno_cheek = scan.next();
			if (yesno_cheek.equals("y") || yesno_cheek.equals("Y")) {
				runSave();
				break;
			} else if (yesno_cheek.equals("n") || yesno_cheek.equals("N")) {
				System.out.println("파일저장을 종료합니다");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	public static void runSave() {
		System.out.println("아래 내용을 저장합니다.");
		output.outputAll();
		System.out.print("저장할 파일 명을 입력하여 주십시오. >> ");
		String name = scan.next();
		name = name + ".txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(name);
			bw = new BufferedWriter(fw);
			//bw.write("[no]\t[name]\t[number]\t[group]"); // 버퍼에 데이터 입력
			//bw.newLine();
			for (Number std : save.sArr) {
				if (std == null)
					break;
				if (std.name != null) {
					bw.write(std.toString());
					bw.newLine();
				}
			}
			bw.flush();
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
			}
			try {
				bw.close();
			} catch (IOException e) {
			}
		}
	}

	public static void LoadAll() {
		System.out.println("::::::::::::::: 파일 불러오기 :::::::::::::::");
		while (true) {
			System.out.print("전화번호부를 불러옵니까?(y/n)");
			String yesno_cheek = scan.next();
			if (yesno_cheek.equals("y") || yesno_cheek.equals("Y")) {
				runLoad();
				break;
			} else if (yesno_cheek.equals("n") || yesno_cheek.equals("N")) {
				System.out.println("파일 불러오기를 종료합니다");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

	private static void runLoad() {
		System.out.println("저장된 내용에 추가됩니다.");
		System.out.print("불러올 파일 명을 입력하여 주십시오. >> ");
		String name = scan.next();
		name = name+ ".txt";
		try {
			File file = new File(name);
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				String[] str = line.split("\t");
				String Fname = str[1];
				String Fnumber = str[2];
				String Fgroup = str[3];
				save.sArr[save.top++] = new Number(save.sequence++, Fname, Fnumber, Fgroup);
			}
			bufReader.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
}
