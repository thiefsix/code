package com.wu.os;

import java.util.Scanner;

public class StoreManage {
	
	class S {//�Զ���� lruջ
		private int[] n;
		private int length;
		private int p;//ջ��ָ��
		
		void pop(){//Ԫ�س�ջ
			n[p] = MAX;
			p++;
		}
		
		boolean find(int e){
			for(int i=0;i<length;i++){
				if(n[i] == e)
					return true;
			}
			return false;
		}
		
		boolean same(int e){//����ͬԪ�صĴ���
			for(int i=0;i<length;i++){
				if(n[i] == e){//����ҵ���ͬҳ���Ͷ�s��Ԫ��λ�ý��е���
					for(int j=i;j>0;j--){
						int temp = n[(j-1)%(length-1)];
						n[(j-1)%(length-1)] = n[j];
						n[j] = temp;
					}
					return true;
				}
			}
			return false;
		}
		
		void adjust(){//����ҳ��λ�ã���ջ��Ԫ���ö�
			for(int j=length-1;j>0;j--){
				int temp = n[(j-1)%(length-1)];
				n[(j-1)%(length-1)] = n[j];
				n[j] = temp;
			}
		}
		
		void push(int e){//Ԫ�ؽ�ջ
			if(!isFull()){
				p--;
				hit--;
				n[p] = e; 
				
			}
		}
		
		void print(){
			for(int i=0;i<length;i++){
				if(n[i]!=MAX){
					System.out.print(n[i]);
				}
			}
			System.out.println();
		}
		
		boolean isFull(){
			for(int i=0;i<length;i++){
				if(n[i] == MAX) return false;
			}
			return true;
		}
		
		public S(int m){
			length = m;
			p = length;
			n = new int[length];
			for(int i=0;i<length;i++){
				n[i] = MAX;
			}
		}
		
	}
	public static int MAX = Integer.MAX_VALUE;
	public static int[] p ;
	public static int LENGTH;
	public static double hit;                //���д���
	
	public static void main(String[] args){
		int[] page = {7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,7,0,1};//Ĭ��ҳ������
		
		Scanner in = new Scanner(System.in);
		System.out.println("������ҳ������:(eg. 70120.... ����ʹ��Ĭ��ҳ����������d)");
		String pages = in.nextLine();
		if(!pages.equals("d")){
			page = new int[pages.length() -1];
			LENGTH = pages.length();
			hit = LENGTH;
			for(int i=0;i<LENGTH - 1 ;i++){
				page[i] = pages.charAt(i) - 48;
			}
		}else{
			
			LENGTH = 20;
			hit = LENGTH;
		}
		
		System.out.println("��������õ��㷨:(fifoѡ1��lruѡ2)");
	    int type = in.nextInt();
	    System.out.println("�������ڴ�����:(3 or 4)");
	    int memory = in.nextInt();
	    
	    p = new int[memory];
	    for(int i=0;i<memory;i++){
	    	p[i] = MAX;
	    }
	    
	    in.close();
	    
	    if(type == 1){//fifo�㷨
	        int i = 0;
	        int k = 0;
	        
	        while(i < LENGTH ){
	        	System.out.print(page[i] + "   ");
	            if(!find(page[i],p,memory)){//����ڴ���û�鵽��ҳ�ž���̭�ʼ�����ڴ��
	               p[k] = page[i]; 
	               k = (k+1)%memory;
	            }
	            
	            printP(memory,k);
	            i++;
	        }
	        double percent = (double)(hit/LENGTH) * 100;
	        System.out.print("fifo�㷨������Ϊ��");
	        System.out.printf("%4.2f%%",percent);
	    }
	    else if(type == 2){//lru�㷨
	    		int i = 0;
	    		
	    		StoreManage o = new StoreManage();
				StoreManage.S s = o .new S(memory);
//				hit++;
				while(i < LENGTH){
					System.out.print(page[i] + "   ");
					if(s.isFull()){//s����
						if(!s.find(page[i])){//s�в�������Ѱ�ҵ�ҳ
							//hit --;
							s.adjust();//������ʹ��ҳ�������ջ��
							s.pop();  //��s������ʹ��ҳ����̭
						}else{                //s�д��ڽ�Ҫʹ�õĽ���
							
							s.same(page[i]);//����s��λ��
						}
					}//sδ���ͽ�Ԫ�ؽ�ջ
					s.push(page[i]);
					
					i++;
					s.print();
			   }
				double percent = (double)(hit/LENGTH) * 100;
		        System.out.print("lru�㷨������Ϊ��");
		        System.out.printf("%4.2f%%",percent);		
	    	}else{
	            System.out.println("�㷨ѡ�����");
	        }
	}
	
	
	public static boolean find(int page,int[] p,int m){//page��Ҫ���ҵ�ҳ�ţ�p���飬m�ڴ�����
	    for(int i=0;i<m;i++){
	        if(p[i] == page) return true;
	    }
	    hit --;
	    return false;
	}

	public static void printP(int m,int k){
	    for(int i=0;i<m;i++){
	    	if(p[i]!=MAX) System.out.print(p[i]);
	    }
	    System.out.println(" k->"+p[k]);
	     
	}
	
	public static boolean isPFull(int m){
		int i = 0;
		while(i < m){
			if(p[i]==MAX) return false;
		}
		return true;
	}
}

