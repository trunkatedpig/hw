import java.util.*;

public class wordsearch{

    private char[][] board;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
	    }
	}
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

    public boolean addWordH(int r, int c, string Word){
	for (int i=c;i<board.length;i++){
	    if 
    }

    public boolean addWordH(int row, int col, String word) {
	if (col + word.length - 1 > board[row].length || row < 1 || col < 1 || row > board.length) {
	    return false; 
	} else {
	    for (int i = col;i < col + word.length;i++) {
		//not sure what to do after
	    }
	}
    }

}