import java.util.*;
public class WordSearch {

    private char[][] board;
    private int rows, cols;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	this.rows = rows;
	this.cols = cols;
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

    public boolean AddWordH(int r, int c, String word) {
	int len = word.length();
	String backup = "";
	word = word.toUpperCase();
	if (c + len >= cols) {
	    System.out.println("You cannot enter this word at this position");
	    return false;
	}
	for (int i = 0; i < len; i++) {
	    char letter = word.charAt(i);
	    if (board[r][c + i]!='-' && board[r][c + i]!=word.charAt(i)) {
		System.out.println("You cannot enter this word at this position");
		for (int x = 0; x < backup.length(); x ++) {
		    board[r][c + x] = backup.charAt(x);
		}		
		return false;
	    }
	    backup = backup + board[r][c + i];

	    board[r][c + i] = letter;
	}
	return true;
    }

    public boolean AddWordV(int r, int c, String word) {
	int len = word.length();
	String backup = "";
	word = word.toUpperCase();
	if (r + len >= rows) {
	    System.out.println("You cannot enter this word at this position");
	    return false;
	}
	for (int i = 0; i < len; i++) {
	    char letter = word.charAt(i);
	    if (board[r + i][c]!='-' && board[r + i][c]!=word.charAt(i)) {
		System.out.println("You cannot enter this word at this position");
		for (int x = 0; x < backup.length(); x ++) {
		    board[r + x][c] = backup.charAt(x);
		}
		return false;
	    }
	    backup = backup + board[r + i][c];
	    board[r + i][c] = letter;
	}
	return true;
    }

    public String reverseWord(String word) {
	String retWord = "";
	for (int i = 0; i < word.length(); i++){
	    retWord = retWord + word.charAt(word.length() - i);
	}
	return retWord;
    }

    public boolean AddReverseH(int r, int c, String word) {
	word = reverseWord(word);
	return AddWordH(r, c - word.length(), word);
    }
    
    public boolean AddReverseV(int r, int c, String word) {
	word = reverseWord(word);
	return AddWordV(r - word.length(), c, word);
    }
}
