import java.util.Scanner;
public class guess {
	public static void main(String args[]){
		System.out.println("���ȭ����1��ʯͷ��2��������3������");
		Scanner in=new Scanner(System.in);
		int person=in.nextInt();
		int computer=(int)(Math.random()*3)+1;
		String mark="ȭͷ";
		String mark1="ȭͷ";
		switch(person){
		case 1:
			mark="ʯͷ";
			break;
		case 2:
			mark="����";
			break;
		case 3:
			mark="��";
			break;
		}
		switch(computer){
		case 1:
			mark1="ʯͷ";
			break;
		case 2:
			mark1="����";
			break;
		case 3:
			mark1="��";
			break;
		}
		if(computer==person){
			System.out.println("������ǣ�"+mark+"\n���Գ����ǣ�"+mark1+"\nƽ��");
			}
			else if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1){
				System.out.println("������ǣ�"+mark+"\n���Գ����ǣ�"+mark1+"\n������");
			}else System.out.println("������ǣ�"+mark+"\n���Գ����ǣ�"+mark1+"\n��Ӯ��");
				
	}

}
