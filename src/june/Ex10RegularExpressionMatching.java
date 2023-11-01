package june;

public class Ex10RegularExpressionMatching {

	 public static boolean isMatch(String s, String p) {
	        int m = s.length();
	        int n = p.length();
	        
	        boolean[][] dp = new boolean[m + 1][n + 1];
	        dp[0][0] = true;

	        //to prepare for patterns with *
	        for (int j = 2;  j<= n; j++) {
				
	        	if (p.charAt(j-1)=='*') {
	        		dp[0][j]= dp[0][j-2];	        		
				}	   
	        }
	          
	        for (int i = 1; i <=m; i++) {
				for (int j = 1; j <=n; j++) {
					
					if (s.charAt(i-1) == p.charAt(j-1)|| p.charAt(j-1)== '.') {
						dp[i][j] =  dp[i-1][j-1];
					}
					else if (p.charAt(j-1)=='*') {
						
							char previousPChar = p.charAt(j-2);
							if (previousPChar == s.charAt(i-1)||previousPChar=='.') {
								
								dp[i][j] = dp[i][j-2]|| dp[i-1][j];
							}else {
								dp[i][j] = dp[i][j-2];
							}
					} 
					
				}
			}
	        
	        return dp[m][n];
	        
	 }       
}
