package com.wu.os;

import java.util.Scanner;

public class StoreManage {
	
	class S {//自定义的 lru栈
		private int[] n;
		private int length;
		private int p;//栈顶指针
		
		void pop(){//元素出栈
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
		
		boolean same(int e){//对相同元素的处理
			for(int i=0;i<length;i++){
				if(n[i] == e){//如果找到相同页，就对s内元素位置进行调整
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
		
		void adjust(){//调整页面位置，将栈底元素置顶
			for(int j=length-1;j>0;j--){
				int temp = n[(j-1)%(length-1)];
				n[(j-1)%(length-1)] = n[j];
				n[j] = temp;
			}
		}
		
		void push(int e){//元素进栈
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
	public static double hit;                //命中次数
	
	public static void main(String[] args){
		int[] page = {7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,7,0,1};//默认页号序列
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入页号序列:(eg. 70120.... 或者使用默认页号序列输入d)");
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
		
		System.out.println("请输入采用的算法:(fifo选1，lru选2)");
	    int type = in.nextInt();
	    System.out.println("请输入内存容量:(3 or 4)");
	    int memory = in.nextInt();
	    
	    p = new int[memory];
	    for(int i=0;i<memory;i++){
	    	p[i] = MAX;
	    }
	    
	    in.close();
	    
	    if(type == 1){//fifo算法
	        int i = 0;
	        int k = 0;
	        
	        while(i < LENGTH ){
	        	System.out.print(page[i] + "   ");
	            if(!find(page[i],p,memory)){//如果内存中没查到该页号就淘汰最开始进入内存的
	               p[k] = page[i]; 
	               k = (k+1)%memory;
	            }
	            
	            printP(memory,k);
	            i++;
	        }
	        double percent = (double)(hit/LENGTH) * 100;
	        System.out.print("fifo算法命中率为：");
	        System.out.printf("%4.2f%%",percent);
	    }
	    else if(type == 2){//lru算法
	    		int i = 0;
	    		
	    		StoreManage o = new StoreManage();
				StoreManage.S s = o .new S(memory);
//				hit++;
				while(i < LENGTH){
					System.out.print(page[i] + "   ");
					if(s.isFull()){//s已满
						if(!s.find(page[i])){//s中不存在所寻找的页
							//hit --;
							s.adjust();//将最少使用页面调整至栈顶
							s.pop();  //将s中最少使用页面淘汰
						}else{                //s中存在将要使用的界面
							
							s.same(page[i]);//调整s中位置
						}
					}//s未满就将元素进栈
					s.push(page[i]);
					
					i++;
					s.print();
			   }
				double percent = (double)(hit/LENGTH) * 100;
		        System.out.print("lru算法命中率为：");
		        System.out.printf("%4.2f%%",percent);		
	    	}else{
	            System.out.println("算法选择错误");
	        }
	}
	
	
	public static boolean find(int page,int[] p,int m){//page需要查找的页号，p数组，m内存容量
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

