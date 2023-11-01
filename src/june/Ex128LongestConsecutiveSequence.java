package june;


import java.util.HashSet;

public class Ex128LongestConsecutiveSequence {

	public int longestConsecutive(int[] nums) {
        // Create a hash set to store all the numbers
        HashSet<Integer> set = new HashSet<>();
        
        // Add all the numbers to the set
        for (int num : nums) {
            set.add(num);
        }
        
        int longestStreak = 0;
        
        // Iterate over each number in the set
        for (int num : set) {
            // If the current number is the start of a sequence (i.e., no previous number exists in the set)
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                
                // Increment the current number and streak until the next number is not present in the set
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                
                // Update the longest streak if necessary
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
	
}
