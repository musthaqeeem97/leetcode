package june;

import java.util.ArrayDeque;
import java.util.Deque;


public class Ex239SlidingWindowMaximum {

	public int[] maxSlidingWindow(int[] nums, int k) {
     
	
		int[] result = new int[nums.length-k+1];
		Deque<Integer> deque = new ArrayDeque<>();
		
		for (int i = 0; i < nums.length; i++) {
			
			//deque here is strictly decreasing so if nums[i] that is added
			//to the last of deque is greater than the nums[last element in deque]
			// the last elelement need to be polled out
			while (!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]) {
				deque.pollLast();
			}
			//removing index at at the start of deque which is out of 
			//range of the current sliding window.
			while (!deque.isEmpty()&&deque.peekFirst()<i-k+1) {
				deque.pollFirst();
			}
			
			deque.offerLast(i);
			
			if (i>=k-1) {
				result[i-k+1] = nums[deque.peekFirst()];
			}
			
			
		}
	
		return result;
    }

	
}
