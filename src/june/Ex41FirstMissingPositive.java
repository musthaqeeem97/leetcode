package june;

import java.util.HashMap;
import java.util.Map;

public class Ex41FirstMissingPositive {

	
	   //using hash table
	   public int firstMissingPositive2(int[] nums) {
	        int n = nums.length;
	        
	        // Step 1: Create a hash table to track the presence of positive integers
	        Map<Integer, Boolean> map = new HashMap<>();
	        for (int num : nums) {
	            if (num > 0) {
	                map.put(num, true);
	            }
	        }
	        
	        // Step 2: Find the first missing positive integer
	        for (int i = 1; i <= n; i++) {
	            if (!map.containsKey(i)) {
	                return i;
	            }
	        }
	        
	        // Step 3: If all positive integers from 1 to n are present, return n + 1
	        return n + 1;
	    }
	
	
	//using array
	  public int firstMissingPositive(int[] nums) {
	        int n = nums.length;
	        
	        // Step 1: Move all positive integers to their corresponding positions
	        for (int i = 0; i < n; i++) {
	            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
	            	int temp = nums[i];
	            	nums[i] = nums[temp - 1];
	            	nums[temp - 1] = temp;
	            }
	        }
	        
	        // Step 2: Find the first missing positive integer
	        for (int i = 0; i < n; i++) {
	            if (nums[i] != i + 1) {
	                return i + 1;
	            }
	        }
	        
	        // Step 3: If all positive integers from 1 to n are present, return n + 1
	        return n + 1;
	    }
	
}

/*

in this problem

if we swap like this there could be error
int temp = nums[i];
nums[i] = nums[nums[i] - 1];
nums[nums[i] - 1] = temp;
The issue lies in the second line where nums[i] is being accessed before the swapping operation. This leads to incorrect behavior and results in the wrong swapping of values.

To correct the code, we need to store the value nums[i] in a temporary variable before accessing nums[nums[i] - 1]. Here's the corrected swapping logic:

java
Copy code
int temp = nums[i];
nums[i] = nums[temp - 1];
nums[temp - 1] = temp;
By using temp instead of nums[i] in the last line, we ensure that the correct value is accessed and swapped.

With this correction, the swapping logic will work properly, ensuring that positive integers are moved to their correct positions in the array.





Regenerate response
*/