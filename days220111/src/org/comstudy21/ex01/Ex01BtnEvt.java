package org.comstudy21.ex01;

import java.awt.*;
import java.awt.event.*;

public class Ex01BtnEvt extends MyFrame{
	private Button[] btnArr = new Button[2];
	{
		// 초기화 블럭 - 필드를 초기화하는 구역
		btnArr[0] = new Button("Button1");
		btnArr[1] = new Button("Button2");
	}
	private Label lbl = new Label("[Result] No button pressed");
	public Ex01BtnEvt() {
		super("Button Event Ex",400,200);
		start();
		BtnEvent();
	}
	
	public void start() {
		Panel southPan = new Panel();
		Panel centerPan = new Panel(new GridBagLayout());
		southPan.add(btnArr[0]);
		southPan.add(btnArr[1]);
		centerPan.add(lbl);
		lbl.setAlignment(Label.CENTER);
		this.add(BorderLayout.SOUTH,southPan);
		this.add(BorderLayout.CENTER,centerPan);
	}
	
	public void BtnEvent() {
		btnArr[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText("Frist clicked.");
			}
		});
		btnArr[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText("Second clicked.");
			}
		});
		
	}
	

	public static void main(String[] args) {
		new Ex01BtnEvt().setVisible(true);

	}

}
