
public class QueryX {

	public static void main(String[] args) {
		long starttime = System.nanoTime();
		int x = (int) (Math.random()*1000000);
		System.out.println("X="+x);
		int[] nums = new int[1000000];
		for(int i=0;i<nums.length;i++){
			nums[i] = (int) (Math.random()*1000000);
		}
		nums.toString();
		int[] num = sort(nums, 0, nums.length-1);
		int n = queryX(num,x,0,num.length-1);
		long stoptime = System.nanoTime();
		if(n==1)
			System.out.println("数组中无此元素");
		else
			System.out.println(n);
		System.out.println("耗时"+(stoptime-starttime)+"ns");
	}
	
	
	
	public static int[] sort(int[] nums, int low, int high) {  
        int mid = (low + high) / 2;  
        if (low < high) {  
            // 左边  
            sort(nums, low, mid);  
            // 右边  
            sort(nums, mid + 1, high);  
            // 左右归并  
            merge(nums, low, mid, high);  
        }  
        return nums;  
    }  
  
    public static void merge(int[] nums, int low, int mid, int high) {  
        int[] temp = new int[high - low + 1];  
        int i = low;// 左指针  
        int j = mid + 1;// 右指针  
        int k = 0;  
  
        // 把较小的数先移到新数组中  
        while (i <= mid && j <= high) {  
            if (nums[i] < nums[j]) {  
                temp[k++] = nums[i++];  
            } else {  
                temp[k++] = nums[j++];  
            }  
        }  
  
        // 把左边剩余的数移入数组  
        while (i <= mid) {  
            temp[k++] = nums[i++];  
        }  
  
        // 把右边边剩余的数移入数组  
        while (j <= high) {  
            temp[k++] = nums[j++];  
        }  
  
        // 把新数组中的数覆盖nums数组  
        for (int k2 = 0; k2 < temp.length; k2++) {  
            nums[k2 + low] = temp[k2];  
        }  
    }  
	
	
	
	
public static int queryX(int[] arr, int d, int low, int high){
		if(low<=high)
			if(d==(low+high)/2)
				return (low+high)/2;
			else 
				if(d<=(low+high)/2)
					return queryX(arr, d, low, ((low+high)/2)-1);
				else
					return queryX(arr, d, ((low+high)/2)+1, high);
		
		
		
		return 1;
	}

}


