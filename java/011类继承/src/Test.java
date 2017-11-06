
public class Test {
	public static void main(String[] args){
		Test01 s=new Test01();
		s.f1();
		s.f2();
		Test02 s2=new Test02();
		s2.f3();
		s2.f1();
		s2.f2();
		//System.out.println(s2.age);-->错误，不能直接访问
		s2.setAge(10);
		System.out.println(s2.getAge());//正确，可以间接访问
	}

}
