package brocampjune;

public class Ex744FindSmallestLetterGreaterThanTarget {

	public char nextGreatestLetter(char[] letters, char target) {
        
		char res = letters[0];
		for (int i = 0; i < letters.length; i++) {
			
			if (letters[i]>target) {
				res=letters[i];
				return res;
			}
		}
		
		return res;
    }
}
