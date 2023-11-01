package brocampjune;

public class Ex14LongestPrefixString {

	public String longestCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0) {
	        return "";
	    }
	    
	    String prefix = strs[0];
	    
	    for (int i = 1; i < strs.length; i++) {
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) {
	                return "";
	            }
	        }
	    }
	    
	    return prefix;
	}

	
	public static void main(String[] args) {
		
		Ex14LongestPrefixString pr = new Ex14LongestPrefixString();
		String[] words1 = {"flower","flow","flight"};
		String[] words2 = {"flower","dog","car"};
		
		System.out.println(pr.longestCommonPrefix(words1));
		System.out.println(pr.longestCommonPrefix(words2));
	}
	
	
}
