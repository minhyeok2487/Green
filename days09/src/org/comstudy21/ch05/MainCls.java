package org.comstudy21.ch05;

import java.util.Scanner;

class Music {
	// 타입, 노래
	String type;
	String song;

	public Music() {

	}

	public Music(String type, String song) {
		this.type = type;
		this.song = song;
	}

	public void play() {
		System.out.printf("%s type의 %s가 실행됩니다.\n", type, song);
	}
}

class DanceMusic extends Music {
	String name;

	public DanceMusic(String name, String song, String type) {
		super(type, song);
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		super.play();
		System.out.printf("가수는 %s입니다.\n", name);
	}
}

class NCSMusic extends Music {

	public NCSMusic(String type, String song) {
		super(type, song);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		super.play();
		System.out.println("No Copyright Sound!");
	}

}

class MusicPlayer {
	Music musicList[] = new Music[12];
	int top = 0;

	public void appendMusic() {
		// 음악 추가
		System.out.println("타입과 노래제목을 입력하여주십시오");
		System.out.println("타입1은 Dance, 타입2는 NCS입니다.");
		System.out.print(">>> ");
		String type = scan.next();
		System.out.print(">>> ");
		String song = scan.next();
		if (type.equals("1")) {
			System.out.println("추가로 가수를 입력하여주십시오.");
			System.out.print(">>> ");
			String name = scan.next();
			musicList[top] = new DanceMusic(name, song, "Dance");
		} else if (type.equals("2")) {
			musicList[top] = new NCSMusic("NCS", song);
		}
		top++;
		System.out.println("완료되었습니다.");
	}

	public void removeMusic() {
		// 음악 제거
		System.out.println("제거할 노래제목을 입력하여 주십시오.");
		System.out.print(">>> ");
		String song2 = scan.next();
		int num = 0;
		for (int i = 0; i < top; i++) {
			if (song2.equals(musicList[i].song)) {
				System.out.println(musicList[i].song + "을 삭제합니다.");
				musicList[i] = new Music("", "");
				top--;
				num += 1;
				break;
			}
		}
		if (num == 0) {
			System.out.println("그런 노래는 없습니다.");
		}
	}

	public void findMusic() {
		// 음악 검색
		System.out.println("검색할 노래제목을 입력하여 주십시오.");
		System.out.print(">>> ");
		String song2 = scan.next();
		int num = 0;
		for (int i = 0; i < top; i++) {
			if (song2.equals(musicList[i].song)) {
				musicList[i].play();
				System.out.println();
				num += 1;
				break;
			}
		}
		if (num == 0) {
			System.out.println("그런 노래는 없습니다.");
		}
	}

	public void playAllMusic() {
		// 모든 음악 실행
		for(int i = 0; i<top ;i++) {
			musicList[i].play();
			System.out.println();
		}
	}
	

	Scanner scan = new Scanner(System.in);

	public void menu() {
		boolean a = true;
		while (a) {
			System.out.println("1.추가 2.전체 재생 3.선택 재성 4.제거 5.종료");
			System.out.print("선택 >>> ");
			int num = scan.nextInt();
			if (num == 1) {
				appendMusic();
			} else if (num == 2) {
				playAllMusic();
			} else if (num == 3) {
				findMusic();
			} else if (num == 4) {
				removeMusic();
			} else if (num == 5) {
				a = false;
			}
		}

	}

}

public class MainCls {

	public static void main(String[] args) {
		MusicPlayer play = new MusicPlayer();
		play.menu();
	}

}
