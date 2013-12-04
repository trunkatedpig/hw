import java.util.*;
import java.io.*;

public class WordSearch {

    private char[][] board;
    private int cols, rows;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
    }

    public WordSearch() {
	this(20,20);
    }

    public boolean InsertWordH(int row, int col, String word) {
	for (int i = 0; i<word.length(); i++) {
	    if (board[row][col+i] == '-'){
		board[row][col+i] = word.charAt(i);
	    }
	    else if (word.charAt(i) != board[row][col+i]) {
		return false;
	    }
	}
	return true;
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


}
