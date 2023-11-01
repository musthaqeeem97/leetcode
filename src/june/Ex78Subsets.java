package june;

import java.util.ArrayList;
import java.util.List;


public class Ex78Subsets {

	
	public List<List<Integer>> subsets(int[] nums) {
        
		List<List<Integer>> resultList = new ArrayList<>();
		backtrack(nums,resultList,new ArrayList<>(),0);
		return resultList;
		
    }

	private void backtrack(int[] nums, List<List<Integer>> resultList, List<Integer> tempSubSet, int start) {
		
		
		resultList.add(new ArrayList<>(tempSubSet));
		for (int i = start; i < nums.length; i++) {
			
			tempSubSet.add(nums[i]);
			backtrack(nums, resultList, tempSubSet, i+1);
			tempSubSet.remove(tempSubSet.size()-1);
		}
		
	}
	public static void main(String[] args) {
		Ex78Subsets subsets = new Ex78Subsets();
		int[]nums = {1,2,3};
		System.out.println(subsets.subsets(nums));
	}
}
