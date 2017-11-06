import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bag {
	public static void main(String[] args){
		int MAX = 1000;
		float MaxCarry = (float)((Math.random()+1)*MAX*100);//���װ����
		float MaxValue = 0;
		MaxCarry = (float)(Math.round(MaxCarry*100))/100;
		
		int n = (int)((Math.random()+1)*MAX);//����������
		float[] weight = new float[n];          //��������
		float[] value = new float[n];           //������ֵ
		
		for(int i=0;i<n;i++){               //��ʼ��
			weight[i] =(float)((Math.random()+1)*MAX);
			weight[i] = (float)(Math.round(weight[i]*100))/100;
			value[i] =(float)((Math.random()+1)*MAX);
			value[i] =(float)(Math.round(value[i]*100))/100;
		}
		
		
		System.out.println("���װ����" + MaxCarry);
		System.out.println("����������:" + n);
		for(int i=0;i<n;i++){
			System.out.println(i+" ����:" + weight[i] + "��ֵ:" + value[i]);
		}
		long start =System.currentTimeMillis();
		
		float [] vw = new float[n];       
		Map map = new HashMap ();
		for(int i=0;i<n;i++){                //����������ֵ��ֵ
			vw[i] = value[i]/weight[i];
			vw[i] = (float)(Math.round(vw[i]*100))/100;
			String s = Float.toString(vw[i]);
			map.put(s,i);
		}
		Arrays.sort(vw);                    //�����������ֵ�Ƚ�������
		
		System.out.println("װ�ط�ʽ:");
		
		int i = n-1;
		float remain = MaxCarry; //����ʣ�ฺ��
		while(remain > 0){
			String s =  Float.toString(vw[i]);
			int index = (int) map.get(s);
			if(remain >= weight[index]){
				remain = remain - weight[index];
				MaxValue += value[index];
				System.out.print("��"+index+"��:"+weight[index]+ " + ");
			}else{
				float v = remain * vw[i];
				MaxValue += v;
				System.out.println("��"+index+"��:"+remain);
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