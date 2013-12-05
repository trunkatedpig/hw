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
    
    public boolean AddWordH(int r, int c, String word){
        int i = 0;
        try{
	    while (i < word.length()){
		if (board[r][c+i] != '-' && board[r][c+i] != word.charAt(i))
		    return false;
		i ++;
            }
        }
        catch (Exception e){
            return false;
        }
        i = 0; 
        while (i < word.length()){
            board[r][c+i] = word.charAt(i);
            i ++;
        }
        toString();
        return true;
    }
    
    public boolean AddWordV(int r, int c, String word){
        int i = 0;
        try {
            while (i < word.length()){
                if (board[r+i][c] != '-' && board[r+i][c] != word.charAt(i))
		    return false;
		i ++;
	    }
	}
        catch (Exception e1){
            return false;
        }
	
        i = 0;
        while (i < word.length()){
            board [r+i][c] = word.charAt(i);
            i ++;
        }
	toString();
        return true;
	
	
    }
    
    public String toString() {
	String s = "";
	System.out.println("");
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		s=s+board[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }
    
    
}
