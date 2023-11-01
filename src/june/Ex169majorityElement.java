package june;

public class Ex169majorityElement {

	//moore's voting algorithm
		public int majorityElement(int[] nums) {
	        
			int lead = 1;
			int leadingNum = nums[0];
			
			for (int i = 1; i < nums.length; i++) {
			
				if (nums[i]==leadingNum) {
					lead++;
				}else if (lead==0) {
					leadingNum=nums[i];
					lead++;
				}else{
					lead--;
				}
			}
			
			//it is given that majority always exist so just return leading candidate
			return leadingNum;
	    }	
}
