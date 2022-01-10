package org.comstudy21.guiex;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Ex04FrameEvent extends Frame {
	public static int WIDTH = 600, HEIGHT = 400;
	public Ex04FrameEvent() {
		setTitle("익명 내부 클래스와 WindowAdapter를 활용한 이벤트 핸들러 구현");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		
		// 인터페이스를 구현 하면서 인스턴스 생성 가능(익명 내부 클래스)
		// 1회용으로 사용이 끝난다.
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Ex04FrameEvent();

	}

}
