import java.util.*;
public class WordSearch {

    public char[][] board;
    private int rows, cols;

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

    public boolean addWordH(int r, int c, String word){
	if (r>board.length || (c+(word.length()-1)>board[r].length)) {
	    return false;
	}
	for (int i=0;i<word.length();i++) {
	    if ((!((""+board[r][c+i]).equals("-"))) && (!((""+board[r][c+i]).equals("" + word.charAt(i))))) {
		return false;
	    }
	}
	for (int i=0;i<word.length(); i++) {
	    board[r][c+i] = word.charAt(i);
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
