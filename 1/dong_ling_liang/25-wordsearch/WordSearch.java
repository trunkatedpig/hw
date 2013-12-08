import java.util.*;
public class WordSearch {

    private char[][] board;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='.';
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
	int c = 0;
	int col1 = col;
	while (c<word.length()){
	    try { 
		if (!((board[row][col1]=='.')||(board[row][col1]==(word.charAt(c))))){
		    return false;
		}
	    }
	    catch (Exception e){
		System.out.println("Word too long");
		return false;
	    }
	    c = c + 1;
	    col1 = col1 + 1;
	}
	c = 0;
	while (c<word.length()) {
	    board[row][col]=word.charAt(c);
	    c = c + 1;
	    col = col + 1;
	}
	return true;
    }
    public boolean addWordV(int row, int col, String word){
        int c = 0;
        int row1 = row;
        while (c<word.length()){
            try {
                if (!((board[row1][col]=='.')||(board[row1][col]==(word.charAt(c))))){
                    return false;
                }
            }
            catch (Exception e){
                System.out.println("Word too long");
                return false;
            }
            c = c + 1;
            row1 = row1 + 1; 
	}
        c = 0;
        while (c<word.length()) {
            board[row][col]=word.charAt(c);
            c = c + 1;
            row = row + 1;
        }
        return true;
    }
    public String flip(String word){
	String ret = "";
	for (int i = word.length()-1; i>=0; i--){
	    ret = ret + "" + word.charAt(i);
	}
	return ret;
    }
    public boolean addWordHB(int row, int col, String word){
	return addWordH(row,col-word.length()+1, flip(word));
    }
    public boolean addWordVB(int row, int col, String word){
	return addWordV(row-word.length()+1,col,flip(word));
    }

}
