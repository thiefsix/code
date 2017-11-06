import java.util.InputMismatchException;
import java.util.Scanner;

public class xxxx_C13E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter two num");
		Scanner input = new Scanner(System.in);
		try{
			int n1=input.nextInt();
			int n2=input.nextInt();
			int sum = n1+n2;
			System.out.println("what "+n1+"+"+n2+" is "+sum);
		}catch(InputMismatchException n){
			System.out.println("The input is illegal,please enter again");
		}
	}
}
