import java.util.*;
public class manage {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("������ѧ��������");
		int num=in.nextInt();
		System.out.println("�������Ŀ����");
		int soucernum=in.nextInt();
		
		String[] str=new String[num];
		int[][] A=new int[num][soucernum];		//��ά����
		String[] name=new String[num];			//�洢ѧ������
		String[] soucer=new String[soucernum];	//�洢ѧ������
		int[] sum=new int[num];
		int[] avg=new int[num];
		String str1="";
		for(int i=1;i<=soucernum;i++){
			System.out.println("�������"+i+"��ѧ�ƣ�");
			soucer[i-1]=in.next();
		}
		for(int i=1;i<=num;i++){
			int S=0;
			System.out.println("�������"+i+"ѧ��������");
			name[i-1]=in.next();
			for(int j=0;j<soucernum;j++){
				System.out.println("������"+name[i-1]+"��"+soucer[j]+"�ɼ���");
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
		System.out.print("ѧ��");
		for(int i=0;i<soucernum;i++){
			System.out.print("\t"+soucer[i]);
		}
		System.out.print("\t�ܷ�\tƽ����\t���а�");
		System.out.println();
		for(int i=0;i<num;i++){
			System.out.print(str[i]+"\t��"+(i+1)+"��");
			System.out.println();
		}
	}
}
