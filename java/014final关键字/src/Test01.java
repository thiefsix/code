/*
 * final修饰的类无法被继承
 * final修饰的方法无法被覆盖（重写）
 * final修饰的局部变量一旦被赋值无法再更改
 * final修饰的成员变量必须“显示的（手动的）”赋值
 * final修饰的成员变量一般与static连用，表示常量，常量命名必须大写
 * final修饰引用类型时，该引用不能指向另一个对象，但是该对象里的属性值可以改变
 */
public class Test01 {
	public static void main(String[] args){
		final Man m1=new Man(20,"张三");
		//m1=new Man(20,"李四");--->错误，不能指向另一个对象
		m1.age=25;
		m1.name="李四";		//可以改变指向对象的属性值
		
	}

}

class Man{
	int age;
	String name;
	Man(int age,String name){
		this.age=age;
		this.name=name;
	}
}