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
        if (row > board.length || col > board[row].length || row < 0 || col < 0)
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

    public boolean addWordV(int row, int col, String word) {
	int count = 0;
        if (row > board.length || col > board[row].length || row < 0 || col < 0)
	    return false;
	if (word.length() + row > board.length)
	    return false;

	for (int i=0; i < word.length(); i++) {
	    if (board[row+count][col] != word.charAt(count) && board[row+count][col] != '-')
		return false;
	    count = count + 1;
	}
	
	count = 0;

	for (int i=0; i < word.length(); i++) {
	    board[row+count][col] = word.charAt(count);
	    count = count + 1;
	}
	return true;
    }

    public boolean addWordHb(int row, int col, String word) {
	int count = 0;
        if (row > board.length || col > board[row].length || row < 0 || col < 0)
	    return false;
	if (col - word.length() < 0)
	    return false;

	for (int i=0; i < word.length(); i++) {
	    if (board[row][col-count] != word.charAt(count) && board[row][col-count] != '-')
		return false;
	    count = count + 1;
	}
	
	count = 0;

	for (int i=0; i < word.length(); i++) {
	    board[row][col-count] = word.charAt(count);
	    count = count + 1;
	}
	return true;
    }

    public boolean addWordVb(int row, int col, String word) {
	int count = 0;
        if (row > board.length || col > board[row].length || row < 0 || col < 0)
	    return false;
	if (row - word.length() < 0)
	    return false;

	for (int i=0; i < word.length(); i++) {
	    if (board[row-count][col] != word.charAt(count) && board[row-count][col] != '-')
		return false;
	    count = count + 1;
	}
	
	count = 0;

	for (int i=0; i < word.length(); i++) {
	    board[row-count][col] = word.charAt(count);
	    count = count + 1;
	}
	return true;
    }

    public boolean addWordHV(int row, int col, String word) {
	int count = 0;
	if (row > board.length || col > board[row].length || row < 0 || col < 0)
	    return false;
	if (word.length() + row > board.length || word.length() + col > board[row].length)
	    return false;

	for (int i=0; i < word.length(); i++) {
	    if (board[row+count][col+count] != word.charAt(count) && board[row+count][col+count] != '-')
		return false;
	    count = count + 1;
	}
	
	count = 0;

	for (int i=0; i < word.length(); i++) {
	    board[row+count][col+count] = word.charAt(count);
	    count = count + 1;
	}
	return true;
    }

    public boolean addWordHbV(int row, int col, String word) {
	int count = 0;
	if (row > board.length || col > board[row].length || row < 0 || col < 0)
	    return false;
	if (word.length() + row > board.length || col - word.length() < 0)
	    return false;

	for (int i=0; i < word.length(); i++) {
	    if (board[row+count][col-count] != word.charAt(count) && board[row+count][col-count] != '-')
		return false;
	    count = count + 1;
	}
	
	count = 0;

	for (int i=0; i < word.length(); i++) {
	    board[row+count][col-count] = word.charAt(count);
	    count = count + 1;
	}
	return true;
    }
	
    public boolean addWordHVb(int row, int col, String word) {
	int count = 0;
	if (row > board.length || col > board[row].length || row < 0 || col < 0)
	    return false;
	if (word.length() + col > board.length || row - word.length() < 0)
	    return false;

	for (int i=0; i < word.length(); i++) {
	    if (board[row-count][col+count] != word.charAt(count) && board[row-count][col+count] != '-')
		return false;
	    count = count + 1;
	}
	
	count = 0;

	for (int i=0; i < word.length(); i++) {
	    board[row-count][col+count] = word.charAt(count);
	    count = count + 1;
	}
	return true;
    }

    public boolean addWordHbVb(int row, int col, String word) {
	int count = 0;
	if (row > board.length || col > board[row].length || row < 0 || col < 0)
	    return false;
	if (col - word.length() < 0 || row - word.length() < 0)
	    return false;

	for (int i=0; i < word.length(); i++) {
	    if (board[row-count][col-count] != word.charAt(count) && board[row-count][col-count] != '-')
		return false;
	    count = count + 1;
	}
	
	count = 0;

	for (int i=0; i < word.length(); i++) {
	    board[row-count][col-count] = word.charAt(count);
	    count = count + 1;
	}
	return true;
    }

    public boolean fill() {
	for (int i=0; i<board.length;i++) {
	    for (int j=0; j<board[row].length; j++) { 
}

