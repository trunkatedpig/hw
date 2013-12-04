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
	if (r > 0 && r < rows) {
	    if (c > 0 && c < cols-s.length) {
		for (int i = 0; i < s.length; i++) {
		    board[r][c] = s.charAt(i);
		    c = c + 1;
		}
	    }
	}
	return true;
    }

}