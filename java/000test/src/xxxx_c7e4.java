import java.util.Scanner;

public class xxxx_c7e4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time[][] ={{2,4,3,4,5,8,8,0},
					   {7,3,4,3,3,4,4,0},
					   {3,3,4,3,3,2,2,0},
					   {9,3,4,7,3,4,1,0},
					   {3,5,4,3,6,3,8,0},
					   {3,4,4,6,3,4,4,0},
					   {3,7,4,8,3,8,4,0},
					   {6,3,5,9,2,7,9,0}};
		
		for(int i=0;i<8;i++){
			int sum=0;
			int j=0;
			for(j=0;j<7;j++){
				sum+=time[i][j];
			}
			time[i][j]=sum;
		}
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(time[i][7]>time[j][7]){
					int temp[]=new int[7];
					temp=time[i];
					time[i]=time[j];
					time[j]=temp;
				}
			}
		}
		for(int i=0;i<8;i++){
			for(int j=0;j<7;j++){
				System.out.print(time[i][j]+" ");
			}
			System.out.println();
		}
	}

}
