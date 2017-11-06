
/*
 * toString方法返回的是   “类名@java对象的内存地址的Hash值，在经过转换为十六进制”（java.lang.Object@2a139a55）
 */
public class Test01 {
	public static void main(String[] args){
		//所有类都继承Object基类
		Object obj1=new Object();//创建Object类对象
		//调用toString方法
		String str1=obj1.toString();
		System.out.println(str1);//java.lang.Object@2a139a55
		
		Person p=new Person("渐凉",21);
		
		System.out.println(p.toString());
		//若println后的括号中跟的是一个引用类型则默认调用他的toString方法
		System.out.println(p);
	}

}


class Person{
	String name;
	int age;
	//构造方法
	Person(String name,int age){
		this.name =name;
		this.age =age;
	}
	//重写toString方法
	public String toString(){
		return "姓名："+name+"\t年龄："+age+"";
	}
}