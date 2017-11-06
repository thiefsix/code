import java.util.Scanner;

public class xxxx_c7e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a 4-by-4 matrix row by row:");
		int m[][] = new int[4][4];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				m[i][j]=input.nextInt();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(m));
	}
	
	
	
	public static int sumMajorDiagonal(int[][] m){
		int sum=0;
		for (int i=0;i<4;i++){
			sum+=m[i][i];
		}
		return sum;
	}

}
