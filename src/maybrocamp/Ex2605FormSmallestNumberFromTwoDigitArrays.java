package maybrocamp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex2605FormSmallestNumberFromTwoDigitArrays {

public int minNumber(int[] nums1, int[] nums2) {
     
       
	  Set<Integer> set1 = new HashSet<>();
      Set<Integer> set2 = new HashSet<>();
      
      for (int num : nums1) {
          set1.add(num);
      }
      
      for (int num : nums2) {
          set2.add(num);
      }
      
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int smallestInNums1 = nums1[0];
      
     
      for (int num : set1) {
          if ( set2.contains(num)) {
              smallestInNums1 = num;
          }
      }
      
      int smallestInNums2 = nums2[0];
      for (int num : set2) {
          if (num < smallestInNums2 || set1.contains(num)) {
              smallestInNums2 = num;
          }
      }
      if(smallestInNums1==smallestInNums2)
         return smallestInNums1;
      else {
		return Math.min(smallestInNums1, smallestInNums2)*10+ Math.max(smallestInNums1, smallestInNums2);
	}
       }


    }

