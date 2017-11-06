import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class xxxx_C12E2 extends JFrame{
	public xxxx_C12E2(){
		
		JPanel p1 = new JPanel(new BorderLayout());
		
		p1.add(new JButton("one"),BorderLayout.WEST);
		p1.add(new JButton("two"),BorderLayout.CENTER);
		p1.add(new JButton("three"),BorderLayout.EAST);
		add(p1,BorderLayout.SOUTH);
		
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JButton("one"),BorderLayout.WEST);
		p2.add(new JButton("two"),BorderLayout.CENTER);
		p2.add(new JButton("three"),BorderLayout.EAST);
		add(p2,BorderLayout.CENTER);
	}
	public static void main(String[] args){
		xxxx_C12E2 frame = new xxxx_C12E2();
		frame.setTitle("ShowBorderLayout");
		frame.setSize(200,100);
		frame.setLocationRelativeTo(null);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
