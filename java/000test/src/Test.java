import java.util.Scanner;
public class Test {
	public static void main(String args[]){
		boolean flag;
		int a=10;
		int d=12;
		double b=1.3;
		int c=a+(int)b;
	    Scanner in=new Scanner(System.in);
	    System.out.println("请输入你的名字：");
	    String name=in.next();
	    System.out.println("名字："+name);
	    System.out.println("c="+c);
	    flag=a==d;
	    System.out.println(flag);
	
	}

}
