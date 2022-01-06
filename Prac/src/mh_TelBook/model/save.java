package mh_TelBook.model;

public class save {
	public static void Basic() {
		System.out.printf("[no]\t[name]\t[number]\t[group]\n");
	}

	public static final int MAX = 100;
	public static Number[] sArr = new Number[MAX];
	public static int top = 0; // 스택 자료구조처럼.
	public static int sequence = 1;

	// static 초기화 블럭 (어느정도 전화번호 저장)
	static {
		sArr[top++] = new Number(sequence++, "이민혁", "010-2427-2487", "기본");
		sArr[top++] = new Number(sequence++, "홍길동", "010-1234-6659", "친구");
		sArr[top++] = new Number(sequence++, "박지성", "010-4445-1126", "직장");
		sArr[top++] = new Number(sequence++, "오지호", "010-2222-1659", "직장");
		sArr[top++] = new Number(sequence++, "정은하", "010-1321-0156", "친구");
		sArr[top++] = new Number(sequence++, "이정연", "010-0669-4875", "직장");
		sArr[top++] = new Number(sequence++, "이민혁", "010-2427-2487", "친구");
		sArr[top++] = new Number(sequence++, "오지호", "010-4892-1659", "기본");
		sArr[top++] = new Number(sequence++, "조보아", "010-4489-6694", "친구");
		
	}
}
