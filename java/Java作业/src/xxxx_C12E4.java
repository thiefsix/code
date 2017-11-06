
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class xxxx_C12E4 extends JFrame{
	public xxxx_C12E4(){
		ExtendJPanel ep1 = new ExtendJPanel();
		ep1.setLayout(new FlowLayout());
		ExtendJPanel ep2 = new ExtendJPanel();
		ep2.setLayout(new FlowLayout());
		JPanel p = new JPanel(new BorderLayout());
		p.add(ep1,BorderLayout.EAST);
		p.add(ep2,BorderLayout.CENTER);
		add(p);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xxxx_C12E4 frame = new xxxx_C12E4();
		frame.setTitle("C12E4");
		frame.setSize(400,80);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class ExtendJPanel extends JPanel{
	Button bt1=new Button("Button1");
	Button bt2=new Button("Button2");
	Button bt3=new Button("Button3");
	
	public ExtendJPanel(){
		add(bt1);
		add(bt2);
		add(bt3);
		}
	
	
	
	
}
