package kame.ch17;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ch17HW02 extends Frame {
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Panel p4 = new Panel();
	
	
	
	public Ch17HW02() {
		setTitle("사용자 관리 프로그램");
		setSize(800,300);
		p2.setName("개인정보");
		p3.setName("정보검색");
		p4.setName("개인 정보 확인");
		
		add(BorderLayout.WEST, p1);
		add(BorderLayout.CENTER, p4);
		
		
		
		
		
		
		
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new Ch17HW02().setVisible(true);;
	}

}
