import java.util.*;
public class WordSearch {

    private char[][] board;
    private int rows, cols;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
	this.rows = rows;
	this.cols = cols;
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

    public boolean insertH(int row, int col, String s){
	if (s.length < (cols - (col+1))){
	    for (int i=0;i<word.length();i++) {
		if (board[row][col+i]!="-" && board[row][col+i]!=word.chatAt(i))
		    return false;
	    }
	    for (int i=0;i<word.length();i++) {
		board[row][col+i]=word.charAt(i);
	    }
	    return true;
	}
	return false
    }

    public boolean insertH(int row, int col, String s){
	if (s.length < (rows - (row+1))){
	    for (int i=0;i<word.length();i++) {
		if (board[row+i][col]!="-" && board[row+i][col]!=word.chatAt(i))
		    return false;
	    }
	    for (int i=0;i<word.length();i++) {
		board[row+i][col]=word.charAt(i);
	    }
	    return true;
	}
	return false
    }

}
