package june;

public class Ex215KthLargestElementinanArray {

	public int findKthLargest(int[] nums, int k) {
        
		k = nums.length - k;
		int pivotIndex = nums.length-1;
		int pointer = 0;
		
		quickSelect(nums,pointer,pivotIndex,k);
		return k;
    }

	private void quickSelect(int[] nums, int pointer, int pivotIndex, int k) {
		
		for (int i = pointer; i <pivotIndex-1 ; i++) {
			
			if (nums[i]<= nums[pivotIndex]) {
				//swap 
				swap(nums, pointer, i);
			}
		}
		swap(nums,pointer, pivotIndex);
		
		if (k<pivotIndex) {
			
			quickSelect(nums, 0, pointer-1, k);
		}
		else if (k>pivotIndex) {
			
			quickSelect(nums, pointer+1, pivotIndex, k);
		}
		
	}
	
	public void swap(int[]nums,int i, int j) {
	
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
