
public class queryKth {

	public static void main(String[] args) {
		
		long starttime = System.currentTimeMillis();
		int[] nums = new int[10000];
		for(int i=0;i<nums.length;i++){
			nums[i] = (int) (Math.random()*10000);
		}
		quick_sort(nums,nums.length-1);
		
		long stoptime = System.currentTimeMillis();
		System.out.println("ºÄÊ±"+(stoptime-starttime)+"ms");
		
	}
	
	
	public static void quick_sort(int[] arrays, int lenght) {
		          if (null == arrays || lenght < 1) {
		             System.out.println("input error!");
		              return;
		          }
		          _quick_sort(arrays, 0, lenght - 1);
		    }
		 
		     public static void _quick_sort(int[] arrays, int start, int end) {
		         if(start>=end){
		             return;
		         }
		         
		         int i = start;
		         int j = end;
		         int value = arrays[i];
		         boolean flag = true;
		         while (i != j) {
		             if (flag) {
		                 if (value > arrays[j]) {
		                     swap(arrays, i, j);
		                     flag=false;
		 
		                 } else {
		                     j--;
		                 }
		             }else{
		                 if(value<arrays[i]){
		                     swap(arrays, i, j);
		                     flag=true;
		                 }else{
		                     i++;
		                 }
		             }
		         }
		         snp(arrays);
		         _quick_sort(arrays, start, j-1);
		         _quick_sort(arrays, i+1, end);
		         
		     }
		 
		     public static void snp(int[] arrays) {
		         for (int i = 0; i < arrays.length; i++) {
		             System.out.print(arrays[i] + " ");
		         }
		        System.out.println();
		     }
		 
		     private static void swap(int[] arrays, int i, int j) {
		         int temp;
		         temp = arrays[i];
		         arrays[i] = arrays[j];
		         arrays[j] = temp;
		     }
		     
		     
}