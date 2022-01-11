package org.comstudy21.ex01;

import java.awt.*;
import java.awt.event.*;

public class Ex02BtnEvt extends MyFrame {
	Button btn1 = new Button("button 01");
	Panel leftPan = new Panel();
	Panel centerPan = new Panel();
	Panel rowPan1 = new Panel();
	Panel rowPan2 = new Panel();
	Panel rowPan3 = new Panel();
	Panel rowPan4 = new Panel();
	Panel rowPan5 = new Panel();
	Panel gridPan = new Panel(new GridLayout(5,1));
	TextField txtFld1 = new TextField(10);
	TextField txtFld2 = new TextField(10);
	TextField txtFld3 = new TextField(10);
	
	public List ex() {
		List selectOne = new List(6);
        selectOne.setLocation(20,40);
        selectOne.setSize(100,120);
        selectOne.add("student");
        selectOne.add("Teacher");
        selectOne.add("Driver");
        selectOne.add("Computer Programmer");
        selectOne.add("Sales Man");
        selectOne.add("Musician");
        selectOne.add("Director");
        return selectOne;
	}
	
	
	public Ex02BtnEvt() {
		super("Member management system",640,480);
		add(BorderLayout.WEST, leftPan);
		add(BorderLayout.CENTER, centerPan);
		centerPan.add(new Label("CenterPan"));
		rowPan1.add(new Label("btn01 :"));
		rowPan1.add(btn1);
		rowPan2.add(new Label("Text01 :"));
		rowPan2.add(txtFld1);
		rowPan3.add(new Label("Text02 :"));
		rowPan3.add(txtFld2);
		rowPan4.add(new Label("Text03 :"));
		rowPan4.add(txtFld3);
		rowPan5.add(new Label("List :"));
		rowPan5.add(ex());
		gridPan.add(rowPan1);
		gridPan.add(rowPan2);
		gridPan.add(rowPan3);
		gridPan.add(rowPan4);
		gridPan.add(rowPan5);
		
		leftPan.add(gridPan);
		
	}
	public static void main(String[] args) {
		new Ex02BtnEvt().setVisible(true);

	}

}
