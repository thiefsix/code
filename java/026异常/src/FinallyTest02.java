
public class FinallyTest02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=m1();
		System.out.println(i);//i=10;
	}
	public static int m1(){
		int i=10;
		try{
			//此处实际是新建了一个临时变量，将i的值赋予这个临时变量，并返回此临时变量的值
			//并没有真正返回i的值，所以main方法中输出的i的值为10；
			return i;
		}finally{
			i++;
			System.out.println("m1方法的i="+i);
		}
	}

}
