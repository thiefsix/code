import java.util.Scanner;
public class guess {
	public static void main(String args[]){
		System.out.println("请出拳：（1：石头，2：剪刀，3：布）");
		Scanner in=new Scanner(System.in);
		int person=in.nextInt();
		int computer=(int)(Math.random()*3)+1;
		String mark="拳头";
		String mark1="拳头";
		switch(person){
		case 1:
			mark="石头";
			break;
		case 2:
			mark="剪刀";
			break;
		case 3:
			mark="布";
			break;
		}
		switch(computer){
		case 1:
			mark1="石头";
			break;
		case 2:
			mark1="剪刀";
			break;
		case 3:
			mark1="布";
			break;
		}
		if(computer==person){
			System.out.println("你出的是："+mark+"\n电脑出的是："+mark1+"\n平局");
			}
			else if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1){
				System.out.println("你出的是："+mark+"\n电脑出的是："+mark1+"\n你输了");
			}else System.out.println("你出的是："+mark+"\n电脑出的是："+mark1+"\n你赢了");
				
	}

}
