import java.util.*;
public class sum {
	public static void main(String args[]){
		int sum=0;
		int monthday=0;
		System.out.println("请输入年份");
		Scanner in=new Scanner(System.in);
		int y=in.nextInt();
		for(int year=1900;year<y;year++){
			if(year%4==0&&year%100!=0||year%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		System.out.println("请输入月份");
		Scanner in1=new Scanner(System.in);
		int m=in1.nextInt();
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
			monthday=31;
		}else if(y%4==0&&y%100!=0||y%400==0&&m==2){
			monthday=29;
		}else if(m==4||m==6||m==9||m==11){
			monthday=30;
		}else{
			monthday=28;
		}
		for(int month=1;month<m;month++){
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
				sum+=31;
			}else if(y%4==0&&y%100!=0||y%400==0&&month==2){
				sum+=29;
			}else if(month==4||month==6||month==9||month==11){
				sum+=30;
			}else{
				sum+=28;
			}
		}
		sum+=1;
		int weekday=sum%7;
		System.out.print("日\t一\t二\t三\t四\t五\t六\n");
		for(int i=1;i<=weekday;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=monthday;i++){
			if(sum%7==6){
				System.out.print(i+"\n");
				sum++;
			}else{
				System.out.print(i+"\t");
				sum++;
			}
		}
	}

}
