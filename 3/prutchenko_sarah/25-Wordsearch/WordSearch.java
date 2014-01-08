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
    public boolean validH (int r, int c, String w){
	if(r<0 || c<0 || r>board.length || c>board[0].length){
	    return false;
	}
	if(w.length()>board[0].length){
	    return false;
	}
	else{
	    if(board[r].length-c>= w.length()){
		return true;
	    }
	    else{
		return false;
	    }
	}
    }  

 public boolean validV (int r, int c, String w){
	if(r<0 || c<0 || r>board.length || c>board[0].length){
	    return false;
	}
	if(w.length()>board.length){
	    return false;
	}
	else{
	    if(board.length-r>= w.length()){
		return true;
	    }
	    else{
		return false;
	    }
	}
    }  
  


    public boolean addWordH(int row, int col, String word){
	if (validH(row, col, word)){
	    for (int i=0; i< word.length(); i++){
		board[row][col]= word.charAt(i);
		col=col+1;
	    }
	    return true;
	}
	return false;
    }
    public boolean addWordV(int row, int col, String word){
	if (validV(row, col, word)){
	    for (int i=0; i<word.length(); i++){
		board[row][col]=word.charAt(i);
		row=row+1;
	    }
	    return true;
	}
	return false;
    }

    public boolean addWordD(int row, int col, String word){
	if (validV(row, col, word)&& validH(row, col, word)){
	    for (int i=0; i<word.length(); i++){
		board[row][col]=word.charAt(i);
		row=row+1;
		col=col+1;
	    }
	    return true;
	}
	return false;
    }
}
