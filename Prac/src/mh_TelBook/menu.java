package mh_TelBook;
import java.util.Scanner;

public class menu {
	
	public static Scanner scan = new Scanner(System.in);
	
	// 메뉴 출력 코드
	public static int Num() {
		int num = 0;
		while(true) {
			System.out.println("1.생성 2.출력 3.검색 4.수정 5.삭제 6.중복제거 7.종료 ");
			System.out.print("선택 >> ");
			num = scan.nextInt();
			if(num>7 || num<0) {
				System.out.println("범위 초과! 1~6 사이의 숫자를 입력하여 주십시오.");
			} else if(num<=7){
				break;
			}
		}
		return num;
	}
	
}
