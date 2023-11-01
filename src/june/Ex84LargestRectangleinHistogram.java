package june;

import java.util.Arrays;
import java.util.Stack;

public class Ex84LargestRectangleinHistogram {

	//brute force approach
	public int largestRectangleArea(int[] heights) {
        
		
		int left[] = new int[heights.length];
		int right[] = new int[heights.length];
		
		left[0] = -1;
		right[heights.length-1] = heights.length;
		
		for (int i = 1; i < right.length; i++) {
			
			int prev = i-1;
			while (prev>=0 && heights[prev] >= heights[i] ) {
				prev = left[prev];
			}
			left[i] = prev;
		}
		
		for (int i = heights.length-2; i >= 0; i--) {
			int next = i+1;
			//while height of the next histogram is  >= height of the current histogram 
			while (next<heights.length && heights[next]>=heights[i]) {
				
				//next histogram is the right boundry of the next histogram; 
				next = right[next];
			}
			right[i] = next;
		}
		
		
	    int maxArea = 0;
		
		for (int i = 0; i < heights.length; i++) {
			
			int width = right[i]-left[i]-1;
			maxArea = Math.max(maxArea, width*heights[i]);
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		
		
		return maxArea;
    }
	    //using stack
		public int largestRectangleArea2(int[] heights) {
        
			int n = heights.length;
			int maxArea = 0;
			Stack<Integer> stack = new Stack<>(); 
		
		for (int i = 0; i <= n; i++) {
			
			int currentHeight= i==n?0:heights[i];
			
			while(!stack.isEmpty() && currentHeight<heights[stack.peek()]) {
				
				
					int top = stack.pop();
					int area = stack.isEmpty()?heights[top]*i:heights[top]*(i-stack.peek()-1);
					maxArea =Math.max(maxArea, area);
				
			}
			stack.push(i);
			
		}
		return maxArea;
    }
	public static void main(String[] args) {
		
		Ex84LargestRectangleinHistogram ex = new Ex84LargestRectangleinHistogram();
		
		int[] nums = {2,1,5,6,2,3};
		
		System.out.println(ex.largestRectangleArea2(nums));
	}
}
