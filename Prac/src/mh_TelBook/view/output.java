package mh_TelBook.view;

import java.util.ArrayList;
import java.util.Scanner;
import mh_TelBook.model.save;
import mh_TelBook.model.Number;

public class output {
	
	// 현재 저장되어 있는 그룹 찾는 메소드
	public static void Allgroupname(){  
		System.out.println("현재 그룹");
		int n = save.top;
		String[] Allgroupname = new String[n];
		for(int i =0; i<n; i++) {
			Allgroupname[i] = save.sArr[i].group;
		}
		// 배열 중복제거 
		ArrayList<String> arrayList = new ArrayList<>();
		for(String data : Allgroupname){
		    if(!arrayList.contains(data))
		        arrayList.add(data);
		}
		System.out.println(arrayList);	 
    }  
	
	//전체 출력
	public static void outputAll() {
		save.Basic();
		for (Number std : save.sArr) {
			if (std == null)
				break;
			if (std.name != null) {
				System.out.println(std);
			}
		}
	}
	
	// 그룹출력
	private static void outputGroup() {
		System.out.println("그룹 검색을 시작합니다.");

		// 현재 그룹 출력
		Allgroupname();
	    
		// 검색할 그룹 
		int count = 0;
		System.out.print("검색할 그룹을 입력하여주십시오 >> ");
		String group = scan.next();
		save.Basic();
		for(int i=0; i<save.top; i++) {
			if(group.equals(save.sArr[i].group)) {
				System.out.println(save.sArr[i]);
				count++;
			} 
		}
		if(count == 0) {
			System.out.println("이 그룹의 데이터는 존재하지 않습니다.");
		}
	}
	
	public static Scanner scan = new Scanner(System.in);
	public static void Output() {
		System.out.println("::::::::::::::: 출력 :::::::::::::::");
		int num = 0;
		while(true) {
			System.out.println("1.전체출력 2.그룹출력");
			System.out.print("선택 >> ");
			num = scan.nextInt();
			if(num>2 || num<0) {
				System.out.println("범위 초과! 1과 2중 하나를 입력하여 주십시오.");
			} else if(num<=6){
				break;
			}
		}

		if(num == 1) {
			outputAll();
		} else if(num == 2) {
			outputGroup();
		} 
	}

}
