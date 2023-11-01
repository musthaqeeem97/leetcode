package brocampjune;


public class BuddyStrings {

	public boolean goal(String s,String goal) {
		
		int i = 0;
		int j = s.length()-1;
		
		 if (s.length() != goal.length()) {
	            return false;
	        }
		 int count = 0;
		 for (int j2 = 0; j2 < s.length(); j2++) {
			
			 if (s.charAt(2)!=goal.charAt(j2)) {
					
				 break;
			 }
			 count = count+1;
		}
		if (count==s.length()-1) {
			return true;
		}
		 
		while (i<j) {
			
			if (s.charAt(i)==goal.charAt(j)&& s.charAt(i)!=goal.charAt(i)) {
				
				
				break;
			}
			i++;
			j--;
		}
		
		for (int j2 = 0; j2 < goal.length(); j2++) {
			
			if (s.charAt(j2)==goal.charAt(j2)) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
}
