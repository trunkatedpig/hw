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
	if (r+s.length()<=20 && c<20) {
	    for (int i = 0; i < s.length(); i++) {
		Character z = board[r+i][c];
		if (z.equals('-') || z.equals(s.charAt(i))) {
		    board[r][c+i] = s.charAt(i);
		}
		else {
		    return false;
		}
	    }
	}
	else {
	    return false;
	}
	return true;
    }

}
