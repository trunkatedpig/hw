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
	String s = "";
        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[i].length;j++) {
                s=s+board[i][j];
            }
            s=s+"\n";
        }
        return s;
    }
    
    public boolean addWordHR(int row, int col, String word) {
	if (word.length()>board[row].length-col)
	    return false;
        for (int i = 0;i<word.length();i++) {
	    if (!(board[row][col+i]=="-".charAt(0) || board[row][col+i]==word.charAt(i))) 
                 return false;
	}
	for (int i = 0; i < word.length(); i ++){
	    board[row][col+i]= word.charAt(i);
	}
	return true;
    }
    public boolean addWordHL(int row, int col, String word) {
	if (word.length()> col + 1)
	    return false;
        for (int i = 0;i<word.length();i++) {
	    if (!(board[row][col-i]=="-".charAt(0) || board[row][col-i]==word.charAt(i))) 
		return false;
	}
	for (int i = 0; i < word.length(); i ++){
	    board[row][col-i]= word.charAt(i);
	}
	return true;
    }
public boolean addWordVU(int row, int col, String word) {
	if (word.length() > row + 1)
	    return false;
        for (int i = 0;i<word.length();i++) {
	    if (!(board[row-i][col]=="-".charAt(0) || board[row-i][col]==word.charAt(i))) 
                 return false;
	}
	for (int i = 0; i < word.length(); i ++){
	    board[row-i][col]= word.charAt(i);
	}
	return true;
    }
public boolean addWordVD(int row, int col, String word) {
	if (board.length - word.length()+ 1 + row  <0)
	    return false;
        for (int i = 0;i<word.length();i++) {
	    if (!(board[row+i][col]=="-".charAt(0) || board[row+i][col]==word.charAt(i))) 
                 return false;
	}
	for (int i = 0; i < word.length(); i ++){
	    board[row+i][col]= word.charAt(i);
	}
	return true;
    }

    public boolean addWordNE(int row, int col, String word){
	if (row + 1 - word.length()< 0 || word.length()>board[row].length-col)
	    return false;
	for (int i = 0; i < word.length(); i ++){
	    if (!(board[row-i][col+i]=="-".charAt(0))||board[row-i][col+i]== word.charAt(i))
		return false;
	}
	for (int i = 0; i<word.length(); i ++){
	    board[row-i][col+i]=word.charAt(i);
	}
	return true;
    }
    public boolean addWordNW(int row, int col, String word){
	if (row + 1 - word.length()< 0 || word.length()>col + 1)
	    return false;
	for (int i = 0; i < word.length(); i ++){
	    if (!(board[row-i][col-i]=="-".charAt(0))||board[row-i][col-i]== word.charAt(i))
		return false;
	}
	for (int i = 0; i<word.length(); i ++){
	    board[row-i][col-i]=word.charAt(i);
	}
	return true;
    }
    public boolean addWordSE(int row, int col, String word){
	if (row + word.length() > board.length || word.length()>board[row].length-col)
	    return false;
	for (int i = 0; i < word.length(); i ++){
	    if (!(board[row+i][col+i]=="-".charAt(0))||board[row+i][col+i]== word.charAt(i))
		return false;
	}
	for (int i = 0; i<word.length(); i ++){
	    board[row+i][col+i]=word.charAt(i);
	}
	return true;
    }    

    public boolean addWordSW(int row, int col, String word){
	if (row + word.length()> board.length || col + 1 - word.length()<0)
	    return false;
	for (int i = 0; i < word.length(); i ++){
	    if (!(board[row+i][col-i]=="-".charAt(0))||board[row+i][col-i]== word.charAt(i))
		return false;
	}
	for (int i = 0; i<word.length(); i ++){
	    board[row+i][col-i]=word.charAt(i);
	}
	return true;
    }
 
    public void fill(){
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	Random r = new Random();
	for (int i = 0; i < board.length;i++){
	    for (int j = 0; j < board[i].length;j++){
		if (board[i][j] == "-".charAt(0)){
		    board[i][j]= alphabet.charAt(r.nextInt(26));
		}
	    }
	}
    }
}
