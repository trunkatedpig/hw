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
    
    public boolean checkBoardH(int row, int col, String word) {
	for (int i=0; i<word.length(); i++) {
	    char c = board[row][col+i];
	    if (c != word.charAt(i) && c != '-')
		return false;
	}
	return true;
    }

    public boolean checkBoardV(int row, int col, String word) {
	for (int i=0; i<word.length(); i++) {
	    char c = board[row+i][col];
	    if (c != word.charAt(i) && c != '-')
		return false;
	}
	return true;
    }

    public boolean addWordH(int row, int col, String word) {
	boolean statement = row < board.length && row >= 0 && col >= 0 &&  col + word.length() <= board[0].length;
	if (statement) {
	    if (checkBoardH(row, col, word)) {
		for (int i=0; i<word.length(); i++)
		    board[row][col + i] = word.charAt(i);
	    }
	    else
		System.out.println("A");
	}
	
	return false;
    }

    public boolean addWordV(int row, int col, String word) {
	boolean statement = col < board[0].length && row >= 0 && col >= 0 && row + word.length() <= board.length;
	if (statement) {
	    if (checkBoardV(row, col, word)) {
		for (int i=0; i<word.length(); i++)
		    board[row + i][col] = word.charAt(i);
	    }
	}

	return false;
    }
}
