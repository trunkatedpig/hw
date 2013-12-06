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

    public boolean AddWordH(int r,int c,String word){
	if ((c + word.length() - 1) <= (board[0].length - 1)){
	    for (int i=0; i<word.length();i++){
		if ((board[r][c+i]!=word.charAt(i)) && (board[r][c+i]!="-".charAt(0))){
		    return false;
		}
	    }
	    for (int i = 0; i < word.length(); i ++){
		board[r][c+i] = word.charAt(i);
	    }
	    return true;
	}
	else {
	    return false;
	}
    }


}
