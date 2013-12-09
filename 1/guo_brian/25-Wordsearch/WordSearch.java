import java.util.*;
import java.io.*;

public class WordSearch {

    private char[][] board;
    private int cols, rows;

    public WordSearch(int row, int col) {
	board = new char[row][col];
	cols = col;
	rows = row;
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
    }

    public WordSearch() {
	this(20,20);
    }

    public boolean InsertWordH(int row, int col, String word, boolean right) {
	if ((col + word.length() >= cols && right)||(!right && col - word.length() < 0))
	    return false;
	for (int i = 0; i<word.length(); i++) {
	    if (right && (board[row][col+i] != '-' && board[row][col+i] != word.charAt(i))){
		return false;
	    }
	    else if (!right && (board[row][col-i] != '-' && board[row][col - i] != word.charAt(i)))
		return false;
	}
	if (right){
	    for (int i = 0; i < word.length(); i++) {
		board[row][col+i] = word.charAt(i);
	    }
	}
	if (!right) {
	    for (int i = 0; i < word.length(); i++) {
		board[row][col-i] = word.charAt(i);
	    }
	}
	return true;
    }

    public boolean InsertWordV(int row, int col, String word, boolean down) {
	if ((down && row + word.length() >= rows) || (!down && row - word.length() < 0))
	    return false;
	for (int i = 0; i < word.length(); i++){
	    if (down && (board[row+i][col] != '-' && board[row+i][cols] != word.charAt(i)))
		return false;
	    else if (!down && (board[row-i][col] != '-' && board[row-i][cols] != word.charAt(i)))
		return false;
	}
	if (down) {
	    for (int i = 0; i<word.length(); i++) {
		board[row+i][col] = word.charAt(i);
	    }
	}
	if (!down) {
	    for (int i = 0; i < word.length(); i++) {
		board[row-i][col] = word.charAt(i);
	    }
	}
	return true;
    }
    
    public boolean InsertWordDiagRight(int row, int col, String word, boolean down) {
	if ((down && (row + word.length() >= rows || col + word.length() >= cols)) || (!down && (row - word.length() < 0 || col - word.length() < 0)))
	    return false;
	for (int i = 0; i < word.length(); i++){
	    if (down && (board[row+i][col+i] != '-' && board[row+i][col+i] != word.charAt(i)))
		return false;
	    else if (!down && (board[row-i][col-i] != '-' && board[row-i][col-i] != word.charAt(i)))
		return false;
	}
	if (down) {
	    for (int i = 0; i<word.length(); i++) {
		board[row+i][col+i] = word.charAt(i);
	    }
	}
	if (!down) {
	    for (int i = 0; i < word.length(); i++) {
		board[row-i][col-i] = word.charAt(i);
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
