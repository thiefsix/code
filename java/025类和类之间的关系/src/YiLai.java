/*
 *依赖关系：通常体现在局部变量，方法的参数列表和方法的返回值类型上
 */
public class YiLai {
	public void m1(){
		A a=new A();//此时A类在方法m1中，是局部变量，YiLai类与A类之间是依赖关系
	}
}

class A{
	
}