
//自定义异常（不合法的用户名）
public class IllegalNameException extends Exception{
	//自定义异常，给出两个构造方法
	public IllegalNameException(){}
	public IllegalNameException(String msg){
		super(msg);
	}
	
}
