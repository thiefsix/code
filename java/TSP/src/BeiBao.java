import java.util.Collections;  
import java.util.LinkedList;  
  
class WuPin implements Comparable  
{  
    @Override  
    public String toString()  
    {  
        return "WuPin [weight=" + weight + ", value=" + value + "]";  
    }  
    private int weight;  
    private int value;  
    public WuPin(int weight, int value) {  
        super();  
        this.weight = weight;  
        this.value = value;  
    }  
    public int getValue() {  
        return value;  
    }  
    public int getWeight() {  
        return weight;  
    }  
    @Override  
    public int compareTo(Object o)  
    {  
        WuPin obj =(WuPin)o;  
        return this.weight>obj.getWeight()?1:(this.weight==obj.getWeight()?0:-1);  
    }  
      
}  
  
public class BeiBao {  
    public static void main(String[] args)  
    {  
        LinkedList<WuPin> wuPinList = new LinkedList<WuPin>();  
        wuPinList.add(new WuPin(2,6));  
        wuPinList.add(new WuPin(2,3));  
        wuPinList.add(new WuPin(6,5));  
        wuPinList.add(new WuPin(5,4));  
        wuPinList.add(new WuPin(4,6));  
        final int N = 6;//�����м�����Ʒ  
        LinkedList p = new LinkedList();  
        p.add(new WuPin(0,0));//��ӵ�һ��Ϊ���ֵ  
        for(int i =4;i>=0;i--)  
        {  
            jisuan(p,wuPinList.get(i));  
            System.out.println("p"+(i+1));  
            for(int ii = 0;ii<p.size();ii++)  
                System.out.println((WuPin)p.get(ii));  
        }  
    }  
    //�������������Ʒ  
    private static void jisuan(LinkedList p, WuPin pin) {  
        LinkedList q = new LinkedList();  
        //����õ�q ��p��ÿһ�����w  
        for(int i = 0;i<p.size();i++)  
        {  
            q.add(new WuPin(((WuPin)p.get(i)).getWeight()+pin.getWeight(),((WuPin)p.get(i)).getValue()+pin.getValue()));  
        }  
//      System.out.println("�õ���q");  
//      for(int i = 0;i<q.size();i++)  
//          System.out.println((WuPin)q.get(i));  
        //��p n-1 ����p n ��q n�ϲ�  
        for(int m = 0;m<q.size();m++)  
        {  
            p.add((WuPin)q.get(m));  
        }  
        Collections.sort(p);//�������е���Ʒ������������  
//      System.out.println("p��q�ϲ�֮���p");  
//      for(int i = 0;i<p.size();i++)  
//          System.out.println((WuPin)p.get(i));  
        //ȥ����Ծ��  
        for(int m = 0;m<p.size();m++)  
        {  
            //��������valueС��ǰ�� ɾ��  
//          System.out.println("dijici"+m);  
//          for(int i = 0;i<p.size();i++)  
//              System.out.println((WuPin)p.get(m));  
            if(m+1<=p.size()-1)  
                if(((WuPin)p.get(m)).getValue()>=((WuPin)p.get(m+1)).getValue())  
                {  
                    p.remove(m+1);  
                    m=0;  
                }  
            if(((WuPin)p.get(m)).getWeight()>10)  
            {  
                p.remove(m);  
                m=0;  
            }  
        }     
    }  
}  