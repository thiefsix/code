
public class HundredHen   
{  
    public static void main(String[] args)   
    {  
    	long startTime = System.currentTimeMillis();
        //公鸡数量  
        for(int cock = 0;cock<= 399;cock++)  
        {  
            //母鸡数量  
            for(int hen=0;hen<= 666;hen++)  
            {  
                //小鸡数量  
                int chicks = 100 - cock - hen;  
                if((cock*5 + hen*3 + chicks/3 == 2000) && chicks%3 == 0)  
                {  
                    System.out.println("公鸡的只数：" + cock + "  " + "母鸡的只数：" + hen + "  " + "小鸡的只数：" + chicks);  
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time:"+(endTime-startTime)+"ms");
    }
  
}  