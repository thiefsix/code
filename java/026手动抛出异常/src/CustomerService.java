
//顾客注册
public class CustomerService {
	//注册方法
	public void register(String name)throws IllegalNameException{
		if(name.length()<6){
			//手动抛出
			IllegalNameException e=new IllegalNameException("用户名长度要大于6位");
			throw e;
			//以上两句代码可合为一句“throw new IllegalNameException("用户名长度要大于6位")”
		}
		//如果代码执行到此，则没有出现异常
		System.out.println("注册成功");
	}
}
