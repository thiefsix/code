
public class Computer {
	public static void main(String[] args){
		//�½��ڴ�
		Engine e1=new Kingston();
		//�½�����
		Asua a=new Asua(e1);
		//���ò��Է���
		a.testEngine();
		//��SanDisk
		a.e =new Sandisk();
		a.testEngine();
	}
	
}
