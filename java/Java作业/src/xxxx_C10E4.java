
public class xxxx_C10E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mypoint mp1=new Mypoint();
		Mypoint mp2=new Mypoint(10,30.5);
		System.out.println(Mypoint.distance(0,0,10,30.5));
	}

}

class Mypoint{
	//field
	double x;
	double y;
	//construct
	public Mypoint(){
		 x=0;
		 y=0;
	}
	public Mypoint(double x,double y){
		this.x=x;
		this.y=y;
	}
	//method
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public static double distance(){
		int dis=0;
		return dis;
	}
public static double distance(double x1,double y1,double x2,double y2){
	double dis;
	dis = Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2);
	dis=Math.sqrt(dis);
	return dis;
	}
}
