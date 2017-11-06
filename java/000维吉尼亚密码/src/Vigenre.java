import java.util.*;
public class Vigenre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入明文：");
		String message=input.next();
		
		System.out.println("请输入秘钥：");
		String key=input.next();
		
		int quotient=message.length()/key.length();
		int remander=message.length()%key.length();
		String output="";
		
		for(int i=0;i<quotient;i++){
			for(int j=0;j<key.length();j++){
				int c=((message.charAt(i*key.length()+j)-'a')+(key.charAt(j)-'a'))%26+'a';
				output+=(char)c;
			}
		}
		for(int i=0;i<remander;i++){
			int c=((message.charAt(key.length()*quotient+i)-'a')+(key.charAt(i)-'a'))%26+'a';
			output+=(char)c;
		}
		
		System.out.println(output);
		
	}

}
