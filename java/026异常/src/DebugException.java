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
			System.out.println(gms);//这个方法为我们打印大致异常信息
			//c:\a,java (系统找不到指定的文件。)
			e.printStackTrace();//这个方法为我们打印详细异常信息
			/*
			 java.io.FileNotFoundException: c:\a,java (系统找不到指定的文件。)
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

