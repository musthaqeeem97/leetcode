package brocampjune;

import java.util.HashMap;

public class Ex219ContainsDuplicate {

	 public boolean containsNearbyDuplicate(int[] nums, int k) {
	
	         HashMap<Integer, Integer> map = new HashMap<>();
	    	 
	         for (int i = 0; i < nums.length; i++) {
				
	        	 if (map.containsKey(nums[i])) {
					
	        		 if (Math.abs(map.get(nums[i])- i)<=k) {
						return true;
			
				}
	        		
			}
	        	 map.put(nums[i], i);
	    }
		
		
	     return false;
	 }
}
