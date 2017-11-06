/*
 * 关于静态内部类
 * 1.静态内部类可以看作静态变量
 * 2.内部类可以访问外部类的私有数据
 * 3.静态内部类可以访问外部类的静态数据，不能访问成员
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
	//静态内部类，可以用访问控制权限修饰词修饰（public,private,protected,缺省）
	public static class Inner{
		//静态方法
		public static void m3(){
			System.out.println(name);
			//System.out.println(age);
			//m2();-->静态内部类不能访问成员数据
		}
		//成员方法
		public void m4(){
			System.out.println(name);
			//System.out.println(age);
			//m2();-->静态内部类不能访问成员数据
		}
	}
	public static void main(String[] args){
		//调用静态内部类中的静态m3方法
		Test01.Inner.m3();//-->静态方法调用直接用"类名."访问
		//调用静态内部类中的成员方法m4；
		Inner i=new Test01.Inner();
		i.m4();//-->成员方法调用需要先创建对象，在用"引用."访问
	}

}
