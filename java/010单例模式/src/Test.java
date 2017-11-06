
/*
 单例模式是23种设计模式中最简单的一种
 目的：为了保证JVM中某种类型的java对象永远只有一个（为了节省内存开销）
 实现单例模式：
 		1.构造方法私有化
 		2.对外提供公开的静态的获取当前对象的方法
 		3.提供一个当前对象的静态变量
 单例模式分类
 		饿汉模式：在类加载的时候创建对象
 		懒汉模式：用到对象的时候才会创建对象
 单例模式最大的缺点：单例模式的类无法被继承（原因见“super关键字”）
 */
public class Test {
	public static void main(String[] args){
	singleton s1=singleton.getInstance();
	singleton s2=singleton.getInstance();
	singleton s3=singleton.getInstance();
	System.out.println(s1==s2);//ture, s1与s2的内存地址相同
	System.out.println(s2==s3);//ture, s2与s3的内存地址相同

}

}
class singleton{
	//静态变量
	private static singleton s;
	//构造方法私有化
	private singleton(){}
	//公开的静态的获取当前对象的方法
	public static singleton getInstance(){
		if(s==null){
			s=new singleton();
		}
		return s;
	}
}