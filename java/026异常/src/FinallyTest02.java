
public class FinallyTest02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=m1();
		System.out.println(i);//i=10;
	}
	public static int m1(){
		int i=10;
		try{
			//�˴�ʵ�����½���һ����ʱ��������i��ֵ���������ʱ�����������ش���ʱ������ֵ
			//��û����������i��ֵ������main�����������i��ֵΪ10��
			return i;
		}finally{
			i++;
			System.out.println("m1������i="+i);
		}
	}

}
