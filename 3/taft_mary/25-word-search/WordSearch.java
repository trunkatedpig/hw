import java.util.*;

public class WordSearch {
    private char[][] board;
    private char defaultvalue = '-';
    private int rows, cols;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]=defaultvalue;
	    }
	}
	this.rows = rows;
	this.cols = cols;
    }

    public WordSearch() {
	this(20,20);
    }

    public boolean addWordH(int row, int col, String word) {
	if(row>rows||row<0||col>cols||col<0||row+word.length()>rows)
	    return false;
	for(int i=0;i<word.length();i++) {
	    if(board[row][col+i]==defaultvalue||board[row][col+i]==word.charAt(i))
		board[row][col+i] = word.charAt(i);
	    else
		return false;
	}
	return true;
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

}
