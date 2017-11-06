/*
 static关键字
 1.static修饰的变量叫做静态变量
 		   静态变量存储在方法区，所有java对象共享，访问静态变量必须用    “类名.”的方式
 		   如果这个属性所有对象都有且值都一样，则声明成静态变量
 2.static修饰的方法叫做静态方法，调用静态方法（底层）用   “类名.” 的方式访问，且  “类名.”可以省略
 		  没有static修饰的方法叫成员方法，调用成员方法必须要有对象用   “引用.” 的方式访问
 3.static修饰的语句块叫做静态语句块
 		   静态语句块在类加载的时候执行，只执行一次且是自上而下的执行
 */
//实例语句块在创建对象时执行且在构造函数之前执行，每创建一次对象就执行一次且是自上而下的执行
public class staticTest01 {
	static{
		System.out.println(1);
	}
	static{
		System.out.println(2);
	}
	static{
		System.out.println(3);
	}
	{
		System.out.println("A");
	}
	{
		System.out.println("B");
	}
	{
		System.out.println("C");
	}
	public static void main(String args[]){
		System.out.println("main execute");
		new staticTest01();
		new staticTest01();
	}

}
