package june;

import java.util.Arrays;


public class Ex31NextPermutation {
	
	 public void nextPermutation(int[] nums) {
	        
		    int i = nums.length -2;
		    while (i>=0 && nums[i]>=nums[i+1]) {
				i--;
			}
		    
		    System.out.println(nums[i]);
		    if (i>=0) {
				
				int j = nums.length-1;
				
				while(nums[j]<=nums[i]) {//when[nums[i]=nums[j] also loops execute 
					j--;
				}
				
				System.out.println(nums[j]);
				//swap 
				swap(nums, i, j);
			    
				
				
				}
				
		    //reverse
			int start = i+1;
			int end = nums.length-1;
			while (start<end) {
				swap(nums, start, end);
				start++;
				end--;
			}
		}
		    
	    
	 	public void swap(int[] nums, int i ,int j) {
	 		int temp = nums[i];
			nums[i] = nums[j];
			nums[j]= temp;
	    }
	 	
	 	 public static void main(String[] args) {
	         int[] arr = {1, 2, 3,6,4,3,1};
	         Ex31NextPermutation permutation = new Ex31NextPermutation();
	         permutation.nextPermutation(arr);
	         System.out.println(Arrays.toString(arr));  // Output: [1, 3, 2]
	     }
}
