
/*
 * super不是引用类型，super中存储的不是内存地址，super指向的不是父类型
 * super代表的是当前子类型对象中的父类型特征
 * 什么时候使用super？
 * 		当子类型和父类型中都有某个数据时，想在子类型中访问父类型的这个数据时使用“super.”
 * super可以用在什么地方？
 * 1.super可以用在成员方法中
 * 2.super可以用在构造方法中
 * 		语法：super(实参)；若子类的构造方法中第一行没有"this()"和"super()"
 * 			    则系统默认有"super()"；"super()"只能放在第一行
 * 		作用：通过子类的构造方法调用父类的构造方法,但是不会创建父类对象
 * 3.不可以用在静态方法中，因为静态方法的访问与对象无关
 */
public class Test01 {
	public static void main(String[] args){
		Manage m=new Manage();
		m.m1();
		//调用子类的构造方法
		new Manage();//父类的构造方法被调用
	}

}

//父类
class Employeer{
	String name = "张三";
	public void work(){
		System.out.println("员工在工作");
	}
	//构造方法
	public Employeer(){
		System.out.println("父类的构造方法被调用");
	}
}

//子类
class Manage extends Employeer{
	String name = "李四";
	//重写了子类中的work方法
	public void work(){
		System.out.println("经理在工作");
	}
	public void m1(){
		work();//经理在工作
		super.work();//员工在工作
		System.out.println(name);//李四
		System.out.println(super.name);//张三
	}
	//空的构造函数
	public Manage(){}
	
}