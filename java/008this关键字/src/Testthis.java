/*1.this��ʲô
	this��һ����������
	�ڶ���ÿһ��java������this
	thisָ��ǰ����
  2.this����ʲô�ط�
    ��һthis�����ڳ�Ա��������������
    �ڶ�this�����ڹ��캯������������ 
            �﷨��this(ʵ��)  ͨ��һ�����췽��������һ�����췽��Ŀ�����ڴ�������
            this(ʵ��)  ��������ڹ��췽���ĵ�һ��
    ����this�����������ֳ�Ա�����;ֲ�����
     ����this�����������ھ�̬������*/
public class Testthis {
	public static void main(String args[]){
		Mydate t1=new Mydate(1994,10,20);
		System.out .println(t1.year+"��"+t1.month+"��"+t1.date+"��");
		Mydate t2=new Mydate();
		t2.setYear( 2008);
		System.out.println(t2.getYear()+"��");
		Mydate t3=new Mydate();
		System.out.println(t3.year+"��"+t3.month+"��"+t3.date+"��");
	}

}


class Mydate{
	//filed
	int year;
	int month;
	int date;
	//constructor(���캯��)
	Mydate(){
		this(2008,2,5);//ͨ��    this(ʵ��)  �����вεĹ��췽����this��ʵ�Σ������ڵ�һ��
	}
	Mydate(int year,int month,int date){
		this.year=year;
		this.month=month;
		this.date=date;
	}
	//��Ա����
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return this.year;	//�˴�this��ʡ
	}
}