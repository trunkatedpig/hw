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




    /*
      Precondition: row, col represent the location to try to place the
      first character of word
      
      word represents the word to try to place in the puzzle
      
      Postcondition: If the word can be legally placed in the puzzle, modify
      the board array so that the word is in the puzzle and
      return True.
      Otherwise, return false
      
    */
    public boolean addWordH(int row, int col, String word) {
	if ((row < 0) || (row>board.length) || (col < 0) || (col + word.length() > board[row].length + 1)) 
	    return false;
	else {
	    for (int i=0; i<word.length(); i++)
		board[row][col+i] = word.charAt(i);
	    return true;
	}
    }

}
