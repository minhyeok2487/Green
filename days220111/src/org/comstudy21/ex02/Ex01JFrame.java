package org.comstudy21.ex02;

import java.awt.*;
import javax.swing.*;


public class Ex01JFrame extends MyJFrame {

	protected Container contentPan = null;
	
	@Override
	protected void displayLayer() {
		contentPan = getContentPane();
		contentPan.add(BorderLayout.SOUTH, new Button("Hello"));
	}
	@Override
	protected void actionEvent() {
		
	}
	
	
	public Ex01JFrame() {
	
	}
	
	public static void main(String[] args) {
		new Ex01JFrame().setVisible(true);
	}

}
