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

    public boolean addWordH(int row, int col, String word) {
	char c;
	if (row > board.length || board[0].length < col || 
	    col+1+word.length() > board[row-1].length
) {
	    return false;
	}
	else {
	    for (int i=0; i<word.length(); i++) {
		c = word.charAt(i);
		board[row-1][col-1+i] = c;
	    }
	    return true;
	}
    }


    public boolean addWordV(int row, int col, String word){
	char c;
	if (row > board.length || row+1+word.length() > board.length - row ||
	    board[0].length < col
	    ){
	    return false;
	}
	else {
	    for (int i=0; i<word.length(); i++){
		    c= word.charAt(i);
		    board[row-1+i][col-1] = c;
		}
	    return true;
	}
    }

     public boolean addWordDiagDownLeft(int row, int col, String word) {
	char c;
	//downright
	if (board[0].length < col || col+1+word.length() > board[row-1].length ||
	    row > board.length|| row+1+word.length() > board.length - row )
		{
		return false;
		    }
	    else{ 
		for (int i=0; i<word.length(); i++){	
		    c= word.charAt(i);
		    board[row-1+i][col-1+i] = c;
		}
		return true;
	    }
     }

    public boolean addWordDiagUpRight(int row, int col, String word) {
	char c;
	//upright
	    if (board[0].length < col ||
		col+1+word.length() > board[row-1].length ||
		row+1-word.length() < 0 ||
		row > board.length )
		{
		    return false;
		}
	    else{
		for (int i=0; i<word.length(); i++){
		    c= word.charAt(i);
		    board[row-i][col-1+i] = c;
		}
		return true;
	    }
    }



}
		    
		
		



