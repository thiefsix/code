/*关于object类中的finalize方法
 * finalize方法什么时候调用？
 * 1.每个java对象都有finalize方法
 * 2.finalize方法不需要程序员调用，由系统自动调用
 * 3.java对象如果没有个吧更多的对象指向它，则该对象成为垃圾，等待垃圾回收机器回收。
 * 垃圾回收器在回收垃圾时会自动调用finalize方法
 */
public class Test01 {
	public static void main(String[] args){
		person p=new person();
		p=null;//没有引用再指向它，成为垃圾，等待回收
		//什么都没有输出，说明程序员只能  建议  垃圾回收器回收垃圾
		System.gc();//执行垃圾回收命令
	}

}


class person{
	protected void finalize() throws Throwable {
		System.out.println("垃圾回收器回收垃圾");
	}
}