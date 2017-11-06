
import java.text.DecimalFormat;
public class xxxx_c4e6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("英里\t千米\t千米\t英里");
		DecimalFormat df=new DecimalFormat("#.000");
		for(int i=1;i<=10;i++){
			double num=(20+5*(i-1))/1.609;
			System.out.println(i+"\t"+i*1.609+"\t"+(20+5*(i-1))+"\t"+df.format(num));
		}
	}

}
