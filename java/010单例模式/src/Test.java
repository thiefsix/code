
/*
 ����ģʽ��23�����ģʽ����򵥵�һ��
 Ŀ�ģ�Ϊ�˱�֤JVM��ĳ�����͵�java������Զֻ��һ����Ϊ�˽�ʡ�ڴ濪����
 ʵ�ֵ���ģʽ��
 		1.���췽��˽�л�
 		2.�����ṩ�����ľ�̬�Ļ�ȡ��ǰ����ķ���
 		3.�ṩһ����ǰ����ľ�̬����
 ����ģʽ����
 		����ģʽ��������ص�ʱ�򴴽�����
 		����ģʽ���õ������ʱ��Żᴴ������
 ����ģʽ����ȱ�㣺����ģʽ�����޷����̳У�ԭ�����super�ؼ��֡���
 */
public class Test {
	public static void main(String[] args){
	singleton s1=singleton.getInstance();
	singleton s2=singleton.getInstance();
	singleton s3=singleton.getInstance();
	System.out.println(s1==s2);//ture, s1��s2���ڴ��ַ��ͬ
	System.out.println(s2==s3);//ture, s2��s3���ڴ��ַ��ͬ

}

}
class singleton{
	//��̬����
	private static singleton s;
	//���췽��˽�л�
	private singleton(){}
	//�����ľ�̬�Ļ�ȡ��ǰ����ķ���
	public static singleton getInstance(){
		if(s==null){
			s=new singleton();
		}
		return s;
	}
}