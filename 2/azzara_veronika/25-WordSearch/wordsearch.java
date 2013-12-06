import java.util.*;

public class wordsearch{

    private char[][] board;

    public wordsearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
	    }
	}
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

    public boolean addWordH(int r, int c, String word, boolean e){
	if (e==true){
	    String temp = "";
	    for (int i = 0; i<word.length(); i++){
		temp = word.charAt(i)+temp;
	    }
	    word = temp;
	}
	if (r < 1 || c < 1 || word.length() > board[r].length - c){
	    return false;
	}
	if (c + word.length() - 1 <= board[0].length - 1 ){
	    for (int i = 0; i<word.length();i++){
		if (board[r][c+i]!= "-".charAt(0) && board[r][c+i]!=word.charAt(i))
		    return false;
	    }
	    for (int i = 0; i<word.length();i++)
		board[r][c+i]=word.charAt(i);
	    return true;
	}
	else {
	    return false;
	}
    }
   
    public boolean addWordV(int r, int c, String word, boolean e){
	if (e==true){
	    String temp="";
	    for (int i = 0; i<word.length(); i++){
		temp = word.charAt(i)+temp;
	    }
	    word = temp;
	}
	if (r < 1 || c < 1 || word.length() > board.length - c){
	    return false;
	}
	if (c + word.length() - 1 <= board.length - 1 ){
	    for (int i = 0; i<word.length();i++){
		if (board[r+i][c]!= "-".charAt(0) && board[r+i][c]!=word.charAt(i))
		    return false;
	    }
	    for (int i = 0; i<word.length();i++)
		board[r+i][c]=word.charAt(i);
	    return true;
	}
	else {
	    return false;
	}
    }
   public boolean addWordD1(int r, int c, String word, boolean e){
	if (e==true){
	    String temp="";
	    for (int i = 0; i<word.length(); i++){
		temp = word.charAt(i)+temp;
	    }
	    word = temp;
	}
	if (r < 1 || c < 1 || word.length() > board.length - c || word.length() > board[r].length - c){
	    return false;
	}
	if (c + word.length() - 1 <= board.length - 1 && c + word.length() - 1 <= board[r].length - 1 ){
	    for (int i = 0; i<word.length();i++){
		if (board[r+i][c+i]!= "-".charAt(0) && board[r+i][c+i]!=word.charAt(i))
		    return false;
	    }
	    for (int i = 0; i<word.length();i++)
		board[r+i][c+i]=word.charAt(i);
	    return true;
	}
	else {
	    return false;
	}
    }
   public boolean addWordD2(int r, int c, String word, boolean e){
	if (e==true){
	    String temp="";
	    for (int i = 0; i<word.length(); i++){
		temp = word.charAt(i)+temp;
	    }
	    word = temp;
	}
	if (r < 1 || c < 1 || word.length() > board.length - c || word.length() > board[r].length - c){
	    return false;
	}
	if (c + word.length() - 1 <= board.length - 1 && c + word.length() - 1 <= board[r].length - 1 ){
	    for (int i = word.length(); i>0;i--){
		if (board[r+i][c+i]!= "-".charAt(0) && board[r+i][c+i]!=word.charAt(i))
		    return false;
	    }
	    for (int i = word.length(); i>0;i--)
		board[r+i][c+i]=word.charAt(i);
	    return true;
	}
	else {
	    return false;
	}
    }
}
