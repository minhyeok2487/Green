package org.comstudy21.ex01;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {

	// 디폴트 생성자
	public MyFrame() {
		// 생성자 오버로딩 호출
		this("My-Frame",200,200);
	}
	
	public MyFrame(String title, int w, int h) {
		setTitle(title);
		setSize(w,h);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		Toolkit tk = this.getToolkit().getDefaultToolkit();
		int scrW = (int) tk.getScreenSize().getWidth();
		int scrH = (int) tk.getScreenSize().getHeight();
		
		int x = scrW/2 - w/2;
		int y = scrH/2 - h/2;
		
		this.setLocation(x,y);
	}
}
