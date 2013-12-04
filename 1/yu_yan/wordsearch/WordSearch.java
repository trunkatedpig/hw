import java.util.*;
public class WordSearch {

    private char[][] board;
    
    int rows, cols;
    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
	this.rows = rows;
	this.cols = cols;
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

    //Insertion methods
    public boolean insertHorizontal(int c, int r, string s){
	if (c + s.length()-1 > cols)
	    return false;
	else {
	    
	}
}
