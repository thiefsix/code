/*
 * ����Object���е�equals����
 * SUN�ṩ��equals�������ڱȽ���������֮����ڴ��ַ
 * ��SUN�ṩ��equals����������ʱ������Ҫ��дequals����
 * ������SUN�ṩ��equals����Դ�룺
 * public boolean equals(Object obj) {
        return (this == obj);
    }
 *String����д��equals���������ڱȽ϶���������Ƿ�һ��  
 */
public class Test01 {
	public static void main(String[] args){
		Object o1=new Object();
		Object o2=new Object();
		System.out.println(o1.equals(o2));//false��o1��o2���ڴ��ַ��ͬ��
		String s1=new String();
		String s2=new String();
		System.out.println(s1.equals(s2));//ture��String����д��equals�������Ƚ����ݣ�
	}

}
