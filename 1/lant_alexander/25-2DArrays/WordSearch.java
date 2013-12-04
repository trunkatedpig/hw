import java.util.*;
import java.io.*;

public class WordSearch {

    private char[][] board;
    private int rows;
    private int cols;

    public WordSearch(int r, int c) {
    rows = r;
    cols = c;    
    board = new char[r][c];
	for (int i=0;i<r;i++) 
	    for (int j=0;j<c;j++) 
		board[i][j]='-';
    }

    public WordSearch() {
	this(20,20);
    }

    public boolean InsertWord(int r, int c, String word){
	// return #t if word is on board && is compatible with competing words
        int length = word.length();
        if(length > rows - r)
        return false;
	for(int l = 0; l < length; l++){
	   if (board[r][c+l] != word.charAt(l));
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
