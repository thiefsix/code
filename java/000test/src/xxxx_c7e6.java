import java.util.Arrays;
import java.util.Scanner;

public class xxxx_c7e6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÇëÊäÈëÊı¾İ");
		Scanner input = new Scanner(System.in);
		double[][] a= new double[3][3];
		double[][] b= new double[3][3];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=input.nextDouble();
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				b[i][j]=input.nextDouble();
			}
		}
		double[][] result = mulyiplyMatix(a,b);
		for(int i=0;i<3;++i)
			System.out.println(Arrays.toString(result[i]));
	}
	
	
	public static double[][] mulyiplyMatix(double[][] a,double[][] b){
		double[][] result = new double[3][3];
		double sum=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					result[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return result;
	}

}
