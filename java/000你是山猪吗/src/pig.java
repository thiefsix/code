import java.util.*;
public class pig {
	public static void main(String args[]){
		for(;;){
		System.out.println("你是山猪吗？");
		Scanner in=new Scanner(System.in);
		String answer=in.next();
		if(answer.equals("不是")){
			System.out.println("是吗？");
		}else{
			System.out.println("You are right!");
			break;
		}
		}
	}

}
