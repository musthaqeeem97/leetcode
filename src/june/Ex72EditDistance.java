package june;

public class Ex72EditDistance {

	public int minDistance(String word1, String word2) {
	    
		int m = word2.length();
		int n = word1.length();
		int[][]memo = new int[m+1][n+1];  
		
		for (int i = 0; i <=m; i++) {
			memo[i][0] = i;
		}
		
		for (int i = 0; i <=n; i++) {
			memo[0][i] = i;
		}
		
		for (int i = 1; i <=m; i++) {
			for (int j = 1; j <=n; j++) {
				if (word2.charAt(i-1)==word1.charAt(j-1)) {
					
					memo[i][j] = memo[i-1][j-1];
					
				}else {
					memo[i][j] = 1+(Math.min(memo[i-1][j-1], Math.min(memo[i][j-1],memo[i-1][j] )));
				}
			}
		}
		
		return memo[m][n];
    }
}
