import java.util.Scanner;

public class xxxx_C9E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please input a string");
		String str=input.next();
		System.out.println("please input a char");
		char a=input.next().charAt(0);
		System.out.println(count(str,a));
	}
	public static int count(String str,char a){
		int sum=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==a)
				sum++;
		}
		return sum;
	}

}
