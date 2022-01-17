package minhyeok.test3;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class ServerFrame extends JFrame{
	Container c = null;
	int frameWidth = 640, frameHeight=480;
	String title = "Server Client System ";
	public ServerFrame(String userId) {
		c = getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(title+userId);
		// 창 사이즈 조정
		setSize(frameWidth, frameHeight);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	private void display() {
		c.setLayout(new BorderLayout());
	}
	
}
