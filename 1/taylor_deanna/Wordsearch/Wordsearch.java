import java.util.*;

public class Wordsearch{

    private char[][] board;
    public Wordsearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0; i<rows; i++)
	    for (int j=0; j<cols; j++)
		board[i][j] = '-';
    }

    private Wordsearch(){
	this(20,20);
    }

    public String toString(){
	String s = "";
	for (int i=0; i<board.length; i++){
	    for (int j=0; j<board[i].length; j++){
		s= s+board[i][j];
	    }
	    s=s+ "\n";
	}
	return s;
    }

    public boolean insertWordV(int r, int c, String s){
	boolean value = false;
	if (s.length() > 20-r){
	    value = false;
	}
	for (int i=0; i<s.length();i++){
	    if (board[r+i][c] != '-' && board[r+i][c] != s.charAt(i)){
		value = false;
	    }
	    else {
		board[r+i][c] = s.charAt(i);
		value = true;
	    }
	}
	return value;
    }

     public boolean insertWordH(int r, int c, String s){
	boolean value = false;
	if (s.length() > 20-r){
	    value = false;
	}
	for (int i=0; i<s.length();i++){
	    if (board[r][c+i] != '-' && board[r][c+i] != s.charAt(i)){
		value = false;
	    }
	    else {
		board[r][c+i] = s.charAt(i);
		value = true;
	    }
	}
	return value;
    }
}


// ARG why wont overlap work properly!?
