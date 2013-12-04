import java.util.*;

public class WordSearch {

    private char[][] board;
    private char defaultvalue = '-'; //just for convenience
    private int rows, cols;

    public WordSearch(int rows, int cols) {
	this.rows = rows;
	this.cols = cols;
	board = new char[rows][cols];
	resetBoard();
    }

    public WordSearch() {
	this(20,20);
    }

    public void resetBoard() {
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++)
		board[i][j]=defaultvalue;
	}
    }

    public boolean addWordH(int row, int col, String word) {
	//check that the word fits on the board
	if(row>rows||row<0||col>cols||col<0||row+word.length()>rows)
	    return false;
	for(int i=0;i<word.length();i++) {
	    //check that each of the spaces is valid
	    if(!(board[row][col+i]==defaultvalue||
		 board[row][col+i]==word.charAt(i)))
		return false;
	}
	for (int i=0;i<word.length();i++)
	    //add the word
	    board[row][col+i] = word.charAt(i);
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
