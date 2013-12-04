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

    public boolean addWordH(int r, int c, String word) {
        char[][] temp=board; 
	if ( c + word.length() > board.length )
	    return false;
	if ( c<0) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (board[r][index+c]==('-')){
		board[r][index+c]=word.charAt(index);
	    }
	    else if(board[r][index+c]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }

}
