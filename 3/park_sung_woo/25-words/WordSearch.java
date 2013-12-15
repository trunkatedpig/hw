import java.util.*;

public class WordSearch {
    private char[][] board;
    private int numRow;
    private int numCol;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
	    }
	}
	numRow = rows;
	numCol = cols;

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
        System.out.println(col+word.length());
        System.out.println(board[0].length+1);
        
        if (col+word.length()<board[0].length+1){
            for (int i=0;i<word.length();i++){
                board[row][col] = word.charAt(i);
                col++;
            }
            return true;
        }
        return false;
    }

    public boolean addWordV(int row, int col, String word){
	if (row+word.length()<numRow+1){
	    for (int i=0;i<word.length();i++){
		board[row][col] = word.charAt(i);
		row++;
	    }
	    return true;
	}
	return false;
    }
}
