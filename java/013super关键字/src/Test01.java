
/*
 * super�����������ͣ�super�д洢�Ĳ����ڴ��ַ��superָ��Ĳ��Ǹ�����
 * super������ǵ�ǰ�����Ͷ����еĸ���������
 * ʲôʱ��ʹ��super��
 * 		�������ͺ͸������ж���ĳ������ʱ�������������з��ʸ����͵��������ʱʹ�á�super.��
 * super��������ʲô�ط���
 * 1.super�������ڳ�Ա������
 * 2.super�������ڹ��췽����
 * 		�﷨��super(ʵ��)��������Ĺ��췽���е�һ��û��"this()"��"super()"
 * 			    ��ϵͳĬ����"super()"��"super()"ֻ�ܷ��ڵ�һ��
 * 		���ã�ͨ������Ĺ��췽�����ø���Ĺ��췽��,���ǲ��ᴴ���������
 * 3.���������ھ�̬�����У���Ϊ��̬�����ķ���������޹�
 */
public class Test01 {
	public static void main(String[] args){
		Manage m=new Manage();
		m.m1();
		//��������Ĺ��췽��
		new Manage();//����Ĺ��췽��������
	}

}

//����
class Employeer{
	String name = "����";
	public void work(){
		System.out.println("Ա���ڹ���");
	}
	//���췽��
	public Employeer(){
		System.out.println("����Ĺ��췽��������");
	}
}

//����
class Manage extends Employeer{
	String name = "����";
	//��д�������е�work����
	public void work(){
		System.out.println("�����ڹ���");
	}
	public void m1(){
		work();//�����ڹ���
		super.work();//Ա���ڹ���
		System.out.println(name);//����
		System.out.println(super.name);//����
	}
	//�յĹ��캯��
	public Manage(){}
	
}