package mh_TelBook;

class Number {
	public int no; // 번호
	public String name; // 이름
	public String number; // 전화번호
	public String group; // 그룹

	public Number() {
		// 디폴트 생성자 - 인자가 없다. 아무일도 하지 않는다.
	}

	// 객체를 사용하면 toString()이 자동 호출된다.
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + number + "\t" + group;
	}

	public Number(int no, String name, String number, String group) {
		this.no = no;
		this.name = name;
		this.number = number;
		this.group = group;
	}

}

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
		sArr[top++] = new Number(sequence++, "오지호", "010-4892-1659", "직장");
		sArr[top++] = new Number(sequence++, "정은하", "010-1321-0156", "친구");
		sArr[top++] = new Number(sequence++, "이정연", "010-0669-4875", "직장");
		sArr[top++] = new Number(sequence++, "이민혁", "010-2427-2487", "친구");
		sArr[top++] = new Number(sequence++, "오지호", "010-4892-1659", "기본");
		sArr[top++] = new Number(sequence++, "조보아", "010-4489-6694", "친구");
		
	}
}
