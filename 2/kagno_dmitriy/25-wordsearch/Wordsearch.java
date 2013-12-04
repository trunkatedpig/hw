import java.util.*;

public class Wordsearch {
    private char[][] board;

    public Wordsearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
	    }
	}

    }

    public Wordsearch() {
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

    public boolean AddWordH(int r,int c,String word){
	int i = word.length();
	if (board.length >= c + i){
	    for (int j = 0;j<i;j++){
		board[r][c + j] = word.charAt(j);
	    }
	    return true;
	}
	return false;
    }
    
    
    //My original idea for AddWordH, but it
    //turned out to be AddWordV.....
    public boolean AddWordV(int r,int c,String word){
	int j = word.length();
	if (board[r].length >= r + j){

	    for (int i = 0;i < j;i++){
		board[r + i][c] = word.charAt(i);
	    
	    }
	    return true;
	}
	return false;

    }
}

