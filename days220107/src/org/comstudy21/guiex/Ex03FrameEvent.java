package org.comstudy21.guiex;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ex03FrameEvent extends Frame{
	public static int WIDTH = 600, HEIGHT = 400;
	public Ex03FrameEvent() {
		setTitle("Inner Class를 활용한 이벤트 처리 연습");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		
		WindowListener l = new InnerWindowListener();
		addWindowListener(l);
	}
	
	// 클래스 내부에 클래스를 선언한다.(매우 중요!)
	class InnerWindowListener implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {}
		@Override
		public void windowClosing(WindowEvent e) {
			WIDTH = 100;
			HEIGHT = 100;
			setSize(WIDTH, HEIGHT);
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
	
	
	
	public static void main(String[] args) {
		new Ex03FrameEvent();
	}

}
