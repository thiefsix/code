/*
 * 关于成员内部类
 * 1.成员内部类可以看作成员变量
 * 2.成员内部类中不能有静态声明（静态变量，静态方法。。。）
 * 3.成员内部类可以访问外部类的所有数据
 */
public class Test01 {
	//静态变量
	static String name ="jianlaing";
	//成员变量
	int age=20;
	//静态方法
	public static void m1(){
		System.out.println("静态方法执行");
	}
	//成员方法
	public void m2(){
		System.out.println("成员方法执行");
	}
	//成员内部类，可以用访问控制权限修饰词修饰（public,private,protected,缺省）
	public class Inner{
		//静态方法
		/*public static void m3(){
			System.out.println(name);
			System.out.println(age);
			m2();
		}-->成员内部类中不能有静态声明*/
		//成员方法
		public void m4(){
			System.out.println(name);
			System.out.println(age);
			m2();
		}
	}
	public static void main(String[] args){
		//如何访问成员内部类中的m4方法
		//1.创建外部类对象
		Test01 t=new Test01();
		//创建内部类对象
		Inner in=t.new Inner();
		//访问m4方法
		in.m4();
	}
}

