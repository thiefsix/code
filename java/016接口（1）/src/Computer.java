
public class Computer {
	public static void main(String[] args){
		//新建内存
		Engine e1=new Kingston();
		//新建主板
		Asua a=new Asua(e1);
		//调用测试方法
		a.testEngine();
		//换SanDisk
		a.e =new Sandisk();
		a.testEngine();
	}
	
}
