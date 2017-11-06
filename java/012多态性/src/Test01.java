
/*
 向上转型(upCasting): 子--->父
 向下转型(downCasting):父--->子
 
 注意：无论是向上转型还是向下转型，两个类之间都要有继承关系
 
 */
public class Test01 {
	public static void main(String[] args){
		//编译阶段a1被看作Animal类型，在运行阶段堆中的对象实际是Cat类型		
		Animal a1=new Cat();//向上转型（自动类型转换）
		
		//程序在编译阶段a1被编译器看作Animal类型，引用a1绑定的是Animal类型的eat方法（静态绑定）
		//程序在运行时堆中的实际对象是Cat类型，而Cat已经重写了eat方法（静态绑定）
		a1.eat();//猫吃鱼
		
		
		//向下转型(强制类型转换)
		Animal a2=new Cat();
		//要执行Cat中的特有的Cat方法，怎么做
		Cat c1=(Cat)a2;//强制将Animal类型的a2转换为Cat类型
		c1.move();
		
		//判断一下程序会出现什么问题
		Animal a3=new Dog();//向上转型
		
		//Cat c2=(Cat)a3;	//编译能通过，但运行是报错java.lang.ClassCastException
		System.out.println(a3 instanceof Cat);//false
		//“引用  instanceof  类型” 判断  “引用” 保存的内存地址指向的对象是不是这个  “类型”
		// instanceof 运算结果是boolean类型
		if(a3 instanceof Cat){
			Cat c2=(Cat)a3;
		}
	}

}
