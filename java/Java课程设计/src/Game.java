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
	private int [][]chess = new int [6][7]; //保留棋盘信息
	private Button []button = {new Button("开始"),
			   new Button("双人对战"),
			   new Button("人机对战"),
			   new Button("悔棋"),
			   new Button("帮助")
			   };
	private ButtonListener buttonListener = new ButtonListener();
	
	public Game(){
		setLayout(new BorderLayout());          //设置layout
		Container bContainer = new Container(); 
		add(new BoardPanel(),BorderLayout.EAST);//加载BoardPanel
		add(bContainer,BorderLayout.WEST);
											   //设置buttonContainer
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
			if(e.getSource()==button[0]){         //游戏开始
				
			}
			else if(e.getSource()==button[1]){ 	 //双人对战
				
			}
			else if(e.getSource()==button[2]){   //人机对战
				hasAI = false;
			}
			else if(e.getSource()==button[3]){   //悔棋
				
			}
			else{                                //帮助
				String help_information = "Help " + "\n"
						+ "Powered by lud";
				JOptionPane.showConfirmDialog(getParent(),help_information,"帮助",
												JOptionPane.OK_CANCEL_OPTION,
												JOptionPane.QUESTION_MESSAGE);
			}
			
		}
	}
	private int isOver(){//判断游戏是否结束
	/*	if(isChessFull==1)
			return 0;   平局
		else if(isRedFour==1)
				return 1;   胜者为red
			 if(isBlackFour==1)
			  	return 2; 胜者为black
			 else
		*/return 3; //继续游戏
	}	
	
	public void setAI(){}//设置游戏AI
	
	class BoardPanel extends JPanel {
		MouseClicked mouseClicked = new MouseClicked();
		MouseMoved mouseMoved = new MouseMoved(); 
	
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			//Image board_bg = new ImageIcon("background.jpg").getImage();
			//if(board_bg!=null)
			//	g.drawImage(board_bg,100,0,800,600,this);               //目前不知道这里为什么画不出来图片
	
			//g.setColor(Color.black);
			int Start_x=0;
			int Start_y=0;
			for(int i=0;i<9;i++){
				g.drawLine(0,Start_y,800,Start_y); //画横线
				g.drawLine(Start_x,0,Start_x,600); //画竖线
				Start_x += 100;
				Start_y += 100;
			}
	
	
		}
	
		public BoardPanel(){
			setPreferredSize(new Dimension(700, 600));
			//setOpaque(true);
			//setResizable(false);
			//setBackground(Color.white);  //background考虑用自己的图案，之后回去研究five的代码
			//etLayout(null);				//目前考虑到的最麻烦的事情是棋子的落下判定问题，
								 //不知道该如何判断鼠标指向的位置
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
		myGame.setSize(810,630);  //在这里设置初始的大小
		myGame.setLocationRelativeTo(myGame);
		//myGame.getContentPane().getGraphics().drawImage(board_bg,100,0,800,600,myGame);
		myGame.setVisible(true);
		//myGame.setBackground(Color.RED);
	}
		
}

