
public class Test02 {
	public static void main(String[] args){
		//新建引擎
		Engine e1=new YAMAHA();
		Engine e2=new HONGDA();
		//新建汽车
		Car c=new Car(e1);
		c.testEngine();
		Car c1=new Car(e2);
		c1.testEngine();
	}

}
