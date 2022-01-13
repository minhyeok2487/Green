package org.comstudy.Thread;

import javax.swing.*;
import java.awt.*;

public class TimerThread1000 extends Thread {
	private JLabel timerLabel;
	private WorkObject workObj;

	public TimerThread1000(JLabel timerLabel, WorkObject workObj) {
		this.timerLabel = timerLabel;
		this.workObj = workObj;
	}

	@Override
	public void run() {
		// 스레드의 실행 메소드 재정의 - start()에 의해서 실행됨.
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			workObj.TimerThread1000();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}

	}

}
