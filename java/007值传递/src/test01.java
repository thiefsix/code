
public class test01 {
	public static void main(String args[]){
		int a=10;				//����int���ͱ���
		f1(a);					//�����������͵�ֵ����
		System.out.println(a);
		Man m=new Man(10);		//����Man���Ͷ���
		f2(m);					//�����������͵�ֵ����
		System.out.println(m.age);
	}
	//f2����(����)
	public static void f2(Man a){
		a.age++;
		System.out.println(a.age);
	}
	//f1������������
	public static void f1(int a){
		a++;
		System.out.println(a);
	}
}


//Man��
 class Man{
	int age;  //filed
	//���캯����age��ֵ
	Man(int _age){
		age=_age;
	}
}