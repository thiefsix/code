/*
 * ���ھ�̬�ڲ���
 * 1.��̬�ڲ�����Կ�����̬����
 * 2.�ڲ�����Է����ⲿ���˽������
 * 3.��̬�ڲ�����Է����ⲿ��ľ�̬���ݣ����ܷ��ʳ�Ա
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
	//��̬�ڲ��࣬�����÷��ʿ���Ȩ�����δ����Σ�public,private,protected,ȱʡ��
	public static class Inner{
		//��̬����
		public static void m3(){
			System.out.println(name);
			//System.out.println(age);
			//m2();-->��̬�ڲ��಻�ܷ��ʳ�Ա����
		}
		//��Ա����
		public void m4(){
			System.out.println(name);
			//System.out.println(age);
			//m2();-->��̬�ڲ��಻�ܷ��ʳ�Ա����
		}
	}
	public static void main(String[] args){
		//���þ�̬�ڲ����еľ�̬m3����
		Test01.Inner.m3();//-->��̬��������ֱ����"����."����
		//���þ�̬�ڲ����еĳ�Ա����m4��
		Inner i=new Test01.Inner();
		i.m4();//-->��Ա����������Ҫ�ȴ�����������"����."����
	}

}
