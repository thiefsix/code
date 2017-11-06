
/*
 引进类继承的最基本的作用是：代码复用。
 语法：[修饰符列表] class 子类名 extends 父类名{类体}
 
 java语言中类和类之间只支持单继承
 
 一个类如果没有显示的继承其他类，则默认继承Object类，
 Object类是SUN提供的java中的根类
 */
/*子类
 除了构造函数外，子类可以继承父类的一切东西包括私有的，但不能直接访问私有的，可以间接访问
*/
public class Test02 extends Test01 {
	public void f3(){
		System.out.println("f3...");
	}

}
