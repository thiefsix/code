import javafx.scene.shape.Circle;

public class xxxx_C14E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparableCircle c1 = new ComparableCircle(5);
		ComparableCircle c2 = new ComparableCircle(6);
		System.out.println("The larger one is "+c1.compareTo(c2));
		
	}

}

class ComparableCircle extends Circle implements Comparable{
	public ComparableCircle(double radius){
		setRadius(radius);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	};
	public ComparableCircle compareTo(ComparableCircle c){
		if(this.getRadius()>=c.getRadius())
			return this;
		else
			return c;
	}
}
