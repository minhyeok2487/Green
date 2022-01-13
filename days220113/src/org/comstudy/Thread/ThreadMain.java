package org.comstudy.Thread;

import javax.swing.*;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

public class ThreadMain extends JFrame {
	static JLabel timerLabel1000 = new JLabel();
	static JButton stopBtn = new JButton("STOP");
	static JButton playBtn = new JButton("PLAY");
	
	public ThreadMain() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 1));

		timerLabel1000.setFont(new Font("Gothic", Font.ITALIC, 20));
		JLabel message1000 = new JLabel("1초마다 증가 : ");
		message1000.setFont(new Font("Gothic", Font.ITALIC, 20));

		playBtn.setEnabled(false);

		c.add(message1000);
		c.add(timerLabel1000);
		c.add(stopBtn);
		c.add(playBtn);
		setSize(400, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ThreadMain();
		WorkObject workObj = new WorkObject();
		ThreadTimerEx tha = new ThreadTimerEx(workObj);
		TimerThread1000 thb = new TimerThread1000(timerLabel1000, workObj);
		

		tha.start();
		thb.start();

		
	}

}
