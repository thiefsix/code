import java.util.List;

/*
 * 合成关系：合成关系和聚合关系差不多，但合成关系的整体与部分之间的关联程度要强
 * 比如，人和人的四肢的关系，人的四肢只能接在人的身上
 * 整体的生命周期决定部分的生命周期
 */
public class HeCheng {

}

class Man{
	List<Hand> h;
}

class Hand{
	
}