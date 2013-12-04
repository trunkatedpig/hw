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
	if (word.length()>board[row].length-col)
	    return false;
	for (int i = 0; i < word.length(); i ++){
	    if (!(board[row][col + i]== word.charAt(i) || board[row][col +i]=="-".charAt(0)))
		return false;
		
	    
	    board[row][col + i]= word.charAt(i);
	}
	return true;
    }

}
