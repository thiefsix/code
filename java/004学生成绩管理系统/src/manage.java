import java.util.*;
public class manage {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int num=in.nextInt();
		System.out.println("请输入科目数：");
		int soucernum=in.nextInt();
		
		String[] str=new String[num];
		int[][] A=new int[num][soucernum];		//二维数组
		String[] name=new String[num];			//存储学生姓名
		String[] soucer=new String[soucernum];	//存储学科名称
		int[] sum=new int[num];
		int[] avg=new int[num];
		String str1="";
		for(int i=1;i<=soucernum;i++){
			System.out.println("请输入第"+i+"门学科：");
			soucer[i-1]=in.next();
		}
		for(int i=1;i<=num;i++){
			int S=0;
			System.out.println("请输入第"+i+"学生姓名：");
			name[i-1]=in.next();
			for(int j=0;j<soucernum;j++){
				System.out.println("请输入"+name[i-1]+"的"+soucer[j]+"成绩：");
				A[i-1][j]=in.nextInt();
				S+=A[i-1][j];
				str1+=A[i-1][j]+"\t";
			}
			sum[i-1]=S;
			avg[i-1]=(sum[i-1]/soucernum);
			str[i-1]=name[i-1]+"\t"+str1+sum[i-1]+"\t"+avg[i-1];
			str1="";
		}
		for(int i=0;i<num;i++){
			for(int j=0;j<(num-1);j++){
				if(sum[j]<sum[j+1]){
					int t=sum[j];           String str2=str[j];
					sum[j]=sum[j+1];		str[j]=str[j+1];
					sum[j+1]=t;				str[j+1]=str2;
				}
			}
		}
		System.out.print("学生");
		for(int i=0;i<soucernum;i++){
			System.out.print("\t"+soucer[i]);
		}
		System.out.print("\t总分\t平均分\t排行榜");
		System.out.println();
		for(int i=0;i<num;i++){
			System.out.print(str[i]+"\t第"+(i+1)+"名");
			System.out.println();
		}
	}
}
