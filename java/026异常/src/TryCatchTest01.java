
/*
 * try...catch...�﷨��
 * try{
 * 		���ܳ����쳣�Ĵ���
 * }catch(�쳣����1 ������){
 * 		�����쳣�Ĵ���
 * }catch(�쳣����2 ������){
 * 		�����쳣�Ĵ���
 * }������
 * ע�⣺
 * catch�������д��������Ǵ��ϵ��²�׽����׽���쳣���ͱ����С���󣨴������͵������ͣ�
 */
import java.io.*;
public class TryCatchTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//FileNotFoundException�����쳣
			FileInputStream fis=new FileInputStream("c:/a.java");
			//���ϴ�������쳣��ֱ����ת��catch���飬��������ִ��
			//IOException�����쳣��FileNotFoundException��IOException��������
			fis.read();
		}catch(FileNotFoundException e){
			//JVM�����쳣�󴴽��˸��쳣���͵Ķ��󣬲����ö���ĵ�ַ�����ˡ�����e��
			System.out.println("FileNotFoundException�����쳣�Ѳ�׽");
			System.out.println(e);
			//java.io.FileNotFoundException: c:\a.java (ϵͳ�Ҳ���ָ�����ļ���)
			//�ɴ˿����ж�FileNotFoundException��д��Object���toString����
		}catch(IOException e){
			System.out.println("IOException�����쳣�Ѳ�׽");
		}
	}
}
