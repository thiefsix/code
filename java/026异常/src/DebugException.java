import java.io.*;
public class DebugException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis=new FileInputStream("c:/a,java");
		}catch(FileNotFoundException e){
			String gms=e.getMessage();
			System.out.println(gms);//�������Ϊ���Ǵ�ӡ�����쳣��Ϣ
			//c:\a,java (ϵͳ�Ҳ���ָ�����ļ���)
			e.printStackTrace();//�������Ϊ���Ǵ�ӡ��ϸ�쳣��Ϣ
			/*
			 java.io.FileNotFoundException: c:\a,java (ϵͳ�Ҳ���ָ�����ļ���)
					 at java.io.FileInputStream.open0(Native Method)
					 at java.io.FileInputStream.open(FileInputStream.java:195)
					 at java.io.FileInputStream.<init>(FileInputStream.java:138)
					 at java.io.FileInputStream.<init>(FileInputStream.java:93)
					 at DebugException.main(DebugException.java:10)
			 */
		}
		System.out.println("-by JianLiang");
	}

}

