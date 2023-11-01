package brocampjune;

public class LeetCOde {

	public boolean canRemoveOneElement(int[] nums) {
	    int count = 0; // Track the number of removed elements

	    for (int i = 1; i < nums.length; i++) {
	        // Check if the current element is less than or equal to the previous element
	        if (nums[i] <= nums[i - 1]) {
	            count++; // Increment the count of removed elements

	            // If more than one element needs to be removed, return false
	            if (count > 1) {
	                return false;
	            }

	            // Check if removing the current element can fix the array
	            if (i == 1 || nums[i] > nums[i - 2]) {
	                nums[i - 1] = nums[i]; // Remove the current element
	            } else {
	                nums[i] = nums[i - 1]; // Remove the previous element
	            }
	        }
	    }

	    return true;
	}

}
