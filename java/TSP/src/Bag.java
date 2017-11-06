import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bag {
	public static void main(String[] args){
		int MAX = 1000;
		float MaxCarry = (float)((Math.random()+1)*MAX*100);//最大装载量
		float MaxValue = 0;
		MaxCarry = (float)(Math.round(MaxCarry*100))/100;
		
		int n = (int)((Math.random()+1)*MAX);//背包种类数
		float[] weight = new float[n];          //背包重量
		float[] value = new float[n];           //背包价值
		
		for(int i=0;i<n;i++){               //初始化
			weight[i] =(float)((Math.random()+1)*MAX);
			weight[i] = (float)(Math.round(weight[i]*100))/100;
			value[i] =(float)((Math.random()+1)*MAX);
			value[i] =(float)(Math.round(value[i]*100))/100;
		}
		
		
		System.out.println("最大装载量" + MaxCarry);
		System.out.println("背包种类数:" + n);
		for(int i=0;i<n;i++){
			System.out.println(i+" 重量:" + weight[i] + "价值:" + value[i]);
		}
		long start =System.currentTimeMillis();
		
		float [] vw = new float[n];       
		Map map = new HashMap ();
		for(int i=0;i<n;i++){                //计算重量价值比值
			vw[i] = value[i]/weight[i];
			vw[i] = (float)(Math.round(vw[i]*100))/100;
			String s = Float.toString(vw[i]);
			map.put(s,i);
		}
		Arrays.sort(vw);                    //升序对重量价值比进行排序
		
		System.out.println("装载方式:");
		
		int i = n-1;
		float remain = MaxCarry; //背包剩余负重
		while(remain > 0){
			String s =  Float.toString(vw[i]);
			int index = (int) map.get(s);
			if(remain >= weight[index]){
				remain = remain - weight[index];
				MaxValue += value[index];
				System.out.print("第"+index+"种:"+weight[index]+ " + ");
			}else{
				float v = remain * vw[i];
				MaxValue += v;
				System.out.println("第"+index+"种:"+remain);
				remain =0;
			}
			i--;
		}
		System.out.println("MaxValue:" + MaxValue);
		
		long end = System.currentTimeMillis();
		long cost = end -start;
		System.out.println("cost:" + cost + "ms");
	}
}