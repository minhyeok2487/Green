package mh_TelBook.controller;
import java.util.Scanner;

public class menu {
	
	public static Scanner scan = new Scanner(System.in);
	
	// 메뉴 출력 코드
	public static int Num() {
		int num = 0;
		int end = 9; //유효성 검사 용이하기 위함
		while(true) {
			System.out.println("1.생성 2.출력 3.검색 4.수정 5.삭제 6.중복제거 7.파일로 저장 8.파일 불러오기 9.종료 ");
			System.out.print("선택 >> ");
			num = scan.nextInt();
			//유효성검사
			if(num>end || num<0) {
				System.out.printf("범위 초과! 1~%d 사이의 숫자를 입력하여 주십시오.\n",end);
			} else if(num<=end){
				break;
			}
		}
		return num;
	}
	
}
