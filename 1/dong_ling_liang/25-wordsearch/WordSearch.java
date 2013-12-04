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
    public boolean addWordH(int row, int col, String word){
	int c = 0;
	while (c<word.length()){
	    String temp = ""+board[row][col];
	    if(col>board[row].length-1){
		return false;
	    }
	    else if (temp.equals(""+'-')){
		board[row][col] = word.charAt(c);
		c = c+1;
		col = col + 1;
	    }
	    else{
		return false;
	    }
	}
	return true;
    }
}
