/*
 * �������﷨��class�ؼ���ǰ�ӡ�abstract�����δ�
 * �������޷���ʵ�����������й��췽�������췽���Ǹ������õ�
 * �������п��Զ�����󷽷�
 * 		������󷽷��﷨���ڷ��������η��б��мӡ�abstract���ؼ��֣��ҳ��󷽷�û�з����壬���Ա����ԡ� ; ��������
 * 				���磺	public abstract void m1();
 * �������в�һ���г��󷽷��������󷽷�ֻ�ܳ����ڳ�������
 * 		һ���ǳ�����̳г�������뽫�������еĳ��󷽷����ǣ���д��ʵ�֣�
 */
public class Test01 {
	public static void main(String[] args){
		//��̬
		A a=new B();//�����๹�췽��������
		a.m1();//��д���󷽷�
	}

}

abstract class A{		//������
	//���췽��
	A(){
		System.out.println("�����๹�췽��������");
	}
	//���󷽷�
	public abstract void m1();
}

class B extends A{
	//��д���󷽷�
	public void m1(){
		System.out.println("��д���󷽷�");
	}
	
}
