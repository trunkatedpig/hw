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
    public boolean addWordH(int row, int col, String word){
	//test if legal
	int c = 0;

	//prevents error in next boolean
	if (word.length() == 0)
	    return true;

	//check range of row and col
	if (!(row>=0 && row<board.length) || !(col>=0 && col<=board[row].length-word.length()))
	    return false;

	//check if something is in the way before adding
	while (c<word.length()){
	    if(!((""+board[row][col+c]).equals("-")) && !((""+board[row][col+c]).equals(""+word.charAt(c))))
		return false;
	    c = c + 1;
	}

	//if legal, add
	c=0;
	while (c<word.length()){   
	    board[row][col] = word.charAt(c);
	    c = c + 1;
	    col = col + 1;
	}
	return true;
    }

}
