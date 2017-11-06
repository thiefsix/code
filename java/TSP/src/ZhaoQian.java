import java.util.Random;


public class ZhaoQian {
	
	public static void main(String[] args){
		
		Random rand = new Random();
		
		int huafei = (int) (Math.random()*100);
		System.out.println("消费："+huafei);
		
		int zhengqian = 100;
		System.out.println("付款："+zhengqian);
		
		int change = zhengqian - huafei;
		
			System.out.println("找零："+change);
			int fifty = change/50;
			change = change%50;
			
			int tweenty = change/20;
			change = change%20;
			
			int ten = change/10;
			change = change%10;
			
			int five = change/5;
			change = change%5;
			
			System.out.println("50元面值："+fifty+"张\n20元面值："+tweenty+"张\n10元面值："+ten+"张\n5元面值："+five+"张\n一元面值："+change+"张");
		}
		
		
	

}
