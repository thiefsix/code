
/*
 ����ת��(upCasting): ��--->��
 ����ת��(downCasting):��--->��
 
 ע�⣺����������ת�ͻ�������ת�ͣ�������֮�䶼Ҫ�м̳й�ϵ
 
 */
public class Test01 {
	public static void main(String[] args){
		//����׶�a1������Animal���ͣ������н׶ζ��еĶ���ʵ����Cat����		
		Animal a1=new Cat();//����ת�ͣ��Զ�����ת����
		
		//�����ڱ���׶�a1������������Animal���ͣ�����a1�󶨵���Animal���͵�eat��������̬�󶨣�
		//����������ʱ���е�ʵ�ʶ�����Cat���ͣ���Cat�Ѿ���д��eat��������̬�󶨣�
		a1.eat();//è����
		
		
		//����ת��(ǿ������ת��)
		Animal a2=new Cat();
		//Ҫִ��Cat�е����е�Cat��������ô��
		Cat c1=(Cat)a2;//ǿ�ƽ�Animal���͵�a2ת��ΪCat����
		c1.move();
		
		//�ж�һ�³�������ʲô����
		Animal a3=new Dog();//����ת��
		
		//Cat c2=(Cat)a3;	//������ͨ�����������Ǳ���java.lang.ClassCastException
		System.out.println(a3 instanceof Cat);//false
		//������  instanceof  ���͡� �ж�  �����á� ������ڴ��ַָ��Ķ����ǲ������  �����͡�
		// instanceof ��������boolean����
		if(a3 instanceof Cat){
			Cat c2=(Cat)a3;
		}
	}

}
