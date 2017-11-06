
public class Test01 {
	public static void main(String args[]){
		Student stu1=new Student();		//调用缺省的构造函数创建对象“stu1”
		stu1.setAge(10);				//调用成员函数给成员变量在类外赋值	
		System.out.println(stu1.getAge());//调用成员函数读取成员变量的值
		Student stu2=new Student(20);	//调用有参的构造函数创建对象“stu2”
		Student stu3=new Student("Newyork","Make"); //调用有参的构造函数创建对象“stu3”
		Student stu4=new Student();    //调用缺省的构造函数创建对象“stu4”
		System.out.println(stu2.id);
		System.out.println(stu3.addr);
		System.out.println(stu3.name);
	}

}
