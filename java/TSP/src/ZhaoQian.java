import java.util.Random;


public class ZhaoQian {
	
	public static void main(String[] args){
		
		Random rand = new Random();
		
		int huafei = (int) (Math.random()*100);
		System.out.println("���ѣ�"+huafei);
		
		int zhengqian = 100;
		System.out.println("���"+zhengqian);
		
		int change = zhengqian - huafei;
		
			System.out.println("���㣺"+change);
			int fifty = change/50;
			change = change%50;
			
			int tweenty = change/20;
			change = change%20;
			
			int ten = change/10;
			change = change%10;
			
			int five = change/5;
			change = change%5;
			
			System.out.println("50Ԫ��ֵ��"+fifty+"��\n20Ԫ��ֵ��"+tweenty+"��\n10Ԫ��ֵ��"+ten+"��\n5Ԫ��ֵ��"+five+"��\nһԪ��ֵ��"+change+"��");
		}
		
		
	

}
