/*面向对象的封装指得是：
	1.成员变量的私有化
	2.对外提供公开的setter和getter（set函数和get函数的命名要符合规范）
  成员函数的语法：修饰词  返回值类型  成员函数名（形参）{函数体}
  构造函数的语法：修饰词  构造函数名（形参）{函数体}  ！！注意：没有返回值类型！！*/

public class Student {
	String name;
	boolean sex;
	int id;
	private int age;
	String addr;
	public void setAge(int _age){
		if(_age<0||_age>100){
			System.out.println("年龄不合法");
			return;
		}
		age=_age;
	}
	public int getAge(){
		return age;
	}
	public Student(int _id){
		id=_id;
	}
	public Student(){
		System.out.println("缺省的构造函数被调用");
	}
	public Student(String _addr,String _name){
		addr=_addr;
		name=_name;
	}
	public Student(boolean _sex){
		sex=_sex;
	}

}
