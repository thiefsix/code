/*
 * final���ε����޷����̳�
 * final���εķ����޷������ǣ���д��
 * final���εľֲ�����һ������ֵ�޷��ٸ���
 * final���εĳ�Ա�������롰��ʾ�ģ��ֶ��ģ�����ֵ
 * final���εĳ�Ա����һ����static���ã���ʾ�������������������д
 * final������������ʱ�������ò���ָ����һ�����󣬵��Ǹö����������ֵ���Ըı�
 */
public class Test01 {
	public static void main(String[] args){
		final Man m1=new Man(20,"����");
		//m1=new Man(20,"����");--->���󣬲���ָ����һ������
		m1.age=25;
		m1.name="����";		//���Ըı�ָ����������ֵ
		
	}

}

class Man{
	int age;
	String name;
	Man(int age,String name){
		this.age=age;
		this.name=name;
	}
}