package org.comstudy21.ex02;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Ex03JOptionPan extends MyJFrame {
   JButton openBtn;
   
   protected void init() {
      openBtn = new JButton("message 열기");
   }
   
   protected void displayLayer() {
      init();
      Container contentPan = getContentPane();
      contentPan.setLayout(new GridBagLayout());
      contentPan.add(openBtn);
   }
   
   protected void actionEvent() {
      openBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // 버튼을 클릭하면 다이얼로그 창 보이게 하기
            JOptionPane.showMessageDialog(Ex03JOptionPan.this, "환영합니다!");
         }
      });
   }
   
   public static void main(String[] args) {
      new Ex03JOptionPan().setVisible(true);
   }

   public static void test01(String[] args) {
      JOptionPane.showMessageDialog(null, "Hello world!");
   }

}
