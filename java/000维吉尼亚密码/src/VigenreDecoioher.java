import java.util.Scanner;


public class VigenreDecoioher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("«Î ‰»Î√‹Œƒ£∫");
		String ciphertext=input.next();
		
		System.out.println("«Î ‰»Î√ÿ‘ø£∫");
		String key=input.next();
		
		int quotient=ciphertext.length()/key.length();
		int remander=ciphertext.length()%key.length();
		String output="";
		
		for(int i=0;i<quotient;i++){
			for(int j=0;j<key.length();j++){
				int m=((ciphertext.charAt(i*key.length()+j)-'a'+26)-(key.charAt(j)-'a'))%26+'a';
			
				output+=(char)m;
			}
		}
		
		for(int i=0;i<remander;i++){
			int m=((ciphertext.charAt(key.length()*quotient+i)-'a'+26)-(key.charAt(i)-'a'))%26+'a';
			output+=(char)m;
		}
		
		System.out.println(output);
		
	}

}
