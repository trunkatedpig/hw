import java.util.*;
public class WordSearch {

    private char[][] board;
    private int rows, cols;

    public WordSearch(int r, int c) {
        board = new char[r][c];
	rows = r;
	cols = c;
        for (int i=0;i<r;i++)
         for (int j=0;j<c;j++)
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

    public boolean insertWordH(int row, int col, String word){
	if (
	for (int j = 0; j < word.length(); j++){
	    if (board[row][col + i] != "-" && word.charAt(i) != board[row][col + i])
		return false;
		
	}
	for (int i = 0; i < word.length(); i++){
	    board[row][col + i] = word.charAt(i);
	}
	return true;
    }

}