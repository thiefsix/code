
public class HundredHen2   
{  
    public static void main(String[] args)   
    {  
    	long startTime = System.currentTimeMillis();
        //��������  
        for(int cock = 0;cock<= 1999;cock++)  
        {  
            //ĸ������  
            for(int hen=0;hen<=1999;hen++)  
            {  
                //С������  
                for(int chicks = 0;chicks <=1999;chicks++){
                	 if((cock*5 + hen*3 + chicks/3 == 2000) && chicks%3 == 0)  
                     {  
                         System.out.println("������ֻ����" + cock + "  " + "ĸ����ֻ����" + hen + "  " + "С����ֻ����" + chicks);  
                     }
                }
               
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time:"+(endTime-startTime)+"ms");
    }
  
}  