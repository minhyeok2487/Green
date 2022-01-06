package mh_TelBook.model;

public class Number {
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
