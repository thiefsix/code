import java.util.Scanner;

public class xxxx_c6e4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入学生成绩，以-1结束");
		double[] scores = new double[20];
		int count=0;
		double sum=0;
		int up=0;
		Scanner input = new Scanner(System.in);
		do{
			scores[count] = input.nextDouble();
			if(scores[count]>=0){
				
			    sum += scores[count];
			}
		}while(scores[count++]>=0);
		System.out.println("count is "+(count-1));
		double average = sum/(count-1);
		System.out.println("average is "+average);
		for(int i = 0;i<count;i++){
			if(scores[i]>=average){
				up++;
			}
		}
		System.out.println("OverAverage is "+up+"个");
		System.out.println("DownAverage is "+(count-up-1)+"个");
	}

}
