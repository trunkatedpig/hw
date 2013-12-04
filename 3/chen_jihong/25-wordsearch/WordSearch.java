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
    public boolean addwordH(int row, int col, String word) {
	char[] words = word.toCharArray();
	char[] k = new char[word.length()];
	char[] temp = new char[word.length()];
	int q = 0;
	for (int i = row;i<row + word.length();i++){
	    for (int j = col;j<col + word.length();j++){
		k[q] = board[i][j];
	    }
	    q++;
	}
	for (int i = 0;i<k.length; i++){
	    if (k[i] == words[i] || k[i] == '-'){
		board[row][col + i] = words[i];
		temp[i] = board[row][col+i];
		}
	}
	if (temp == words){
	    return true;
	}
	
	return false;
    }
	    
       

}
