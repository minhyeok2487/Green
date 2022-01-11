package org.comstudy21.ex02;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
	
	public MyJFrame() {
		this("My JFrame",200,200);
	}
	
	
	public MyJFrame(String title, int w, int h) {
		// 닫기 버튼 누를때 강제종료 이벤트 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 타이틀 지정
		setTitle(title);
		
		// 크기 설정
		setSize(w,h);
		
		// 가운데 출력
		Toolkit tk = this.getToolkit().getDefaultToolkit();
		int scrW = (int) tk.getScreenSize().getWidth();
		int scrH = (int) tk.getScreenSize().getHeight();
		
		int x = scrW/2 - w/2;
		int y = scrH/2 - h/2;
		
		this.setLocation(x,y);
		
		displayLayer();
		actionEvent();
	}


	protected void actionEvent() {
		// TODO Auto-generated method stub
		
	}


	protected void displayLayer() {
		// TODO Auto-generated method stub
		
	}



}
