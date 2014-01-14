import java.io.*;
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
    public char[][] copy(char[][] array){
	char[][]start = new char[array.length][array[0].length];
	for (int i=0;i<array.length;i++) 
	    for (int j=0;j<array[0].length;j++) 
		start[i][j]=array[i][j];
	return start;
    }
    public String toBoard(char[][] arr) {
	String s = "";
	for (int i=0;i<arr.length;i++) {
	    for (int j=0;j<arr[i].length;j++) {
		s=s+arr[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }

    public boolean addWordH(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( c + word.length() > temp.length ){
	    // System.out.println("first return");
	    return false;
	}
	if ( r<0 || c<0 || c>board[0].length || r>board.length) {
	    //  System.out.println("second return");
	    return false;
	}
	for (int index=0; index < word.length() ; index++ ) {
	    //    System.out.println("temp\n"+ toBoard(temp));
	    //   System.out.println("board\n"+toBoard(temp));
	    if (temp[r][index+c]==('-')){
		temp[r][index+c]=word.charAt(index);
	    }
	    else if(temp[r][index+c]==(word.charAt(index))) {
		
	    }
	    else {
		System.out.println("here");
		return false; 
	    }
	}
	board=temp;
	return true;
       

    }
 public boolean addWordHB(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r - word.length() < 0)
	    return false;
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r][c-index]==('-')){
		temp[r][c-index]=word.charAt(index);
	    }
	    else if(temp[r][c-index]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }
    public boolean addWordVD(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r + word.length() > board.length )
	    return false;
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r+index][c]==('-')){
		temp[r+index][c]=word.charAt(index);
	    }
	    else if(temp[r+index][c]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }
    public boolean addWordVU(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r -  word.length() <= 0 ) {
	    System.out.println("here");
	    return false;
	}
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r-index][c]==('-')){
		temp[r-index][c]=word.charAt(index);
	    }
	    else if(temp[r-index][c]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }
    public boolean addWordDRD(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r + word.length() > board.length || c+word.length() > board[0].length )
	    return false;
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r+index][c+index]==('-')){
		temp[r+index][c+index]=word.charAt(index);
	    }
	    else if(temp[r+index][c+index]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }
    public boolean addWordDLD(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r + word.length() > board.length || c - word.length() < 0 )
	    return false;
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r+index][c-index]==('-')){
		temp[r+index][c-index]=word.charAt(index);
	    }
	    else if(temp[r+index][c-index]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }   
    public boolean addWordDLU(int r, int c, String word) {
        char[][] temp=copy(board); 
	if (  r - word.length() < 0 || c - word.length() < 0 )
	    return false;
	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r-index][c-index]==('-')){
		temp[r-index][c-index]=word.charAt(index);
	    }
	    else if(temp[r-index][c-index]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }   
    public boolean addWordDRU(int r, int c, String word) {
        char[][] temp=copy(board); 
	if ( r - word.length() < 0 || c+word.length() > board[0].length )
	    return false;
  	if ( r<0 || c<0 || c>board[0].length || r>board.length) 
	    return false;
	
	for (int index=0; index < word.length() ; index++ ) {
	    if (temp[r-index][c+index]==('-')){
		temp[r-index][c+index]=word.charAt(index);
	    }
	    else if(temp[r-index][c+index]==(word.charAt(index))) {
		
	    }
	    else {
		return false; 
	    }
	}
	board=temp;
	return true;
	

    }
    public void fill() {
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		if (board[i][j]=='-') {
		    board[i][j]=getChar();
		}
	    }
	}
    }
    public char getChar() {
	String alpha = "qwertyuioplkjhgfdsazxcvbnm";
	Random r = new Random();
	int index= r.nextInt(26);
	return alpha.charAt(index);
	
    }
}
