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
	int i,j;
	if (row < 0 || col < 0 || col > cols || row + word.length() > rows){
	    return false;
	} 
	for (i = 0; i < word.length(); i++){
	    if (board[row][col+i] != '-' && board[row][col+i] != word.charAt(i)){
		return false;
	    }
	}
	for (j = 0; i < word.length(); j++){
	    board[row][col+j] = word.charAt(i);
	}
	return true;
    }
}
