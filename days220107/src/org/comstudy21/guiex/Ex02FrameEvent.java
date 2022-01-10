package org.comstudy21.guiex;

import java.awt.*;
import java.awt.event.*;



@SuppressWarnings("serial")
public class Ex02FrameEvent extends Frame implements WindowListener {
	public static final int WIDTH = 600, HEIGHT = 400;
	public Ex02FrameEvent() {
		setTitle("WindowListener 실습");
		setSize(WIDTH, HEIGHT);
		setLayout(null);
		setVisible(true);
		Ex02Button1();
		Ex02Button2();
		addWindowListener(this);
	}
	
	public void Ex02Button1() {
		Button button= new Button("버튼 1");
		button.setBounds(20,100,70,30);
		add(button);
	}
	
	public void Ex02Button2() {
		Button button= new Button("버튼 2");
		button.setSize(100,100);
		add(button);
	}

	public static void main(String[] args) {
		new Ex02FrameEvent();

	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		//창닫기 버튼 누를때 프로그램 종료
		dispose();
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}

}
