import java.util.*;

public class WordSearch {
    private char[][] board;

    public WordSearch(int rows, int cols) {
		board = new char[rows][cols];
		for (int i=0;i<rows;i++) {
	    	for (int j=0;j<cols;j++) {
				board[i][j]='-';
	    	}
		}
    }

    public WordSearch() {
		this(20,20);
    }

    public String toString() {
		String s="";
		for (int i=0;i<board.length;i++) {
		    for (int j=0;j<board[i].length;j++) {
			s=s+board[i][j];
		    }
		    s=s+"\n";
		}
		return s;
    }

    public boolean addWordH(int row, int col, String word){
		int length = word.length();
		int rowSize = board[0].length;

		//If the word is off the board or partly off the board
		if ( col < 0 || col > rowSize || col + length >=rowSize)
		    return false;

		//If the place where the word would go has other letters that don't match
		int n = 0;
		for (int i=col;i<col+length;i++){
			if (board[row-1][i] != '-' && board[row-1][i] != word.charAt(n))
				return false;
			n++;
		}

		//Add word
		n = 0;
		for (int i=col;i<col+length;i++){
			board[row-1][i] = word.charAt(n);
			n++;
		}

		return true;
    }
}
