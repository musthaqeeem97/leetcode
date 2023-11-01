package brocampjune;

public class Ex1979FindGreatestCommonDivisorofArray {
	
public int findGCD(int[] nums) {
        
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	
	for (int i = 0; i < nums.length; i++) {
		if (max< nums[i]) {
			max = nums[i];
		}
		if (min>nums[i]) {
			min = nums[i];
		}
	}
	while (min != 0) {
        int temp = min;
        min = max % min;
        max = temp;
    }
    
    return max;
	
	
    }

}
