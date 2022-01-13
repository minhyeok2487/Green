package org.comstudy.Thread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class WorkObject {
	public synchronized void MethodA() {
		System.out.println("Main에서 작업 중...");

		notify(); // Wait-Set영역에 있는 애들 깨우기
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void TimerThread1000() {
		System.out.println("타이머에서 작업 중...");

		notify();

		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
