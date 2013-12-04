import java.util.*;

public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c) {
	board = new char[r][c];
        for (int i = 0; i < r; i++) {
	    for (int x = 0; x < c; x++) {
		board[i][x]='@';
             }
        }
    }

    public WordSearch() {
	this(20,20);
    }

    public String toString() {
	String s="";
        for (int i = 0;i<board.length;i++) {
	    for (int x = 0; x < board[i].length; x++) {
             s=s+board[i][x];
                    }
                    s=s+"\n";
                }
                return s;
    }

    public boolean addWordH(int row, int col, String word){
	if (col + word.length() >= board[0].length)
                    return false;
                int x = 0;
                for (int i = col; i< col+ word.length(); i++){
                        if (board[row-1][i] != '@' && board[row-1][i] != word.charAt(x))
                                return false;
                        x++;
                }
                x = 0;
                for (int i=col;i<col+word.length();i++){
                        board[row-1][i] = word.charAt(x);
                        x++;
                }

                return true;
    }
}
