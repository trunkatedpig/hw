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
    public boolean addWordH(int row, int col, String word) {
        // Adding a horizontal word.
        if (row+word.length()>board.length || row<0 || col>board[0].length || col<o){
	    return false;
	}
	int i;
	int cont;
	for (i=0;i<word.length();i++){
	    cont=0;
	    if ((""+board[row+i][col]).equals("-")){
		cont=1;
	    }
	    if (cont==0){
		return false;
	    }
	}
	for (i=0;i<word.length();i++){
	    board[row+i][col]=word.charAt(i);
	}
	return true;
    }
}
