/*
 * 关于Object类中的equals方法
 * SUN提供的equals方法用于比较两个引用之间的内存地址
 * 当SUN提供的equals方法不够用时，就需要重写equals方法
 * 以下是SUN提供的equals方法源码：
 * public boolean equals(Object obj) {
        return (this == obj);
    }
 *String类重写了equals方法，用于比较对象的内容是否一致  
 */
public class Test01 {
	public static void main(String[] args){
		Object o1=new Object();
		Object o2=new Object();
		System.out.println(o1.equals(o2));//false（o1与o2的内存地址不同）
		String s1=new String();
		String s2=new String();
		System.out.println(s1.equals(s2));//ture（String类重写了equals方法，比较内容）
	}

}
