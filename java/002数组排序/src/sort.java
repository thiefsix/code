import java.util.Scanner;
public class sort {
public static void main(String args[]){
	int[] array=new int[10];
	System.out.println("ÇëÊäÈëÊı¾İ");
	Scanner in=new Scanner(System.in);
	for(int i=0;i<10;i++){
		array[i]=in.nextInt();
	}
	for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			if(array[i]<array[j]){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	for(int i=0;i<10;i++){
		System.out.print(array[i]+"  ");
	}
}
}
