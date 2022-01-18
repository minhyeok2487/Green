package org.comstudy21.ImgIO;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.*;

class Airplan02 extends JPanel {
	Image img;
	String imagePath = "C:\\Users\\Minhyeok\\Desktop\\git\\Green\\days220114\\src\\org\\comstudy21\\ImgIO\\airplan01.png";
	BufferedImage bfImg;
	public int x = 300, y = 300;
	public JLabel imgLbl = null;

	public Airplan02() {
		ImageIcon imgIcon = new ImageIcon(imagePath);
		img = imgIcon.getImage();
		Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(newImg);
		setLayout(null);
		imgLbl = new JLabel(imgIcon);
		this.add(imgLbl);
		imgLbl.setBounds(x, y, 100, 100);
	}
}

class Airplan01 extends JPanel implements Runnable{
	Image img2;
	String imagePath2 = "C:\\Users\\Minhyeok\\Desktop\\git\\Green\\days220114\\src\\org\\comstudy21\\ImgIO\\airplan02.png";
	public int x2 = 300, y2 = 100;
	public JLabel imgLbl2 = null;
	Image img;
	String imagePath = "C:\\Users\\Minhyeok\\Desktop\\git\\Green\\days220114\\src\\org\\comstudy21\\ImgIO\\airplan01.png";
	public int x = 300, y = 300;
	public JLabel imgLbl = null;
	Random rand = new Random();
	
	public int x3 = 150, y3 = 50;
	public JLabel imgLbl3 = null;
	
	public Airplan01() {
		ImageIcon imgIcon3 = new ImageIcon(imagePath2);
		Image img3 = imgIcon3.getImage();
		Image newImg3 = img3.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		imgIcon3 = new ImageIcon(newImg3);
		setLayout(null);
		imgLbl3 = new JLabel(imgIcon3);
		this.add(imgLbl3);
		imgLbl3.setBounds(x3, y3, 100, 100);
		
		ImageIcon imgIcon2 = new ImageIcon(imagePath2);
		img2 = imgIcon2.getImage();
		Image newImg2 = img2.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		imgIcon2 = new ImageIcon(newImg2);
		setLayout(null);
		imgLbl2 = new JLabel(imgIcon2);
		this.add(imgLbl2);
		imgLbl2.setBounds(x2, y2, 100, 100);
		
		ImageIcon imgIcon = new ImageIcon(imagePath);
		img = imgIcon.getImage();
		Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(newImg);
		setLayout(null);
		imgLbl = new JLabel(imgIcon);
		this.add(imgLbl);
		imgLbl.setBounds(x, y, 100, 100);
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000/30);
				y2 += 10;
				if(y2>=600) {
					y2 = 0;
					x2 = 100 + (int)rand.nextInt(500);
				}
				imgLbl2.setBounds(x2, y2, 100, 100);
				
				Thread.sleep(1000/60);
				y3 += 20;
				if(y3>=600) {
					y3 = 0;
					x3 = 100 + (int)rand.nextInt(500);
				}
				imgLbl3.setBounds(x3, y3, 100, 100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



class MyCenterPan extends JPanel {
	public Airplan01 airplan01 = new Airplan01();

	public MyCenterPan() {
		setLayout(new BorderLayout());
		airplan01.setBackground(Color.GRAY);
		add(airplan01);
		play();
	}
	
	private void play() {
		Thread airplai02th = new Thread(airplan01);
	    airplai02th.start();
	}
}

class MyContentPan extends JPanel {
	MyCenterPan centerPan = new MyCenterPan();

	public MyContentPan() {
		setBackground(Color.PINK);
		layoutComponent();
		actionEvetn();
	}
	

	private void actionEvetn() {
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_LEFT) {
					centerPan.airplan01.x = centerPan.airplan01.x - 10;
					centerPan.airplan01.imgLbl.setBounds(centerPan.airplan01.x, centerPan.airplan01.y, 100, 100);
					repaint();
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					centerPan.airplan01.x = centerPan.airplan01.x + 10;
					centerPan.airplan01.imgLbl.setBounds(centerPan.airplan01.x, centerPan.airplan01.y, 100, 100);
					repaint();
				} else if (keyCode == KeyEvent.VK_UP) {
					centerPan.airplan01.y = centerPan.airplan01.y - 10;
					centerPan.airplan01.imgLbl.setBounds(centerPan.airplan01.x, centerPan.airplan01.y, 100, 100);
					repaint();
				} else if (keyCode == KeyEvent.VK_DOWN) {
					centerPan.airplan01.y = centerPan.airplan01.y + 10;
					centerPan.airplan01.imgLbl.setBounds(centerPan.airplan01.x, centerPan.airplan01.y, 100, 100);
					repaint();
				}

			}
		});
		// Focus를 읽을 수 있도록 설정 한다.
		this.setFocusable(true);
		this.requestFocus();
	}

	private void layoutComponent() {
		setLayout(new BorderLayout());
		this.add(BorderLayout.NORTH, new JLabel("이미지 사용하기"));
		this.add(centerPan);
	}
	
	
}

public class Ex02ImgGame extends JFrame {
	Container contentPan;

	public Ex02ImgGame() {
		setTitle("비행기 실습");
		setSize(1080, 720);
		setResizable(false);

		MyContentPan myContentPan = new MyContentPan();
		setContentPane(myContentPan);
	}

	public static void main(String[] args) {
		new Ex02ImgGame().setVisible(true);
	}
}
