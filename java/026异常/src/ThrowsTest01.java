
/*
 *处理异常的两种方式
 *1.throws,声明抛出；在方法声明的后面加上throws xxxException
 *2.try...catch...,扑捉
 */
import java.io.*;
public class ThrowsTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//创建文件输入流，读取文件
		//思考：java编译器是如何知道以下代码会出现编译时异常？
		FileInputStream fis=new FileInputStream("c:/a.java");
		//因为FileInputStream这个构造方法在声明的位置上使用了throws FileNotFoundException
	}
}

//以上程序编译不能通过出现异常“Unhandled exception type FileNotFoundException”
//需要手动扑捉或声明抛出
