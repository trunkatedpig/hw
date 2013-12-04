import java.util.*;
public class WordSearch {

    private char[][] board;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
    }

    public WordSearch() {
	this(20,20);
    }

    public String toString() {
	String s = "";
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		s=s+board[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }

    public boolean insertWordH (int r, int c, String s) {
	for (int i = 0; i < s.length(); i ++) {
	    if (board[r+i][c].equals('-')) {
		board[r+i][c] = s.charAt(i);
	    }
	    else if (board[r+i][c].equals(s.charAt(i))) {
		board[r+i][c] = s.charAt(i);
	    }
	    else 
		return false;
	    
	}
	return true;

    }
}