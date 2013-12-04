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

    public boolean addWordH(int row, int col, String word) {
	if (isRegionEmptyH(row, col, word.length())) {
	    for (int i = 0; i < word.length(); i++) {
		board[row][col + i] = word.charAt(i);
	    }
	    return true;
	}else{
	    return false;
	}
    }

    private boolean isRegionEmptyH(int row, int col, int length) {
	if (row >= board.length || col >= board[0].length || row < 0 || col < 0 || col + length > board[0].length) {
	    return false;
	}
	for (int i = col; i < col + length; i++) {
	    if (!"-".equals("" + board[row][i])) {
		return false;
	    }
	}
	return true;
    }
}
