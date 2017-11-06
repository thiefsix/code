/*
 * 抽象类语法：class关键字前加“abstract”修饰词
 * 抽象类无法被实例化，但是有构造方法，构造方法是给子类用的
 * 抽象类中可以定义抽象方法
 * 		定义抽象方法语法：在方法的修饰符列表中加“abstract”关键字，且抽象方法没有方法体，所以必须以“ ; ”结束。
 * 				例如：	public abstract void m1();
 * 抽象类中不一定有抽象方法，但抽象方法只能出现在抽象类中
 * 		一个非抽象类继承抽象类必须将抽象类中的抽象方法覆盖（重写，实现）
 */
public class Test01 {
	public static void main(String[] args){
		//多态
		A a=new B();//抽象类构造方法被调用
		a.m1();//重写抽象方法
	}

}

abstract class A{		//抽象类
	//构造方法
	A(){
		System.out.println("抽象类构造方法被调用");
	}
	//抽象方法
	public abstract void m1();
}

class B extends A{
	//重写抽象方法
	public void m1(){
		System.out.println("重写抽象方法");
	}
	
}
