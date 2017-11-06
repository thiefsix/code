
/*
 * 1.异常是什么？
 * 	第一，异常时模拟现实世界中的“不正常事件”
 * 	第二，java中采用“类”的方式模拟异常
 * 	第三，类是可以创建对象的，例如：
 * 		NullPointerException n=0x1234;
 * 		e是引用类型，e中保存的内存地址指向堆中的对象，
 * 		这个对象一定是NullPointerException类型的，
 * 	·	这个对象就是具体的异常事件
 * 		NullPointerException是一类异常事件
 * 2.异常机制的作用？
 * 	java提供了完善的异常机制，在程序出现问题时，输出详细信息，程序员通过这个信息
 * 	可以对程序进行一些处理，是程序更加健壮
 */
public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int c=a/b;//此处代码出现异常，若没有处理则程序不会继续执行，直接退出JVM
		/*此时编译无错误，但运行时报错
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at Test01.main(Test01.java:22)
		*/
		//程序在运行时出现了异常，JVM自动创建了一个ArithmeticException类型的对象，
		//并且在这个对象中包含了异常的详细信息，JVM并将这个信息输出到控制台
		//下面的代码用来处理异常
		if(b==0){
			System.out.println("除数不能为0");
		}
		else{
			System.out.println("a"+"/"+"b="+c);
		}

	}

}
