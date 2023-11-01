package brocampjune;

public class Ex392IsSubsequence {

	public boolean isSubsequence(String s, String t) {
	
		int i = 0;
		int j = 0;
		
		while (i<t.length() && j<s.length()) {
			if (t.charAt(i)==s.charAt(j)) {
				j++;
			}
			i++;
		}
		
		return j==s.length();
	}
	
}
