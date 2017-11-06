/*
 *关联关系：在本类中含有其他类的引用，则这两个类之间是关联关系
 */
public class GuanLian {
	String name;
	int age;
	Friend f;//-->引用f保存Friend类的地址，可以在GuanLian类中访问Friend中的数据
}	
	
class Friend{
	String name;
	int age;
	String tel;
	
} 
//以上两个来是关联关系