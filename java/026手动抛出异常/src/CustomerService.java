
//�˿�ע��
public class CustomerService {
	//ע�᷽��
	public void register(String name)throws IllegalNameException{
		if(name.length()<6){
			//�ֶ��׳�
			IllegalNameException e=new IllegalNameException("�û�������Ҫ����6λ");
			throw e;
			//�����������ɺ�Ϊһ�䡰throw new IllegalNameException("�û�������Ҫ����6λ")��
		}
		//�������ִ�е��ˣ���û�г����쳣
		System.out.println("ע��ɹ�");
	}
}
