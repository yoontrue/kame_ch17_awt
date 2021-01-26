package kame.ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ch17Ex04 extends Frame{
	
	public Ch17Ex04() {
		
		Button[] btns = new Button[50];
		for(int i=0;i<btns.length;i++) {
			btns[i] = new Button("BTN" + i);
		}
		
		setTitle("플로우 레이아웃");
		setSize(640,480);
		setBackground(Color.PINK);
		
		
		// 보더레이아웃 ==> 플로우레이아웃으로 변경.
//		setLayout(new FlowLayout());
		setLayout(new GridLayout(5, 10, 6, 6));
		for(int i=0;i<btns.length;i++) {
			this.add(btns[i]);
		}
		
		
		start();
		
	}
	
	protected void start() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Ch17Ex04().setVisible(true);
		

	}

}
