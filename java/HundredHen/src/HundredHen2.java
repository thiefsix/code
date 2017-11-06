
public class HundredHen2   
{  
    public static void main(String[] args)   
    {  
    	long startTime = System.currentTimeMillis();
        //公鸡数量  
        for(int cock = 0;cock<= 1999;cock++)  
        {  
            //母鸡数量  
            for(int hen=0;hen<=1999;hen++)  
            {  
                //小鸡数量  
                for(int chicks = 0;chicks <=1999;chicks++){
                	 if((cock*5 + hen*3 + chicks/3 == 2000) && chicks%3 == 0)  
                     {  
                         System.out.println("公鸡的只数：" + cock + "  " + "母鸡的只数：" + hen + "  " + "小鸡的只数：" + chicks);  
                     }
                }
               
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time:"+(endTime-startTime)+"ms");
    }
  
}  