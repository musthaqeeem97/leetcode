package june;

import java.util.ArrayList;
import java.util.List;

public class Ex39CombinationSum {

	   public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        
		   List<List<Integer>> result = new ArrayList<>();
		   backTrack(candidates,0,target,new ArrayList<>(),result);
		   return result;
	    }

	   private void backTrack(int[] candidates,int start, int target, List<Integer> temp, List<List<Integer>> result) {
		
		if (target<0) {
			return;
		}
		if (target==0) {
			result.add(new ArrayList<>(temp));
			return;
		}
		for (int i = start; i < candidates.length; i++) {
			
			temp.add(candidates[i]);
			backTrack(candidates,i,target-candidates[i], temp, result);
			temp.remove(temp.size()-1);
		}
		
	}
	   
}
