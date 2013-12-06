import java.util.*;
public class WordSearch {

    private char[][] board;
    private int rows, cols;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
	this.rows = rows;
	this.cols = cols;
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


    public boolean insertN(int row, int col, String word){//insert North
	if (word.length() <= row+1){
	    for (int i=0;i<word.length();i--) {
		if (board[row+i][col]!='-' && board[row+i][col]!=word.charAt(i))
		    return false;
	    }
	    for (int i=0;i<word.length();i--) {
		board[row+i][col]=word.charAt(i);
	    }
	    return true;
	}
	return false;
    }    
    public boolean insertS(int row, int col, String word){//insert South
	if (word.length() < (rows - (row+1))){
	    for (int i=0;i<word.length();i++) {
		if (board[row+i][col]!='-' && board[row+i][col]!=word.charAt(i))
		    return false;
	    }
	    for (int i=0;i<word.length();i++) {
		board[row+i][col]=word.charAt(i);
	    }
	    return true;
	}
	return false;
    }    public boolean insertE(int row, int col, String word){//insert East
	if (word.length() < (cols - (col+1))){
	    for (int i=0;i<word.length();i++) {
		if (board[row][col+i]!='-' && board[row][col+i]!=word.charAt(i))
		    return false;
	    }
	    for (int i=0;i<word.length();i++) {
		board[row][col+i]=word.charAt(i);
	    }
	    return true;
	}
	return false;
    }
    public boolean insertW(int row, int col, String word){//insert West
	if (word.length() <= col+1){
	    for (int i=0;i<word.length();i--) {
		if (board[row][col+i]!='-' && board[row][col+i]!=word.charAt(i))
		    return false;
	    }
	    for (int i=0;i<word.length();i--) {
		board[row][col+i]=word.charAt(i);
	    }
	    return true;
	}
    return false;
    }

//diagonals:

    public boolean insertSE(int row, int col, String word){
	if (word.length()<(cols - (col+1)) && word.length()<(rows - (row+1))){
	    for (int i=0;i<word.length();i++) {
		if (board[row+i][col+i]!='-' && board[row+i][col+i]!=word.charAt(i))
		    return false;
	    }
	    for (int i=0;i<word.length();i++) {
		board[row+i][col+i]=word.charAt(i);
	    }
	    return true;
	}
	return false;
    }
    public boolean insertSW(int row, int col, String word){
	if (word.length()<(rows - (row+1)) && word.length()<=col+1) {
	    for (int i=0;i<word.length();i++) {
		if (board[row+i][col-i]!='-' && board[row+i][col-i]!=word.charAt(i))
		    return false;
	    }
	    for (int i=0;i<word.length();i++) {
		board[row+i][col-i]=word.charAt(i);
	    }
	    return true;
	}
	return false;
    }
    public boolean insertNE(int row, int col, String word){
	if (word.length()<=row+1 && word.length() < (cols - (col+1))){
	    for (int i=0;i<word.length();i++) {
		if (board[row-i][col+i]!='-' && board[row-i][col+i]!=word.charAt(i))
		    return false;
	    }
	    for (int i=0;i<word.length();i++) {
		board[row-i][col+i]=word.charAt(i);
	    }
	    return true;
	}
	return false;
    }
    public boolean insertNW(int row, int col, String word){
	if (word.length() <= col+1 && word.length() <= row+1){
	    for (int i=0;i<word.length();i--) {
		if (board[row+i][col+i]!='-' && board[row+i][col+i]!=word.charAt(i))
		    return false;
	    }
	    for (int i=0;i<word.length();i--) {
		board[row+i][col+i]=word.charAt(i);
	    }
	    return true;
	}
	return false;
    }
    
    public void fillRest(){
	for (int i=0; i<rows; i++){
	    for (int j=0; j<cols; j++){
		if (board[i][j]=='-'){
		    board[i][j]==
}
