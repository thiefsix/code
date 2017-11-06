/*
 *关于局部内部类
 *1.局部内部类相当于局部变量
 *重点：2.局部内部类访问局部变量时，局部变量必须使用final修饰
 *3.局部内部类中不能有静态声明
 */
public class Test01 {
	public void m1(){
		//局部变量
		final int age = 20;
		//局部内部类
		//局部内部类不能用权限访问控制修饰符修饰
		class Inner{
			public void m2(){
				System.out.println(age);
			}
		}
		//调用m2方法
		Inner i=new Inner();
		i.m2();
	}
	public static void main(String[] agrs){
		//通过调用m1方法间接调用m2方法
		Test01 t=new Test01();
		t.m1();
	}

}
