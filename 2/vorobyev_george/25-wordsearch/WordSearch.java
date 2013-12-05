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

    public void add(int dx, int dy, int x, int y, String word){
	int xl, yl;
	xl = x + dx * word.length() -dx;
	yl = y + dy * word.length() - dy;

	    if(
	       x >= 0 && xl < board[0].length&&
	       y >= 0 && yl < board.length&&
	       xl >= 0 && x < board[0].length&&
	       yl >= 0 && y < board.length)
			  
			    
		{
		    for(int i = 0; i < word.length(); i++){
			    if(word.charAt(i) != board[dy*i + y][x + dx*i] && board[i*dy + y][x + dx*i] != '-'){
				    return;
			    }
		    }
		    for(int i = 0; i < word.length(); i++){
			    board[y + i*dy][x + i*dx] = word.charAt(i);
		    }
		}
    }
}

