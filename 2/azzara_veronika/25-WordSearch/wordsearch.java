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
   public boolean addWordH(int row,int col,String word){
	
	if (c + word.length() - 1 <= board[0].length - 1 || ){
	    for (int i=0; i<word.length();i++){ 
		if (board[r][c+i] != "-".charAt(0) && board[r][c + i] != word.charAt(i)){
		    return false;
		}
	    }
	    for (int i = 0;i<word.length();i++){
		board[r][c+i] = word.charAt(i);
	    }
	    return true;
	}
	else 
	    return false;
    }
}
