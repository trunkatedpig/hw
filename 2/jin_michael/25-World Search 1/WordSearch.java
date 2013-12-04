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

    public boolean addWordH(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();

	if (row<0 || col<0 || row>rowmax)
	    return false;
	if (colmax<wmax+col)
	    return false;

	for (int ww=0;ww<wmax;ww++){
	    int colf=col+ww;
	    char w=board[row][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}

	for (int ww=0;ww<wmax;ww++){
	    int colf=col+ww;
	    board[row][colf]=word.charAt(ww);
	}

	return true;
    }
}

