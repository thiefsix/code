
public class Person {
	/*public void fee(Dog d){
	 d.eat();
	}
	
	//因为用户需求改变了，所以软件要升级
	 public void fee(Cat c){
	 c.eat();
	}
	*/
	//编程时尽量不要面向具体，要面向父类型，面向抽象
	public void feed(Animal a){
		a.eat();
	}
	

}
