package prac.ch08;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Vector;

import prac.basic.Word;

public class SaveTXT {
	public static void savetxt(Vector<Word> v) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("EngKor.txt");
		OutputStreamWriter writer=new OutputStreamWriter(fout,"UTF-8");
		BufferedWriter out=new BufferedWriter(writer);
		
		for(int i =0; i<v.size();i++) {
			String English = v.get(i).getEnglish();
			String Korean = v.get(i).getKorean();
			out.append(English);
			out.append("\t");
			out.append(Korean);
			out.append("\n");
		}
		
		try {
			System.out.println("저장되었습니다.");
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
}
