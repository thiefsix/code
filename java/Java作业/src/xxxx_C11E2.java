
public class xxxx_C11E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Sam","Wuhan","1234560","111@163.com");
		Student s = new Student();
		Employee e = new Employee();
		Faculty f= new Faculty();
		Staff sf = new Staff();
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(sf.toString());
	}

}

class Person{
	//field
	String name;
	String addr;
	String number;
	String email;
	//construct
	public Person(String name,String addr,String number,String email){
		this.name=name;
		this.addr=addr;
		this.number=number;
		this.email=email;
	}
	public Person(){}
	//method
    public String toString(){
		String str=getClass().getName()+'@'+this.name;
		return str;
	}
}

class Student extends Person {
	public static final String CLASSONE="大一"; 
	public final static String CLASSTWO="大二";
	public final static String CLASSTHREE="大三";
	public final static String CLASSFOUR="大四";
	//construct
	public Student(){}
	public Student(String name,String addr,String number,String email){
		this.name=name;
		this.addr=addr;
		this.number=number;
		this.email=email;
	}
	
	
}

class Employee extends Person{
	int office;
	double salary;
	String empdate;
	public Employee(){}
	public Employee(String name,String addr,String number,String email,int office,double salary,String empdate){
		this.name=name;
		this.addr=addr;
		this.number=number;
		this.email=email;
		this.office=office;
		this.salary=salary;
		this.empdate=empdate;
	}
}

class Staff extends Employee{
	String job;
	
	public Staff(){}
	public Staff(String name,String addr,String number,String email,String job){
		this.name=name;
		this.addr=addr;
		this.number=number;
		this.email=email;
		this.job=job;
	}
}

class Faculty extends Employee{
	String worktime;
	String rank;
	public Faculty(){}
	public Faculty(String name,String addr,String number,String email,String worktime,String rank){
		this.name=name;
		this.addr=addr;
		this.number=number;
		this.email=email;
		this.worktime=worktime;
		this.rank=rank;
	}
}

class Mydate{
	int year;
	int month;
	int date;
	public Mydate(){}
	public String toString(){
		return this.getClass().getName();
	}
}
