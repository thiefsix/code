/*
 *匿名内部类：没有名字的类
 */
public class Test01 {
	//定义一个方法
	public static void m1(CustomerService cs){
		cs.logout();
	}
	public static void main(String[] args){
	//接口无法创建对象，m1方法需要一个CustomerService类型的对象，如何调用m1方法logout方法
		//使用匿名内部类创建对象，整个“CustomerService(){}”就是一个匿名内部类
	Test01.m1(new CustomerService(){
		public void logout(){
			System.out.println("exit");
		}
	});
	}
}

//定义一个接口
interface CustomerService{
	//退出系统(抽象方法)
	void logout();
}