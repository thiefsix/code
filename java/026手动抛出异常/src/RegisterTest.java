
//Ä£Äâ×¢²á
public class RegisterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="luzon";
		CustomerService cs = new CustomerService();
		try{
			cs.register(name);
		}catch(IllegalNameException e){
			System.out.println(e.getMessage());
		}
		
	}

}
