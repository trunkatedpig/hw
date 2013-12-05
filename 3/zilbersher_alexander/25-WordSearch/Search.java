import java.io.*;
import java.util.*;

public class Search {
    private char[][] board;
    private int myrows,mycols;

    public Search(int rows, int cols) {
        board = new char[rows][cols];
        for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
                board[i][j]='-';
	    }
        }
	this.myrows = rows;
        this.mycols = cols;
    }

    public Search() {
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

    public boolean WordH(int rows, int cols, String word){
	if (myrows<rows+word.length() || rows<0 || mycols<cols || cols<0) {
	    return false;
	}
	for (int i=0;i<word.length();i++) {
	    if (board[rows][cols+i] != word.charAt(i) && board[rows][cols+i] != '-') {
		return false;
	    }
	}
	for (int i=0;i<word.length();i++) {
	    board[rows][cols+i] = word.charAt(i);
	}
	return true;
    }

    public boolean WordV(int rows, int cols, String word){
	if (myrows<rows || rows<0 || mycols<cols+word.length() || cols<0) {
	    return false;
	}
	for (int i=0;i<word.length();i++) {
	    if (board[rows+i][cols] != word.charAt(i) && board[rows+i][cols] != '-') {
		return false;
	    }
	}
	for (int i=0;i<word.length();i++) {
	    board[rows+i][cols] = word.charAt(i);
	}
	return true;
    }

}

