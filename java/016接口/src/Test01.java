/*
 * �ӿ���һ�����ã����Ե�ͬ������
 * 1.��ζ���ӿڣ�
 * 		�﷨��[���η��б�] interface �ӿ���{}
 * 2.�ӿ���ֻ�ܳ��ֳ��������󷽷�
 * 3.�ӿ���һ������ĳ����࣬�����ڽӿ�����ȫ���󻯵�
 * 4.�ӿ���û�й��췽�����޷���ʵ����
 * 5.�ӿںͽӿ�֮����Զ�̳�
 * 6.һ�������ʵ�ֶ���ӿڣ�����ġ�ʵ�֡���ͬ���̳С�����˼��
 * 7.һ���ǳ�������ʵ�ֽӿ�ʱҪ��д�ӿڵĳ��󷽷�
 * �ӿڵ�����
 * 1.����Ŀ�ֲ㣬���в�����ӿڿ��������ں������������Ч��
 * 2.�ӿ��Ǵ���֮�����϶Ƚ��ͣ�����������ڴ��������      ���ɲ�Ρ�
 */
public class Test01{
	
}

interface A{
	//������������    "public static final"����ʽ��ͷ���� �� public static final�� ��ʡ��
	public static final int I=100;
	public static final String NAME="jianliang";
	double PI=3.14;
	
	//���󷽷�,������  ��public abstract�� ����ʽ��ͷ����  ��public abstract�� ��ʡ��
	public abstract void m1();
	void m2();
}

interface B{
	void m2();
}
interface C{
	void m3();
}
interface D{
	void m4();
}
//�ӿ�֮��ʵ�ֶ�̳�
interface E extends B,C,D{
	void m5();
}

//"implements" ��  ��extends����˼��ͬ����һ���ؼ��֣����ڡ��ࡱʵ�֡��ӿڡ�
class Myclass implements B,C,D{
	//��д�ӿ��еĳ��󷽷�
	public void m2(){}
	public void m3(){}
	public void m4(){}
	
}