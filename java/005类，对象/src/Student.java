/*�������ķ�װָ���ǣ�
	1.��Ա������˽�л�
	2.�����ṩ������setter��getter��set������get����������Ҫ���Ϲ淶��
  ��Ա�������﷨�����δ�  ����ֵ����  ��Ա���������βΣ�{������}
  ���캯�����﷨�����δ�  ���캯�������βΣ�{������}  ����ע�⣺û�з���ֵ���ͣ���*/

public class Student {
	String name;
	boolean sex;
	int id;
	private int age;
	String addr;
	public void setAge(int _age){
		if(_age<0||_age>100){
			System.out.println("���䲻�Ϸ�");
			return;
		}
		age=_age;
	}
	public int getAge(){
		return age;
	}
	public Student(int _id){
		id=_id;
	}
	public Student(){
		System.out.println("ȱʡ�Ĺ��캯��������");
	}
	public Student(String _addr,String _name){
		addr=_addr;
		name=_name;
	}
	public Student(boolean _sex){
		sex=_sex;
	}

}
