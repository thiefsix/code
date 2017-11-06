//以下代码编译通过，但运行报错，因为throws只是将异常向上抛，并没有真正的处理（推卸责任）
import java.io.*;
public class ThrowsTest02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		m1();
		/*main()方法在调用m1()方法时，m1()方法又把异常抛给了main()方法，
		最终main()方法把异常抛给了JVM，JVM创建了FileNotFoundException类型对象，
		并将对象中的详细信息输出到控制台，如下
Exception in thread "main" java.io.FileNotFoundException: c:\a.java (系统找不到指定的文件。)
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
		//m1()方法在调用m2()方法时，m2()方法又把异常抛给了m1()方法
	}
	public static void m2() throws FileNotFoundException{
		m3();
		//m2()方法在调用m3()方法时，m3()方法又把异常抛给了m2()方法
	}
	public static void m3() throws FileNotFoundException{
		new FileInputStream("c:/a.java");
		//FileNotFoundException构造方法使用了throws（向上抛）把异常抛给了m3()方法
	}
}

