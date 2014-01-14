import java.util.*;
import java.io.*;

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
		int length = word.length();
		if (col + length >= board[0].length)
			return false;
		for (int i = 0;i<length;i++) {
			if (!(board[row][i+col] == '-' || board[row][i+col] == word.charAt(i)))
				return false;
		}
		for (int i = 0;i<length;i++)
			board[row][i+col] = word.charAt(i);
		return true;
	}

	public boolean addWordV(int row, int col, String word){
		int length = word.length();
		if (row + length >= board.length)
			return false;
		for (int i = 0;i<length;i++) {
			if (!(board[row+i][col] == '-' || board[row+i][col] == word.charAt(i)))
				return false;
		}
		for (int i = 0;i<length;i++)
			board[row+i][col] = word.charAt(i);
		return true;
	}

	public boolean addWordHBack(int row, int col, String word){
		int length = word.length();
		if (length>col)
			return false;
		for (int i = 0;i<length;i++) {
			if (!(board[row][col-i] == '-' || board[row][col-i] == word.charAt(i)))
				return false;
		}
		for (int i = 0;i<length;i++)
			board[row][col-i] = word.charAt(i);
		return true;
	}

	public boolean addWordVBack(int row, int col, String word){
		int length = word.length();
		if (length>row)
			return false;
		for (int i = 0;i<length;i++) {
			if (!(board[row-i][col] == '-' || board[row-i][col] == word.charAt(i)))
				return false;
		}
		for (int i = 0;i<length;i++)
			board[row-i][col] = word.charAt(i);
		return true;
	}

	public boolean addWordDR(int row, int col, String word){
		int length = word.length();
		if (length + row > board.length || length + col > board[0].length)
			return false;
		for (int i = 0;i<length;i++) {
			if (!(board[row+i][col+i] == '-' || board[row+i][col+i] == word.charAt(i)))
				return false;
		}
		for (int i = 0;i<length;i++)
			board[row+i][col+i] = word.charAt(i);
		return true;
	}

	public boolean addWordDL(int row, int col, String word){
		int length = word.length();
		if (length + row > board.length || length > col)
			return false;
		for (int i = 0;i<length;i++) {
			if (!(board[row+i][col-i] == '-' || board[row+i][col-i] == word.charAt(i)))
				return false;
		}
		for (int i = 0;i<length;i++)
			board[row+i][col-i] = word.charAt(i);
		return true;
	}

	public boolean addWordUR(int row, int col, String word){
		int length = word.length();
		if (length > row || length + col > board[0].length)
			return false;
		for (int i = 0;i<length;i++) {
			if (!(board[row-i][col+i] == '-' || board[row-i][col+i] == word.charAt(i)))
				return false;
		}
		for (int i = 0;i<length;i++)
			board[row-i][col+i] = word.charAt(i);
		return true;
	}

	public boolean addWordUL(int row, int col, String word){
		int length = word.length();
		if (length > row || length > col)
			return false;
		for (int i = 0;i<length;i++) {
			if (!(board[row-i][col-i] == '-' || board[row-i][col-i] == word.charAt(i)))
				return false;
		}
		for (int i = 0;i<length;i++)
			board[row-i][col-i] = word.charAt(i);
		return true;
	}

	public void fillBoard() {
		Random r = new Random();
		for (int i = 0;i<board.length;i++) {
			for (int j = 0;j<board[i].length;j++) {
				if (board[i][j] == '-')
					board[i][j] = (char)('A' + r.nextInt(26));
			}
		}
	}
}

















