
import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		Scanner input=new Scanner(System.in);
		System.out.println("please input a message");
		s=input.next();
		System.out.println("please input a key");
		int key=input.nextInt();
		for(int i=0;i<s.length();i++){
			int m=(int)s.charAt(i);
			m+=key;
			char c=(char)m;
			System.out.print(c);
		}
		

	}

}
