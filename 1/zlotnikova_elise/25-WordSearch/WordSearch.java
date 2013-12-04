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

    public boolean addWordH(int row, int col, String word) { 
	boolean b = true;
	int c = col;
	if (col+word.length()-1<20) { 
	     for (int i=0;i<word.length();i++) { 
		if (board[row][c]=='-')
		    c = c+1;
		else
		    b = false;
	     }
	}
	if (b) {
	    for (int i=0;i<word.length();i++) { 
		char letter = word.charAt(i);
		board[row][col] = letter;
		col = col + 1;
	    }
	}
	return b;
    }

    public char getChar(int row, int col) { 
	return board[row][col];
    }

    public boolean check(int row, int col, String word) { 
	for (int i=0;i<word.length();i++) { 
	    if (board[row][col] == '-') { 
		col++;
	    }
	    else { 
		return false;
	    }
	}
	return true;
    }
}
