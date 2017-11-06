import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;

public class Game extends JFrame{
	
	private boolean hasAI = true;
	private int [][]chess = new int [6][7]; //����������Ϣ
	private Button []button = {new Button("��ʼ"),
			   new Button("˫�˶�ս"),
			   new Button("�˻���ս"),
			   new Button("����"),
			   new Button("����")
			   };
	private ButtonListener buttonListener = new ButtonListener();
	
	public Game(){
		setLayout(new BorderLayout());          //����layout
		Container bContainer = new Container(); 
		add(new BoardPanel(),BorderLayout.EAST);//����BoardPanel
		add(bContainer,BorderLayout.WEST);
											   //����buttonContainer
		bContainer.setSize(100, 630);
		bContainer.setLayout(new BorderLayout());
		for(int i=0;i<5;i++){
			bContainer.add(button[i]);
			button[i].setBounds(0,0+i*120,80,120);
			button[i].addActionListener(buttonListener);
		}
		/*button[0].setBounds(20, 0,  100, 160);               
		button[1].setBounds(20, 160, 100, 160);
		button[2].setBounds(20, 320, 100, 160);
		button[3].setBounds(20, 480,100, 160);
		button[4].setBounds(20, 640,100, 160);
		add(button[0],BorderLayout.WEST);
		add(button[1],BorderLayout.WEST);
		add(button[2],BorderLayout.WEST);
		add(button[3],BorderLayout.WEST);
		add(button[4],BorderLayout.WEST);
		for(int i=0;i<4;i++){
		button[i].addActionListener(buttonListener);}*/
		
	}
	
	private class ButtonListener implements ActionListener{
		public ButtonListener(){}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button[0]){         //��Ϸ��ʼ
				
			}
			else if(e.getSource()==button[1]){ 	 //˫�˶�ս
				
			}
			else if(e.getSource()==button[2]){   //�˻���ս
				hasAI = false;
			}
			else if(e.getSource()==button[3]){   //����
				
			}
			else{                                //����
				String help_information = "Help " + "\n"
						+ "Powered by lud";
				JOptionPane.showConfirmDialog(getParent(),help_information,"����",
												JOptionPane.OK_CANCEL_OPTION,
												JOptionPane.QUESTION_MESSAGE);
			}
			
		}
	}
	private int isOver(){//�ж���Ϸ�Ƿ����
	/*	if(isChessFull==1)
			return 0;   ƽ��
		else if(isRedFour==1)
				return 1;   ʤ��Ϊred
			 if(isBlackFour==1)
			  	return 2; ʤ��Ϊblack
			 else
		*/return 3; //������Ϸ
	}	
	
	public void setAI(){}//������ϷAI
	
	class BoardPanel extends JPanel {
		MouseClicked mouseClicked = new MouseClicked();
		MouseMoved mouseMoved = new MouseMoved(); 
	
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			//Image board_bg = new ImageIcon("background.jpg").getImage();
			//if(board_bg!=null)
			//	g.drawImage(board_bg,100,0,800,600,this);               //Ŀǰ��֪������Ϊʲô��������ͼƬ
	
			//g.setColor(Color.black);
			int Start_x=0;
			int Start_y=0;
			for(int i=0;i<9;i++){
				g.drawLine(0,Start_y,800,Start_y); //������
				g.drawLine(Start_x,0,Start_x,600); //������
				Start_x += 100;
				Start_y += 100;
			}
	
	
		}
	
		public BoardPanel(){
			setPreferredSize(new Dimension(700, 600));
			//setOpaque(true);
			//setResizable(false);
			//setBackground(Color.white);  //background�������Լ���ͼ����֮���ȥ�о�five�Ĵ���
			//etLayout(null);				//Ŀǰ���ǵ������鷳�����������ӵ������ж����⣬
								 //��֪��������ж����ָ���λ��
			//setFocusable(true);
			//requestFocusInWindow();
	
			addMouseListener(mouseClicked);
			addMouseMotionListener(mouseMoved);
		}

		class MouseClicked extends MouseAdapter{}//
	
		class MouseMoved implements MouseMotionListener{

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
			}
	
		}
	}
	
	
	public static void main(String[] args){
		
		Game myGame = new Game();
		myGame.setTitle("Connect Four");
		myGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myGame.setSize(810,630);  //���������ó�ʼ�Ĵ�С
		myGame.setLocationRelativeTo(myGame);
		//myGame.getContentPane().getGraphics().drawImage(board_bg,100,0,800,600,myGame);
		myGame.setVisible(true);
		//myGame.setBackground(Color.RED);
	}
		
}

