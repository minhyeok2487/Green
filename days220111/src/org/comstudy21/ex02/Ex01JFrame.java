package org.comstudy21.ex02;

import java.awt.*;
import javax.swing.*;

public class Ex01JFrame extends MyJFrame {

	protected Container contentPan = null;
	JPanel fieldPanel, buttonPanel, mainPanel;
	JLabel name, id, password, age,l_register;
	JTextField nameField, idField, passwordField, ageField;
	JButton b_register, b_reregister;
	GridBagConstraints c;

	@Override
	protected void displayLayer() {
		// 가운데 영역
		fieldPanel = new JPanel();
		fieldPanel.setLayout(new GridBagLayout());
		// 여백 설정
		fieldPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 5, 25));
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		name = new JLabel("이        름: ");
		id = new JLabel("아이디: ");
		password = new JLabel("비밀번호: ");
		age = new JLabel("나이: ");
		nameField = new JTextField(15);
		idField = new JTextField(15);
		passwordField = new JTextField(15);
		ageField = new JTextField(15);
		c.gridx = 0;
		c.gridy = 0;
		fieldPanel.add(name, c);
		c.gridx = 1;
		c.gridy = 0;
		fieldPanel.add(nameField, c);
		c.gridx = 0;
		c.gridy = 1;
		fieldPanel.add(id, c);
		c.gridx = 1;
		c.gridy = 1;
		fieldPanel.add(idField, c);
		c.gridx = 0;
		c.gridy = 2;
		fieldPanel.add(password, c);
		c.gridx = 1;
		c.gridy = 2;
		fieldPanel.add(passwordField, c);
		c.gridx = 0;
		c.gridy = 3;
		fieldPanel.add(age, c);
		c.gridx = 1;
		c.gridy = 3;
		fieldPanel.add(ageField, c);
		
		// 버튼 패널
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		b_register = new JButton("가입하기");
        b_register.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_reregister = new JButton("다시쓰기");
        b_reregister.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonPanel.add(b_register);
        buttonPanel.add(b_reregister);
        
        // 합치기
		mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5,5,25,5));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(fieldPanel);
        mainPanel.add(buttonPanel);
  
        this.setContentPane(mainPanel);
        this.pack();
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	protected void actionEvent() {

	}

	public Ex01JFrame() {
		super("이름,아이디,패스워드,나이", 600, 500);
	}

	public static void main(String[] args) {
		new Ex01JFrame().setVisible(true);
	}

}
