
/*
 关于方法覆盖：
 方法重写：是继承的最重要功能
 1.什么时候发生方法的重写：
 		当父类中的方法不能满足需求时，需要将父类中的方法重写一遍
 2.子类如果重写父类中的方法后子类对象一定调用的是重写之后的方法
 3.发生方法覆盖的条件：
 		第一：方法覆盖发生在两个具有继承关系的类之间
 		第二：方法覆盖必须要有相同的返回值类型，相同的方法名，相同的参数列表
 		第三：重写的方法不能比被重写的方法拥有更低的访问权限（private>public）
 		第四：重写的方法不能比被重写的方法抛出更宽泛的异常（异常机制）
 		第五：私有的方法不能被覆盖（private拥有最高的访问权限）
 		第六：构造方法不能被覆盖（构造方法不能被继承）
 		第七：静态方法不存在覆盖
 		第八：覆盖指的是成员方法，和成员变量无关
 */
public class Override {
	public static void main(String[] args){
		Cat c=new Cat();
		c.f2();
	}

}

//父类
class Animal{
	//成员方法
	public void f1(){
		System.out.println("动物在行走");
	}
}

//子类
class Cat extends Animal{
	public void f2(){
		System.out.println("猫在走猫步");
	}
}