package may;

public class Ex34FindFirstLastPositionOfElement {

	public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        
        int[] result = {left,right};
        
        return result; 
		
    }
	
	public int binarySearch(int[] nums,int target,boolean findLeft) {
		
		int l = 0;
		int r = nums.length - 1;
		int index=-1;
		while(l<=r) {
			int mid = (l+r)/2;
			if (target<nums[mid]) {
				r=mid-1;
			}
			else if (target>nums[mid]) {
				l = mid +1;
			}else {
				index = mid;  
				if (findLeft) {
					r= mid-1;
				}else {
					l = mid+1;
				}
			}
		}return index;
	}
}
