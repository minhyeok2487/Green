package org.comstudy21.layout;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Ex01Layout extends MyFrame {

	public Button btn1 = new Button("btn1");
	public Button btn2 = new Button("btn2");
	public Button btn3 = new Button("btn3");
	public Button btn4 = new Button("btn4");
	public Button btn5 = new Button("btn5");
	
	public static void main(String[] args) {
		new Ex01Layout().setVisible(true);
		

	}
	public Ex01Layout() {
		super("Layout manager 연습", 640,480);
		
		flowLayoutEx();
		//gridLayoutEx();
		//gridBagLayoutEx();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	
	private void gridBagLayoutEx() {
		// FlowLayout - 왼쪽에서 오른쪽으로 순서대로 붙인다.
		this.setLayout(new GridBagLayout());
		this.add(btn1);

	}
	
	private void gridLayoutEx() {
		// FlowLayout - 왼쪽에서 오른쪽으로 순서대로 붙인다.
		this.setLayout(new GridLayout(2,3,5,5));
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		
	}
	
	private void flowLayoutEx() {
		// FlowLayout - 왼쪽에서 오른쪽으로 순서대로 붙인다.
		this.setLayout(new FlowLayout());
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
	}

	public void borderLayoutEx() {
		// Window를 상속받은 Frame은 디폴트 레이아웃이 BorderLayout
		add(BorderLayout.NORTH,btn1 );
		add(BorderLayout.SOUTH,btn2 );
		add(BorderLayout.WEST,btn3 );
		add(BorderLayout.EAST,btn4 );
		add(BorderLayout.CENTER,btn5 );
	}
	
	

}
