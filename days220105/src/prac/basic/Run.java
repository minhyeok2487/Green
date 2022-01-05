package prac.basic;

import java.util.Vector;
import java.util.Scanner;

class Run {
	public static Scanner scan = new Scanner(System.in);
	
	public static void run(Vector<Word> v) {
		System.out.println("단어 테스트 입니다. -1입력하면 종료합니다.");
		while (true) {
			PutRandomNumber R = new PutRandomNumber();
			int[] n = R.Ran(); // 1~4까지 랜덤숫자를 중복되지 않게 생성
			String[] Answer = new String[4]; //4지선다를 출력하기 위한 Array생성

			int AnswerNumber = (int) (Math.random()*v.size()); //문제 생성
			System.out.println(v.get(AnswerNumber).getEnglish() + "?"); //문제 출력

			Answer[n[0] - 1] = v.get(AnswerNumber).getKorean(); //4지선다에 문제 저장
			for (int i = 1; i < 4; i++) {
				//4지선다를 위해 다른 보기 3개 만들기
				int OtherNumber = (int) (Math.random() * v.size());
				for(int j=0; j<i; j++) { //중복 유효성 검사
					if(Answer[n[j] - 1] == v.get(OtherNumber).getKorean()) {
						i--;
						break;
					}
					Answer[n[i] - 1] = v.get(OtherNumber).getKorean();
				}
				
			}
			
			// 4지선다 출력
			for (int i = 0; i < Answer.length; i++) {
				System.out.printf("(%d)%s ", i + 1, Answer[i]);
			}
			
			// 정답 입력후 확인
			System.out.print(":>");
			int InputAnswer = scan.nextInt();
			if (InputAnswer == -1) {
				System.out.println("단어테스트를 종료합니다...");
				break;
			}
			if (InputAnswer == n[0]) {
				System.out.println("Excellent!!");
			} else {
				System.out.println("No.!!");
			}
		}

	}
}
