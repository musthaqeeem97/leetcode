package brocampjune;

public class EX1768MergeStringsAlternatively {

	 public String mergeAlternately(String word1, String word2) {
	        
		 StringBuilder sb = new StringBuilder();
		
		 int minlength = Math.min(word1.length(), word2.length());
		 
		 for (int i = 0; i < minlength; i++) {
			
			 sb.append(word1.charAt(i));
			 sb.append(word2.charAt(i));
		}
		 
		 if (word1.length()>word2.length()) {
			sb.append(word1.substring(minlength));
		}else {
			sb.append(word2.substring(minlength));
		}
		 
		 return sb.toString();
		 
	    }
	    
	 
	
}
