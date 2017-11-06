/*1.this是什么
	this是一个引用类型
	在堆中每一个java对象都有this
	this指向当前对象
  2.this用在什么地方
    第一this可用在成员函数（方法）中
    第二this可用在构造函数（方法）中 
            语法：this(实参)  通过一个构造方法调用另一个构造方法目的在于代码重用
            this(实参)  必须出现在构造方法的第一行
    第三this可以用来区分成员变量和局部变量
     第四this绝不可以用在静态方法中*/
public class Testthis {
	public static void main(String args[]){
		Mydate t1=new Mydate(1994,10,20);
		System.out .println(t1.year+"年"+t1.month+"月"+t1.date+"日");
		Mydate t2=new Mydate();
		t2.setYear( 2008);
		System.out.println(t2.getYear()+"年");
		Mydate t3=new Mydate();
		System.out.println(t3.year+"年"+t3.month+"月"+t3.date+"日");
	}

}


class Mydate{
	//filed
	int year;
	int month;
	int date;
	//constructor(构造函数)
	Mydate(){
		this(2008,2,5);//通过    this(实参)  调用有参的构造方法，this（实参）出现在第一行
	}
	Mydate(int year,int month,int date){
		this.year=year;
		this.month=month;
		this.date=date;
	}
	//成员函数
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return this.year;	//此处this可省
	}
}