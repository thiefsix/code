
/*
 * try...catch...语法：
 * try{
 * 		可能出现异常的代码
 * }catch(异常类型1 变量名){
 * 		处理异常的代码
 * }catch(异常类型2 变量名){
 * 		处理异常的代码
 * }。。。
 * 注意：
 * catch语句块可以写多个，但是从上到下捕捉，捕捉的异常类型必须从小到大（从子类型到父类型）
 */
import java.io.*;
public class TryCatchTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//FileNotFoundException类型异常
			FileInputStream fis=new FileInputStream("c:/a.java");
			//以上代码出现异常，直接跳转到catch语句块，不再往下执行
			//IOException类型异常，FileNotFoundException是IOException的子类型
			fis.read();
		}catch(FileNotFoundException e){
			//JVM发现异常后创建了该异常类型的对象，并将该对象的地址赋给了“变量e”
			System.out.println("FileNotFoundException类型异常已捕捉");
			System.out.println(e);
			//java.io.FileNotFoundException: c:\a.java (系统找不到指定的文件。)
			//由此可以判断FileNotFoundException重写了Object类的toString方法
		}catch(IOException e){
			System.out.println("IOException类型异常已捕捉");
		}
	}
}
