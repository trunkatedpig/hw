import java.io.*;
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
	int count = 0;
        if (row >= board.length)
	    return false;
	if (word.length() + col > board[row].length)
	    return false;

	for (int i=0; i < word.length(); i++) {
	    if (board[row][col+count] != word.charAt(count) && board[row][col+count] != '-')
		return false;
	    count = count + 1;
	}
	
	count = 0;

	for (int i=0; i < word.length(); i++) {
	    board[row][col+count] = word.charAt(count);
	    count = count + 1;
	}
	return true;
    }
}

