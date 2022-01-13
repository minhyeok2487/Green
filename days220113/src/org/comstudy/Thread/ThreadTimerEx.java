package org.comstudy.Thread;

public class ThreadTimerEx extends Thread {
	private WorkObject workObj;

	public ThreadTimerEx(WorkObject workObj) {
		this.workObj = workObj;
	}

	@Override
	public void run() {
		while (true) {
			workObj.MethodA();
		}
	}

}
