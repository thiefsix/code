//���´������ͨ���������б�����Ϊthrowsֻ�ǽ��쳣�����ף���û�������Ĵ�����ж���Σ�
import java.io.*;
public class ThrowsTest02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		m1();
		/*main()�����ڵ���m1()����ʱ��m1()�����ְ��쳣�׸���main()������
		����main()�������쳣�׸���JVM��JVM������FileNotFoundException���Ͷ���
		���������е���ϸ��Ϣ���������̨������
Exception in thread "main" java.io.FileNotFoundException: c:\a.java (ϵͳ�Ҳ���ָ�����ļ���)
	at java.io.FileInputStream.open0(Native Method)
	at java.io.FileInputStream.open(FileInputStream.java:195)
	at java.io.FileInputStream.<init>(FileInputStream.java:138)
	at java.io.FileInputStream.<init>(FileInputStream.java:93)
	at ThrowsTest02.m3(ThrowsTest02.java:25)
	at ThrowsTest02.m2(ThrowsTest02.java:21)
	at ThrowsTest02.m1(ThrowsTest02.java:17)
	at ThrowsTest02.main(ThrowsTest02.java:10)
		*/
	}
	public static void m1() throws FileNotFoundException{
		m2();
		//m1()�����ڵ���m2()����ʱ��m2()�����ְ��쳣�׸���m1()����
	}
	public static void m2() throws FileNotFoundException{
		m3();
		//m2()�����ڵ���m3()����ʱ��m3()�����ְ��쳣�׸���m2()����
	}
	public static void m3() throws FileNotFoundException{
		new FileInputStream("c:/a.java");
		//FileNotFoundException���췽��ʹ����throws�������ף����쳣�׸���m3()����
	}
}

