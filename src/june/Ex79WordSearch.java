package june;

public class Ex79WordSearch {
public boolean exist(char[][] board, String word) {
        
		int rows = board.length;
		int cols = board[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (board[i][j] == word.charAt(0)) {
					if (dfs(board,i,j,word,0)) {
						return true;
					}
				}
			}
		}
		return false;
    }

	private boolean dfs(char[][] board, int row, int col, String word, int index) {
		
	
			if (index==word.length()) {
				return true;
			}
			
			int rows = board.length;
			int cols = board[0].length;
			
			if (row<0||col<0||row>=rows||col>=cols||board[row][col] != word.charAt(index)) {
				return false;
			}
			
			char temp = board[row][col];
			board[row][col] = '#';
			
			boolean found = dfs(board, row+1, col, word, index+1)||
						dfs(board, row-1, col, word, index+1)||
						dfs(board, row, col+1, word, index+1)||
						dfs(board, row, col-1, word, index+1); 
			
			board[row][col] = temp;
			
			return found;
		
	}
}
