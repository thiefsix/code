
/*
 * finally语句块详解：
 * finally语句块可以与try连用，try...finally...
 * finally语句块也可以与try...catch...连用，try....catch....finally....
 * 在finally语句块中的代码一定会执行(但是JVM若关闭了，则无法执行)
 * System.exit(0);关闭JVM的代码
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
