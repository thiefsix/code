/*
 *���ھֲ��ڲ���
 *1.�ֲ��ڲ����൱�ھֲ�����
 *�ص㣺2.�ֲ��ڲ�����ʾֲ�����ʱ���ֲ���������ʹ��final����
 *3.�ֲ��ڲ����в����о�̬����
 */
public class Test01 {
	public void m1(){
		//�ֲ�����
		final int age = 20;
		//�ֲ��ڲ���
		//�ֲ��ڲ��಻����Ȩ�޷��ʿ������η�����
		class Inner{
			public void m2(){
				System.out.println(age);
			}
		}
		//����m2����
		Inner i=new Inner();
		i.m2();
	}
	public static void main(String[] agrs){
		//ͨ������m1������ӵ���m2����
		Test01 t=new Test01();
		t.m1();
	}

}
