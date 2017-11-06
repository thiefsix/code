
public class Car {
	//新建一个引擎
	Engine e;
	
	//构造方法
	Car(Engine e){
		this.e=e;
	}
	//测试引擎
	public void testEngine(){
		e.working();
	}
	

}
