package prac05.tv;

public class IPTV extends ColorTV {
	private String IP;

	public IPTV(String iP, int size, int color) {
		super(size, color);
		IP = iP;
	}

	@Override
	public void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 ", IP);
		super.printProperty();
	}
	
}
