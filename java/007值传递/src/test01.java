
public class test01 {
	public static void main(String args[]){
		int a=10;				//创建int类型变量
		f1(a);					//基本数据类型的值传递
		System.out.println(a);
		Man m=new Man(10);		//创建Man类型对象
		f2(m);					//引用数据类型的值传递
		System.out.println(m.age);
	}
	//f2函数(方法)
	public static void f2(Man a){
		a.age++;
		System.out.println(a.age);
	}
	//f1函数（方法）
	public static void f1(int a){
		a++;
		System.out.println(a);
	}
}


//Man类
 class Man{
	int age;  //filed
	//构造函数给age赋值
	Man(int _age){
		age=_age;
	}
}