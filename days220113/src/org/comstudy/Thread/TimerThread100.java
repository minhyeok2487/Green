package org.comstudy.Thread;

import javax.swing.JLabel;

public class TimerThread100 extends Thread {
	private JLabel timerLabel;

	public TimerThread100(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		// 스레드의 실행 메소드 재정의 - start()에 의해서 실행됨.
		synchronized(this){
			int n = 0;
			while(true) {
				timerLabel.setText(Integer.toString(n));
				n++;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
        }
	}
	
	
}
