
/*
 *�����쳣�����ַ�ʽ
 *1.throws,�����׳����ڷ��������ĺ������throws xxxException
 *2.try...catch...,��׽
 */
import java.io.*;
public class ThrowsTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//�����ļ�����������ȡ�ļ�
		//˼����java�����������֪�����´������ֱ���ʱ�쳣��
		FileInputStream fis=new FileInputStream("c:/a.java");
		//��ΪFileInputStream������췽����������λ����ʹ����throws FileNotFoundException
	}
}

//���ϳ�����벻��ͨ�������쳣��Unhandled exception type FileNotFoundException��
//��Ҫ�ֶ���׽�������׳�
