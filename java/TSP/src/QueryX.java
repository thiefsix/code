
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
			System.out.println("�������޴�Ԫ��");
		else
			System.out.println(n);
		System.out.println("��ʱ"+(stoptime-starttime)+"ns");
	}
	
	
	
	public static int[] sort(int[] nums, int low, int high) {  
        int mid = (low + high) / 2;  
        if (low < high) {  
            // ���  
            sort(nums, low, mid);  
            // �ұ�  
            sort(nums, mid + 1, high);  
            // ���ҹ鲢  
            merge(nums, low, mid, high);  
        }  
        return nums;  
    }  
  
    public static void merge(int[] nums, int low, int mid, int high) {  
        int[] temp = new int[high - low + 1];  
        int i = low;// ��ָ��  
        int j = mid + 1;// ��ָ��  
        int k = 0;  
  
        // �ѽ�С�������Ƶ���������  
        while (i <= mid && j <= high) {  
            if (nums[i] < nums[j]) {  
                temp[k++] = nums[i++];  
            } else {  
                temp[k++] = nums[j++];  
            }  
        }  
  
        // �����ʣ�������������  
        while (i <= mid) {  
            temp[k++] = nums[i++];  
        }  
  
        // ���ұ߱�ʣ�������������  
        while (j <= high) {  
            temp[k++] = nums[j++];  
        }  
  
        // ���������е�������nums����  
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


