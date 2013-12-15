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

    private void readWords(String filename) {
	Scanner s = new Scanner(new file "wordlist");
	ArrayList<String> L = new ArrayList<String>;
	while (s.hasNext()) {
	    L.add(s.next());
	}
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


    public boolean addWord(int row, int col, int deltaR, int deltaC,  String word) {
	if (deltaR < -1 || deltaR > 1 || deltaC < -1 || deltaC > 1 || 
	    (deltaR==0 && deltaC==0) )
	    return false;
	int r = row;
	int c = col;
	for (int i=0; i < word.length(); i++) {
		try {
		    if ( board[r][c] != '-' && board[r][c]!=word.charAt(i)) {
			return false;
		    }
		} catch (ArrayIndexOutOfBoundsException e) {
		    return false;
		}
		r = r + deltaR; 
		c = c+ deltaC;
	    }
	r = row;
	c = col;
	for (int i=0; i < word.length(); i++) {
	    board[r][c]=word.charAt(i);
	    r = r + deltaR; 
	    c = c+ deltaC;
	}
	return true;
    }
    
    public boolean addWordE (int row, int col, String word) {
	return addWord(row, col, 0, 1, word);
    }

    public boolean addWordS(int row, int col, String word) {
	return addWord(row, col, 1, 0, word);
    }
    
    public boolean addWordW (int row, int col, String word) {
	return addWord(row, col, 0, -1, word);
    }

    public boolean addWordN(int row, int col, String word) {
	return addWord (row, col, -1, 0, word);
    }

    public boolean addWordSE(int row, int col, String word) {
	return addWord (row, col, 1, 1, word);
    }

    public boolean addWordSW(int row, int col, String word) {
	return addWord(row, col, 1, -1, word);
    }

    public boolean addWordNE(int row, int col, String word) {
	return addWord(row, col, -1, 1, word);
    }

    public boolean addWordNW(int row, int col, String word) {
	return addWord (row, col, -1, -1, word);
    }