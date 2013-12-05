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

    public boolean InsertH(int row,int  col,String word){
	if (row>board.length||col>board[0].length||(row+word.length())>board.length)
	    return false;
	for (int i = 0; i<word.length(); i++){
	    if (!(""+word.charAt(i).equals(""+board[row][col+i]))&&!(""+board[row][col+i].equals("-")))
	    	return false;
	}
	for (int i=0; i<word.length(); i++)
	    board[row][col+i]=word.charAt(i);
	return true;
    }


}
