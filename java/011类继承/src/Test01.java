

//父类
public class Test01 {
	private int age;
	Test01(){}		//构造函数无法被继承
	public void f1(){
		System.out.println("f1...");
	}
	public void f2(){
		System.out.println("f2...");
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}

}
