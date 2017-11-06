import java.util.ArrayList;
import java.util.Scanner;

public class Kruskal {
 
 
 /*
  * Max:���嶥����������ֵ
  * edge:����edge���洢�����Edge����
  * target:����trget,�洢���յõ������Edge����
  * parent:�洢������Ϣ������
  * n:������
  */
 int Max=100;
 ArrayList<Edge>edge=new ArrayList<Edge>();
 ArrayList<Edge>target=new ArrayList<Edge>();
 int[] parent=new int[Max];
 Float TheMax=Float.MAX_VALUE;
 int n;
 
 public void init(){
  /**
   * p:��ʼ����
   * q:��������
   * w:�ߵ�Ȩֵ
   * n:�������
   */
  Scanner scan =new Scanner(System.in);
  int p,q;
  double w;
  System.out.println("��������ĸ���:");
  n=scan.nextInt();
  System.out.println("����'A,B,C'�ĸ�ʽ�������ߵ���Ϣ,ABC�ֱ����ߵ���ʼ���㣬�������㣬Ȩֵ(����-1 -1 -1��������):");
  while(true){
   p=scan.nextInt();
   q=scan.nextInt();
   w=scan.nextDouble();
   if(p<0||q<0||w<0)break;
   Edge e=new Edge();
   e.start=p;
   e.end=q;
   e.weight=w;
   edge.add(e);
  }
  for(int i=1;i<=n;++i){          //��ʼ���ߵ���Ϣ����
   parent[i]=i;
  }
 }
 
 /*
  * ����ϲ�������һ����Ľ�������Ϊ��һ�������ʼ��
  */
 public void union(int j,int k){
  for(int i=1;i<=n;++i){
   if(parent[i]==j)
    parent[i]=k;
  }
 }
 
 public void kruskal(){
  int i=0;                 //����
  while(i<n-1&&edge.size()>0){       //���ֻ��һ���߻���û�б�����
   double min=Double.MAX_VALUE;
   Edge temp=null; 
   for(int j=0;j<edge.size();++j){      //����ͼ��
    Edge tt=edge.get(j);
    if(tt.weight<min){           //������������Ȩֵ��������
    min=tt.weight;     
    temp=tt;
    }
  }
  
  //����һ����
  int jj=parent[temp.start];
  int kk=parent[temp.end];
  
  
  if(jj!=kk){
   ++i;                 //��end��Ϊ��һ���ߵ�start,Ѱ����һ����
   target.add(temp);           //���ҵ��ı߷���Ŀ�꼯����
   union(jj,kk);             
  }
  edge.remove(temp);           //����ʱ��ɾ��
  }
  System.out.println("��С��������·����:");
  for(int k=0;k<target.size();++k){     //�����С������
   Edge e=target.get(k);
   System.out.println(e.start+"-->"+e.end);
  }
 }
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
   Kruskal kr=new  Kruskal();
   kr.init();
   kr.kruskal();
 }
}
/*
 * start:��ʼ����
 * end:��������
 * weight:Ȩֵ
 */
class Edge{
 public int start;
 public int end;
 public double weight;
}