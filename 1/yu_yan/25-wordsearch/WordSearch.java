import java.util.*;
public class WordSearch {

    private char[][] board;
    
    int rows, cols;
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

    public void test(WordSearch w){
	System.out.println(w);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~");
    }

    //Insertion methods

    //see if it's possible to combine H/V
    public boolean insertHorizontal(int c, int r, String s){
	if (c + s.length()-1 > cols || r>rows-1 || r<0){
	    System.out.println("insertion failed");
	    return false;
	}
	for (int n=0; n<s.length(); n++){
	    if ( (board[r][c+n] != '-') && 
		 (board[r][c+n] != s.charAt(n))){
		System.out.println("insertion failed");
		return false;
	    }
	}
	for (int n=0; n<s.length(); n++){
	    board[r][c+n] = s.charAt(n);
	}
	return true;
    }

    public boolean insertVertical(int c, int r, String s){
	if (r + s.length()-1 > rows || c>cols-1 || c<0){
	    System.out.println("insertion failed");
	    return false;
	}
	for (int n=0; n<s.length(); n++){
	    if ( (board[r+n][c] != '-') && 
		 (board[r+n][c] != s.charAt(n))){
		System.out.println("insertion failed");
		return false;
	    }
	}
	for (int n=0; n<s.length(); n++){
	    board[r+n][c] = s.charAt(n);
	}
	return true;
    }

    public boolean insertDiagonal(int c, int r, String s){
	if (r + s.length()-1 > rows || c + s.length()-1 > cols){
	    System.out.println("insertion failed");
	    
	}
    }
    public String reverse(String s){
	String s1 = "";
	for (int n=s.length(); n>0; n--){
	    s1 = s1 + s.substring(n-1, n);
	}
	return s1;
    }

    public boolean insertHReverse(int c, int r, String s){
	return insertHorizontal(c, r, reverse(s));
    }

    public boolean insertVReverse(int c, int r, String s){
	return insertVertical(c, r, reverse(s));
    }
    
    public boolean insertDReverse(int c, int r, String s){
	return insertDiagonal(c, r, reverse(s));
    }
}
