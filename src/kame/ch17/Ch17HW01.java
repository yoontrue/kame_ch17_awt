package kame.ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ch17HW01 extends Frame {

	Label lblNum = new Label("번 호",Label.RIGHT);
	Label lblName = new Label("이 름",Label.RIGHT);
	Label lblMail = new Label("이 메 일",Label.RIGHT);
	Label lblPhone = new Label("전화번호",Label.RIGHT);
	TextField txtNum = new TextField("",10);
	TextField txtName = new TextField("",10);
	TextField txtMail = new TextField("",10);
	TextField txtPhone = new TextField("",10);
	Button btnAll = new Button("전체보기");
	Button btnAdd = new Button("추  가");
	Button btnDel = new Button("삭  제");
	Button btnSch = new Button("검  색");
	Button btnCnl = new Button("취  소");
	Panel p1 = new Panel(new GridLayout(4,2));
	Panel p2 = new Panel();
	
	public Ch17HW01() {
		setTitle("1월 26일 과제");
		setSize(800,400);
		
		p2.add(btnAll);
		p2.add(btnAdd);
		p2.add(btnDel);
		p2.add(btnSch);
		p2.add(btnCnl);
		
		p1.add(lblNum);
		p1.add(txtNum);
		p1.add(lblName);
		p1.add(txtName);
		p1.add(lblMail);
		p1.add(txtMail);
		p1.add(lblPhone);
		p1.add(txtPhone);
		p1.setSize(300, HEIGHT);
		
		add(BorderLayout.WEST, p1);
		add(BorderLayout.SOUTH, p2);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Ch17HW01().setVisible(true);
	}
}
