
/*
 * 1.�쳣��ʲô��
 * 	��һ���쳣ʱģ����ʵ�����еġ��������¼���
 * 	�ڶ���java�в��á��ࡱ�ķ�ʽģ���쳣
 * 	���������ǿ��Դ�������ģ����磺
 * 		NullPointerException n=0x1234;
 * 		e���������ͣ�e�б�����ڴ��ַָ����еĶ���
 * 		�������һ����NullPointerException���͵ģ�
 * 	��	���������Ǿ�����쳣�¼�
 * 		NullPointerException��һ���쳣�¼�
 * 2.�쳣���Ƶ����ã�
 * 	java�ṩ�����Ƶ��쳣���ƣ��ڳ����������ʱ�������ϸ��Ϣ������Աͨ�������Ϣ
 * 	���ԶԳ������һЩ�����ǳ�����ӽ�׳
 */
public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int c=a/b;//�˴���������쳣����û�д�������򲻻����ִ�У�ֱ���˳�JVM
		/*��ʱ�����޴��󣬵�����ʱ����
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at Test01.main(Test01.java:22)
		*/
		//����������ʱ�������쳣��JVM�Զ�������һ��ArithmeticException���͵Ķ���
		//��������������а������쳣����ϸ��Ϣ��JVM���������Ϣ���������̨
		//����Ĵ������������쳣
		if(b==0){
			System.out.println("��������Ϊ0");
		}
		else{
			System.out.println("a"+"/"+"b="+c);
		}

	}

}
