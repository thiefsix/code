/*
 static�ؼ���
 1.static���εı���������̬����
 		   ��̬�����洢�ڷ�����������java���������ʾ�̬����������    ������.���ķ�ʽ
 		   �������������ж�������ֵ��һ�����������ɾ�̬����
 2.static���εķ���������̬���������þ�̬�������ײ㣩��   ������.�� �ķ�ʽ���ʣ���  ������.������ʡ��
 		  û��static���εķ����г�Ա���������ó�Ա��������Ҫ�ж�����   ������.�� �ķ�ʽ����
 3.static���ε����������̬����
 		   ��̬����������ص�ʱ��ִ�У�ִֻ��һ���������϶��µ�ִ��
 */
//ʵ�������ڴ�������ʱִ�����ڹ��캯��֮ǰִ�У�ÿ����һ�ζ����ִ��һ���������϶��µ�ִ��
public class staticTest01 {
	static{
		System.out.println(1);
	}
	static{
		System.out.println(2);
	}
	static{
		System.out.println(3);
	}
	{
		System.out.println("A");
	}
	{
		System.out.println("B");
	}
	{
		System.out.println("C");
	}
	public static void main(String args[]){
		System.out.println("main execute");
		new staticTest01();
		new staticTest01();
	}

}
