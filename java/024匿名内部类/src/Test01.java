/*
 *�����ڲ��ࣺû�����ֵ���
 */
public class Test01 {
	//����һ������
	public static void m1(CustomerService cs){
		cs.logout();
	}
	public static void main(String[] args){
	//�ӿ��޷���������m1������Ҫһ��CustomerService���͵Ķ�����ε���m1����logout����
		//ʹ�������ڲ��ഴ������������CustomerService(){}������һ�������ڲ���
	Test01.m1(new CustomerService(){
		public void logout(){
			System.out.println("exit");
		}
	});
	}
}

//����һ���ӿ�
interface CustomerService{
	//�˳�ϵͳ(���󷽷�)
	void logout();
}