package org.comstudy21.guiex;

import java.awt.*;

public class Ex01Frame {

	public static void main(String[] args) {
		Frame frame = new Frame("Hello");
		frame.setLayout(null);
		frame.setSize(640,480);
		frame.setVisible(true);
		frame.add(new Label("Hello : "));
	}

}
