import java.util.*;
public class xxxx_c3e6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Please input the weight in pounds");
		double weight=input.nextDouble();
		System.out.println("Please input the height of feet");
		double feet=input.nextDouble();
		System.out.println("Please input the weight of inch");
		double inch=input.nextDouble();
		
		double weight_kg=weight*0.45359237;
		double height_m=(feet*12+inch)*0.0254;
		
		double bmi=weight_kg/(height_m*height_m);
		
		System.out.println("Your BMI is"+bmi);
		if(bmi<16)
			System.out.println("You are seriously underweight");
		else if(bmi<18)
			System.out.println("You are underweight");
		else if(bmi<24)
			System.out.println("You are normal weight");
		else if(bmi<29)
			System.out.println("You are overweight");
		else if(bmi<35)
			System.out.println("You are seriously overweight");
		else
			System.out.println("You are gravely overweight");
	}

}
