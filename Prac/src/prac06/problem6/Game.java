package prac06.problem6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Game {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		SimpleDateFormat ss = new SimpleDateFormat("ss");

		System.out.println("10초에 가까운 사람이 이기는 게임입니다");
		
		System.out.print("황기태 시작 <Enter>키 >> ");
		scan.nextLine();
		Calendar past = Calendar.getInstance();
		String pastnum= ss.format(past.getTime());
		System.out.println("\t현재 초 시간 = "+pastnum);
		
		System.out.print("10초 예상 후 <Enter>키 >> ");
		scan.nextLine();
		Calendar now = Calendar.getInstance();
		String nownum= ss.format(now.getTime());
		System.out.println("\t현재 초 시간 = "+nownum);
		
		int num1 =  now.get(Calendar.SECOND) - past.get(Calendar.SECOND);
		
		System.out.print("이재문 시작 <Enter>키 >> ");
		scan.nextLine();
		past = Calendar.getInstance();
		pastnum= ss.format(past.getTime());
		System.out.println("\t현재 초 시간 = "+pastnum);
		
		System.out.print("10초 예상 후 <Enter>키 >> ");
		scan.nextLine();
		now = Calendar.getInstance();
		nownum= ss.format(now.getTime());
		System.out.println("\t현재 초 시간 = "+nownum);
		
		int num2 =  now.get(Calendar.SECOND) - past.get(Calendar.SECOND);
		
		System.out.printf("황기태의 결과 %d, 이재문의 결과 %d",num1, num2);
	}

}
