package june;

public class Ex75SortColors {
	
	public void sortColors(int[] nums) {
        
		int low = 0;
		int mid = 0;
		int high = nums.length -1;
		
		//i mid<=high "=" is important for example consider [2,0,1] if mid<high result will be [1,0,2]
		while(mid<=high) {
			
			if (nums[mid]== 0) {
				
				//swap
				int temp = nums[mid];
				nums[mid] = nums[low];
				nums[low] = temp;
				
			    low ++;
			    mid++;
			}
			else if (nums[mid] == 2) {
				
				//swap
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				
			    high --;
			}
			
			else {
				mid++;
			}
		}
    }

}
