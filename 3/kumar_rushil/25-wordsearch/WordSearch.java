import java.util.*;

public class WordSearch {
    private char[][] board;
    private char[][] temp = new char[0][0];

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
		temp = board;
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
	//temp = board;
	if ((pos + word.length() - 1) <= board[row].length){
	    for (int i = 0; i < word.length(); i ++){
		if (board[row-1][pos] == '-' || board[row-1][pos] == word.charAt(i)){
		    board[row-1][pos] = word.charAt(i);
		    pos = pos + 1;
		}
		else{
		    board = temp;
		    return false;
		}
	    }
	    return true;
	}
	else {
	    return false;
	}
    }
    public String tempArray() {
	String s="";
	for (int i=0;i<temp.length;i++) {
	    for (int j=0;j<temp[i].length;j++) {
		s=s+temp[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }

}
