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
	if (ableToAddH(row,col,word.length())){
	    for (int i = 0; i< word.length(); i++){
		board[row][col+i] = word.charAt(i);
	    }
	    return true;
	}
	return false;
    }

    private boolean ableToAddH(int r, int c, int length) {
	if ((r > board.length) || (c + length > board[0].length)) {
	    return false;
	} 
	return true;
	
    }

}
