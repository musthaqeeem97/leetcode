package brocampjune;



public class Ex1464MaximumProductofTwoElementsinanArray {
	
	public static int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;  // Maximum element
        int max2 = Integer.MIN_VALUE;  // Second maximum element
        
        for (int num : nums) {
            if (num >= max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        
        return (max1 - 1) * (max2 - 1);
    }
}
