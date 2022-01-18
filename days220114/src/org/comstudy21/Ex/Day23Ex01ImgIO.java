package org.comstudy21.Ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyContentPanTest01 extends JPanel {
   JLabel label;

   public MyContentPanTest01() {
      label = new JLabel("우리는 하나다!");
      Font font = new Font("궁서체", Font.ITALIC, 48);
      label.setFont(font);
      this.add(label);
   }
}

class Airplan01 extends JPanel {
   Image img;
   String imagePath = "C:\\Users\\Minhyeok\\Desktop\\git\\Green\\days220114\\src\\org\\comstudy21\\ImgIO\\airplan01.png";
   BufferedImage bfImg;
   public int x = 300, y = 300;
   public JLabel imgLbl = null;

   public Airplan01() {
      // img = Toolkit.getDefaultToolkit().getImage(imagePath);
      // 이미지나 그래픽 관련 메소드는 라이프사이클에 의해서 자동 실행 된다.
      // paint(), repaint(), paintComponent()
//      try {
//         bfImg = ImageIO.read(this.getClass().getResource("airplan01.png"));
//      } catch (IOException e) {
//         e.printStackTrace();
//      }
      // ImageIcon imgIcon = new ImageIcon("src/org/comtudy21/day23/airplan01.png");
      ImageIcon imgIcon = new ImageIcon("C:\\Users\\Minhyeok\\Desktop\\git\\Green\\days220114\\src\\org\\comstudy21\\ImgIO\\airplan01.png");

      // ImageIcon imgIcon = new ImageIcon(getClass().getResource("airplan01.png"));
      // 이미지 아이콘은 이미지가 아니다.
      img = imgIcon.getImage();
      // 이미지 크기도 조정
      Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
      imgIcon = new ImageIcon(newImg);
      // JLabel()에 ImageIcon 객체 사용 가능.
      imgLbl = new JLabel(imgIcon);
      this.add(imgLbl);
   }

   // 일체유심조 - 하면된다!
   @Override
   protected void paintComponent(Graphics g) {
      // g.drawImage(img, x, y, 100, 100, this);
   }
}

class Airplan02 extends JPanel implements Runnable {
   String imagePath = "C:\\Users\\Minhyeok\\Desktop\\git\\Green\\days220114\\src\\org\\comstudy21\\ImgIO\\airplan02.png";
   Image img = null;
   ImageIcon imgIco = null;
   int x = 100, y = -100, w = 100, h = 100;
   MyCenterPan centerPan;
   Random rand = new Random();
   public Airplan02(MyCenterPan centerPan) {
      this.centerPan = centerPan;
      x = 100 + (int)rand.nextInt(500);
      imgIco = new ImageIcon(imagePath);
      img = imgIco.getImage();
      Image newImg = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);
      imgIco = new ImageIcon(newImg);
      add(new JLabel(imgIco));
   }

   public void movePlain() {
      this.setBounds(x, y, w, h);
   }

   @Override
   public void run() {
      while(true) {
         try {
            Thread.sleep(10);
            // 좌표를 변경하고 다시 그리기
            y += 3;
            if(y>=600) {
               y = -100;
               x = 100 + (int)rand.nextInt(500);
            }
            movePlain();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}

class Bulet extends JPanel implements Runnable {
	   String imagePath = "C:\\Users\\Minhyeok\\Desktop\\git\\Green\\days220114\\src\\org\\comstudy21\\ImgIO\\bulet.png";
	   Image img = null;
	   ImageIcon imgIco = null;
	   int x = 350, y = 400, w = 50, h = 70;
	   MyCenterPan centerPan;
	   public Bulet(MyCenterPan centerPan) {
	      this.centerPan = centerPan;
	      x = 350;
	      imgIco = new ImageIcon(imagePath);
	      img = imgIco.getImage();
	      Image newImg = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);
	      imgIco = new ImageIcon(newImg);
	      add(new JLabel(imgIco));
	   }

	   public void movePlain() {
	      this.setBounds(x, y, w, h);
	   }

	   @Override
	   public void run() {
	      while(true) {
	         try {
	            Thread.sleep(10);
	            // 좌표를 변경하고 다시 그리기
	            y -= 10;
	            if(y < -100) {
	               y = 400;
	            }
	            movePlain();
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	   }

	}

class AirplanStarterThread extends Thread {
   Airplan02[] airplan02;
   public AirplanStarterThread(Airplan02[] airplan02) {
      this.airplan02 = airplan02;
   }

   @Override
   public void run() {
      for(int i=0; i<airplan02.length; i++) {
         Thread th = new Thread(airplan02[i]);
         th.start();
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}

class MyCenterPan extends JPanel {
   int x1 = 350, y1 = 400, w1 = 100, h1 = 100;
   
   public Airplan01 airplan01 = new Airplan01();
   public Airplan02[] airplan02 = new Airplan02[10];
   public Bulet bulet = new Bulet(this);

   public MyCenterPan() {
      setLayout(null);
      add(airplan01);
      add(bulet);
      airplan01.setBounds(x1, y1, w1, h1);
      
      for(int i=0; i<airplan02.length; i++) {
         airplan02[i] = new Airplan02(this);
         add(airplan02[i]);
         airplan02[i].movePlain();
         Thread airplai02th = new Thread(airplan02[i]);
      }
      
      AirplanStarterThread starter = new AirplanStarterThread(airplan02);
      starter.start();
      
      Thread buletTh = new Thread(new Bulet(this));
      buletTh.start();
   }


   public void airplan01MoveLeft() {
      x1 -= 10;
      airplan01.setBounds(x1, y1, w1, h1);
   }

   public void airplan01MoveRight() {
      x1 += 10;
      airplan01.setBounds(x1, y1, w1, h1);
   }
}

class MyContentPan extends JPanel {
   MyCenterPan centerPan = new MyCenterPan();
   JButton leftBtn = new JButton("Left");
   JButton rightBtn = new JButton("Right");

   public MyContentPan() {
      setBackground(Color.PINK);
      layoutComponent();
      actionEvetn();
   }

   private void actionEvetn() {
      leftBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // 버튼을 누르면 비행기가 화면의 좌측으로 이동한다.
            centerPan.airplan01MoveLeft();
            repaint(); // 해당 콤포넌트의 화면을 다시 그린다.
         }
      });
      rightBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // 버튼을 누르면 비행기가 화면의 우측으로 이동한다.
            centerPan.airplan01MoveRight();
            repaint(); // 해당 콤포넌트의 화면을 다시 그린다.
         }
      });

      this.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_LEFT) {
               centerPan.airplan01MoveLeft();
               repaint();
            } else if (keyCode == KeyEvent.VK_RIGHT) {
               centerPan.airplan01MoveRight();
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
      this.add(BorderLayout.NORTH, new JLabel("미사일로 비행기 맞추기 게임 - 방향키로 비행기 조정"));
      this.add(centerPan);
      JPanel bottomPan = new JPanel(new FlowLayout());
      bottomPan.add(leftBtn);
      bottomPan.add(rightBtn);
      this.add(BorderLayout.SOUTH, bottomPan);
   }
}

public class Day23Ex01ImgIO extends JFrame {
   Container contentPan;

   public Day23Ex01ImgIO() {
      setTitle("이미지 불러오기 실습");
      setSize(800, 600);

      // contentPan = getContentPane();
      MyContentPan myContentPan = new MyContentPan();
      setContentPane(myContentPan);
   }

   public static void main(String[] args) {
      new Day23Ex01ImgIO().setVisible(true);
   }

}
