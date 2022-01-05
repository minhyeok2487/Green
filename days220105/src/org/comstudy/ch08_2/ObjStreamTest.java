package org.comstudy.ch08_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjStreamTest {

	public static File filename(String Filename) {
		File file = new File("C:\\Users\\Minhyeok\\Desktop\\git\\Green\\"+Filename+".dat");
		return file;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = filename("abc");
		FileOutputStream fos = new FileOutputStream(file);
		FileInputStream fis = new FileInputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Saram data = new Saram(1,"Hong","Hong123@naver.com");
		Saram data2 = new Saram(2,"Kim","Kim234@naver.com");
		Saram data3 = new Saram(3,"Lee","Lee456@naver.com");
		ArrayList<Saram> list = new ArrayList<Saram>();
		list.add(data);
		list.add(data2);
		list.add(data3);
		
		
		oos.writeObject(list);
		System.out.println("Write list!!");
		
		ArrayList<Saram> list2 = (ArrayList<Saram>) ois.readObject(); //형변환
		System.out.println(list2);
		System.out.println("Read list!!");
	}

}
