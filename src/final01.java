
import javax.swing.*;
import java.awt.*;

public class final01 extends JFrame{
	
	public final01() {
		setTitle("계산기");
		setSize(300, 250);
	
		
		//제목 페널
		JPanel titlePanel=new JPanel();
		titlePanel.setBounds(0, 0, 300, 40);
		add(titlePanel);
		JLabel title = new JLabel("계산기", JLabel.CENTER);
		title.setFont(new Font("함초롱돋음", Font.BOLD, 20));
		
		titlePanel.add(title);
		
		// 숫자 페널
		JPanel numPanel = new JPanel();
		numPanel.setBounds(0, 40, 300, 40);
		add(numPanel);
		// 추가 
		//numPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		//add(numPanel);
		
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);
		
		// 버튼 페널
		JPanel btPanel01 = new JPanel();
		btPanel01.setBounds(0, 80, 300, 40);
		add(btPanel01);
		
		JButton plus = new JButton("+");
		btPanel01.add(plus);
		JButton minus = new JButton("-");
		btPanel01.add(minus);
		
		JPanel btPanel02 = new JPanel();
		btPanel02.setBounds(0, 120, 300, 40);
		add(btPanel02);
		JButton multiply = new JButton("*");
		btPanel02.add(multiply);
		JButton divide = new JButton("/");
		btPanel02.add(divide);
		//
		
		JPanel btPanel03 = new JPanel();
		btPanel03.setBounds(0, 30, 30, 40);
		add(btPanel03);
		
		JButton one = new JButton("1");
		btPanel03.add(numPanel);
		JButton two = new JButton("2");
		btPanel01.add(minus);
		
		JPanel btPanel04 = new JPanel();
		btPanel04.setBounds(0, 120, 300, 40);
		add(btPanel04);
		JButton three = new JButton("3");
		btPanel02.add(multiply);
		JButton four = new JButton("4");
		btPanel02.add(divide);
		
		
		
		// 결과 페널
		JPanel resPanel = new JPanel();
		resPanel.setBounds(0, 160, 300, 40);
		add(resPanel);
		JLabel lbl1 = new JLabel ("결과값: ");
		resPanel.add(lbl1);
		JButton lbl2 = new JButton("-");
		resPanel.add(lbl2);
		
		//프레임 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new final01();

	}

}
