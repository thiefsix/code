
/*
 * toString�������ص���   ������@java������ڴ��ַ��Hashֵ���ھ���ת��Ϊʮ�����ơ���java.lang.Object@2a139a55��
 */
public class Test01 {
	public static void main(String[] args){
		//�����඼�̳�Object����
		Object obj1=new Object();//����Object�����
		//����toString����
		String str1=obj1.toString();
		System.out.println(str1);//java.lang.Object@2a139a55
		
		Person p=new Person("����",21);
		
		System.out.println(p.toString());
		//��println��������и�����һ������������Ĭ�ϵ�������toString����
		System.out.println(p);
	}

}


class Person{
	String name;
	int age;
	//���췽��
	Person(String name,int age){
		this.name =name;
		this.age =age;
	}
	//��дtoString����
	public String toString(){
		return "������"+name+"\t���䣺"+age+"";
	}
}