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

    public boolean insertWordH(int r, int c, String s){
	if (s.length > 20-r){
	    return false;
	}
	else {
	    for (int i=0; i<s.length; i++){
		board[r+i][c] = s.charAt[i];
	    }