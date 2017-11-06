
/*
 多态的好处：降低代码之间的耦合度增加项目的扩展能力
 */
public class Test02 {
	public static void main(String[] args){
		//新建一个人
		Person p=new Person();
		//新建一只宠物
		Dog d=new Dog();
		Cat c=new Cat();
		//喂养
		p.feed(d);
		p.feed(c);
	}

}
