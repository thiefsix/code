
public class Test01 {
	public static void main(String args[]){
		Student stu1=new Student();		//����ȱʡ�Ĺ��캯����������stu1��
		stu1.setAge(10);				//���ó�Ա��������Ա���������⸳ֵ	
		System.out.println(stu1.getAge());//���ó�Ա������ȡ��Ա������ֵ
		Student stu2=new Student(20);	//�����вεĹ��캯����������stu2��
		Student stu3=new Student("Newyork","Make"); //�����вεĹ��캯����������stu3��
		Student stu4=new Student();    //����ȱʡ�Ĺ��캯����������stu4��
		System.out.println(stu2.id);
		System.out.println(stu3.addr);
		System.out.println(stu3.name);
	}

}
