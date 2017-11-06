import java.util.*;

public class xxxx_c4e2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_QUESTIONS=10;
		int correctCount=0;
		int count =0;
		long starttime=System.currentTimeMillis();
		String output="";
		Scanner input=new Scanner(System.in);
		
		while(count<NUMBER_OF_QUESTIONS){
			int number1=(int)(Math.random()*15);
			int number2=(int)(Math.random()*15);
			
			if(number1<number2){
				int temp=number1;
				number1=number2;
				number2=temp;
			}
			
			System.out.println("what is "+number1+"-"+number2+"?");
			int answer=input.nextInt();
			
			if(number1==number2){
				System.out.println("You are corrrect");
				correctCount++;
			}
			else
				System.out.println("Your answer is wrong.\n"+number1+"-"+number2+"should be"+(number1-number2));
			
			count++;
			
			output +="\n"+number1+"-"+number2+"="+answer+((number1-number2==answer) ? "correct" : "wrong"); 
		}
		
		long endtime=System.currentTimeMillis();
		long testtime=endtime-starttime;
		
		System.out.println("Correct count is"+correctCount+"\nTest time is"+testtime/1000+"second\n"+output);
	}

}
