import java.util.*;

public class WordSearch {
    private char[][] board;
    int numrows = 0;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	numrows = rows;
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
	int pos = col - 1;
	if ((pos + word.length() - 1) <= board[row - 1].length){
	    for (int i = 0; i < word.length(); i ++){
		if (board[row - 1][pos] == '-' || board[row - 1][pos] == word.charAt(i)){
		    board[row - 1][pos] = word.charAt(i);
		    pos = pos + 1;
		}
		else{
		    for (int k = col - 1; k < pos; k ++){
			board[row - 1][k] = '-';
		    }
		    return false;
		}
	    }
	    return true;
	}
	else {
	    return false;
	}
    }

    public boolean addWordV(int row, int col, String word){
	int pos = row - 1;
	if ((pos + word.length() - 1) <= numrows){
	    for (int i = 0; i < word.length(); i ++){
		if (board[pos][col - 1] == '-' || board[pos][col - 1] == word.charAt(i)){
		    board[pos][col - 1] = word.charAt(i);
		    pos = pos + 1;
		}
		else{
		    for (int k = row - 1; k < pos; k ++){
			board[k][col - 1] = '-';
		    }
		    return false;
		}
	    }
	    return true;
	}
	else {
	    return false;
	}
    }

    public boolean addWordD(int row, int col, String word){
	int pos = row - 1;
	if ((pos + word.length() - 1) <= numrows){
	    for (int i = 0; i < word.length(); i ++){
		if (board[pos][col - 1] == '-' || board[pos][col - 1] == word.charAt(i)){
		    board[pos][col - 1] = word.charAt(i);
		    pos = pos + 1;
		}
		else{
		    for (int k = row - 1; k < pos; k ++){
			board[k][col - 1] = '-';
		    }
		    return false;
		}
	    }
	    return true;
	}
	else {
	    return false;
	}
    }

    public int diaglength(int row, int pos){
	int i;
	for (i = 0; i < (board
}
