
/*
 * finally������⣺
 * finally���������try���ã�try...finally...
 * finally����Ҳ������try...catch...���ã�try....catch....finally....
 * ��finally�����еĴ���һ����ִ��(����JVM���ر��ˣ����޷�ִ��)
 * System.exit(0);�ر�JVM�Ĵ���
 */
import java.io.*;
public class FinallyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis=new FileInputStream("FinallyTest.java");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}finally{
			System.out.println("-by JianLiang");
		}
	}

}
