package june;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex17LetterCombinationsOfPhoneNumber {

	public List<String> letterCombinations(String digits) {
        
		List<String> result = new ArrayList<>();
		
		//important other wise instead of returning [] while string is empty the result will be [""]
		if (digits==null|| digits.length()==0) {
			return result;
		}
		
	
		Map<Character, String> map = new HashMap<>();
		map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

		backTrack(digits,0,new StringBuilder(),result,map);
		
		return result;
    }

	private void backTrack(String digits, int index, StringBuilder temp, List<String> result,Map<Character, String> map) {
		
		if (index == digits.length()) {
			result.add(temp.toString());
			return;
		}
		
		char digit = digits.charAt(index);
		String letters = map.get(digit);
		
		for (char letter : letters.toCharArray()) {
			 temp.append(letter);
			 backTrack(digits, index+1, temp, result, map);
			 temp.deleteCharAt(temp.length()-1);
		}
	}
}
