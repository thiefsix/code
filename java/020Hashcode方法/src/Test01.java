/*
 *关于object类中的hashcode方法
 *    返回当前对象的哈希码值
 *    java对象的内存地址经过哈希算法得出的int类型的数值--哈希码值
 */
public class Test01 {
	public static void main(String[] args){
		Test01 t=new Test01();
		System.out.println(t.hashCode());//705927765
	}

}
