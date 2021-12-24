package prac04_Reservation;

import java.util.Scanner;

class menu{
	
}



public class ReservationMain {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
		int num = scan.nextInt();
		if(num == 1) {
			RunResr a = new RunResr();
			a.Run();
		} else if(num == 2) {
			RunView a = new RunView();
			a.Run();
		} else if(num == 3) {
			RunDel a = new RunDel();
			a.Run();
		} else if(num == 4) {
			RunExit a = new RunExit();
			a.Run();
		}
	}

}
