/*����object���е�finalize����
 * finalize����ʲôʱ����ã�
 * 1.ÿ��java������finalize����
 * 2.finalize��������Ҫ����Ա���ã���ϵͳ�Զ�����
 * 3.java�������û�и��ɸ���Ķ���ָ��������ö����Ϊ�������ȴ��������ջ������ա�
 * �����������ڻ�������ʱ���Զ�����finalize����
 */
public class Test01 {
	public static void main(String[] args){
		person p=new person();
		p=null;//û��������ָ��������Ϊ�������ȴ�����
		//ʲô��û�������˵������Աֻ��  ����  ������������������
		System.gc();//ִ��������������
	}

}


class person{
	protected void finalize() throws Throwable {
		System.out.println("������������������");
	}
}