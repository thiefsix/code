/*
 * ���ڳ�Ա�ڲ���
 * 1.��Ա�ڲ�����Կ�����Ա����
 * 2.��Ա�ڲ����в����о�̬��������̬��������̬������������
 * 3.��Ա�ڲ�����Է����ⲿ�����������
 */
public class Test01 {
	//��̬����
	static String name ="jianlaing";
	//��Ա����
	int age=20;
	//��̬����
	public static void m1(){
		System.out.println("��̬����ִ��");
	}
	//��Ա����
	public void m2(){
		System.out.println("��Ա����ִ��");
	}
	//��Ա�ڲ��࣬�����÷��ʿ���Ȩ�����δ����Σ�public,private,protected,ȱʡ��
	public class Inner{
		//��̬����
		/*public static void m3(){
			System.out.println(name);
			System.out.println(age);
			m2();
		}-->��Ա�ڲ����в����о�̬����*/
		//��Ա����
		public void m4(){
			System.out.println(name);
			System.out.println(age);
			m2();
		}
	}
	public static void main(String[] args){
		//��η��ʳ�Ա�ڲ����е�m4����
		//1.�����ⲿ�����
		Test01 t=new Test01();
		//�����ڲ������
		Inner in=t.new Inner();
		//����m4����
		in.m4();
	}
}

