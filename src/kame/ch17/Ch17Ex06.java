package kame.ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ch17Ex06 extends Frame {
	Label lbl = new Label("아래의 버튼을 누르세요");
	Panel p1 = new Panel(new GridBagLayout());
	Panel p2 = new Panel(new GridLayout(1,3));
	Button btn1 = new Button("play");
	Button btn2 = new Button("stop");
	Button btn3 = new Button("pause");
	public Ch17Ex06() {
		setTitle("연습");
		setSize(640,480);
		
		btn1.setBackground(Color.PINK);
		btn2.setBackground(Color.BLUE);
		btn3.setBackground(Color.LIGHT_GRAY);
		lbl.setBackground(Color.CYAN);
		
		p1.add(lbl);
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		
		add(BorderLayout.CENTER, p1);
		add(BorderLayout.SOUTH, p2);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Ch17Ex06().setVisible(true);
		
	}

}
