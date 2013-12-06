import java.util.*;
public class WordSearch {

    private char[][] board;
    private int r;
    private int c;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
	r = rows;
	c = cols;
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
    public boolean addWordH(int row, int col, String word){
	if (word.length()>board[row].length-col)
	    return false;
	for (int i = 0; i < word.length(); i++){
	    if (!(board[row][col+i]==word.charAt(i) || board[row][col+i]== "-".charAt(0)))
		return false;
	}  
       	for(int j = 0; j < word.length(); j++){
	    board[row][col+j] = word.charAt(j); 
	}
	
	return true;
    }
    public boolean addWordV(int row, int col, String word){
	if (word.length()>r-row)
	    return false;
	for (int i = 0; i < word.length(); i++){
	    if (!(board[row+i][col]==word.charAt(i) || board[row+i][col]== "-".charAt(0)))
		return false;
	}
	for (int j = 0; j < word.length(); j++){
	    board[row+j][col] = word.charAt(j);
	}
	return true;
    }
    public boolean addWordRevH(int row, int col, String word){
	if (word.length()>board[row].length+col)
	    return false;
	for (int i = 0; i < word.length(); i++){
	    try{
		if (!(board[row][col-i]==word.charAt(i) || board[row][col-i]== '-'))
		    return false;
	    }
	    catch(Exception e){
		return false;
	    }
	}  
       	for(int j = 0; j < word.length(); j++){
	    board[row][col-j] = word.charAt(j); 
	}
	
	return true;
    }
    public boolean addWordRevV(int row,int col, String word){
	if ((row+1)-word.length() < 0)
	    return false;
	try{
	    for (int i = 0; i < word.length(); i++){
		if (!(board[row-i][col]==word.charAt(i) || board[row-i][col]== '-'))
		    return false;
	    }
	}
	catch(Exception e){
	    return false;
	}
	
	for (int j = 0; j < word.length(); j++){
	    board[row-j][col] = word.charAt(j);
	}
	
	return true;
    }
}
