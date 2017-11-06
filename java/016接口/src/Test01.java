/*
 * 接口是一种引用，可以等同看作类
 * 1.如何定义接口？
 * 		语法：[修饰符列表] interface 接口名{}
 * 2.接口中只能出现常量，抽象方法
 * 3.接口是一种特殊的抽象类，特殊在接口是完全抽象化的
 * 4.接口中没有构造方法，无法被实例化
 * 5.接口和接口之间可以多继承
 * 6.一个类可以实现多个接口（这里的“实现”等同“继承”的意思）
 * 7.一个非抽象类在实现接口时要重写接口的抽象方法
 * 接口的作用
 * 1.将项目分层，所有层面向接口开发；便于合作开发，提高效率
 * 2.接口是代码之间的耦合度降低，就像主板和内存条，变得      “可插拔”
 */
public class Test01{
	
}

interface A{
	//常量，必须用    "public static final"的形式开头，且 “ public static final” 可省略
	public static final int I=100;
	public static final String NAME="jianliang";
	double PI=3.14;
	
	//抽象方法,必须以  “public abstract” 的形式开头，且  “public abstract” 可省略
	public abstract void m1();
	void m2();
}

interface B{
	void m2();
}
interface C{
	void m3();
}
interface D{
	void m4();
}
//接口之间实现多继承
interface E extends B,C,D{
	void m5();
}

//"implements" 和  “extends”意思相同，是一个关键字，用于“类”实现“接口”
class Myclass implements B,C,D{
	//重写接口中的抽象方法
	public void m2(){}
	public void m3(){}
	public void m4(){}
	
}