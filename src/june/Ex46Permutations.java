package june;

import java.util.ArrayList;
import java.util.List;


public class Ex46Permutations {
  
	  public List<List<Integer>> permute(int[] nums) {
		  List<List<Integer>> result = new ArrayList<>();
		  backTrack(nums,new ArrayList<Integer>(),result);
		  return result;
	    }

	  private void backTrack(int[] nums, List<Integer> temp, List<List<Integer>> result) {
	
		if (temp.size()==nums.length) {
			result.add(new ArrayList<>(temp));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			
			if (temp.contains(nums[i])) {
				continue;
			}
			temp.add(nums[i]);
			backTrack(nums, temp, result);
			temp.remove(temp.size()-1);
		}
		
	}
}
