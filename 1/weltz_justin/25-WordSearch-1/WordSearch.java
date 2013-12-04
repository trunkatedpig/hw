import java.util.*;
public class WordSearch {

    private char[][] board;
    private int rows, cols;

    public WordSearch(int c, int r) {
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

    public boolean insertWordH(int col, int row, String word){
	if (row < 0 || col < 0)
	    return false;
	if (row  >= rows || col + word.length() >= cols)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row][col + j] != '-' && word.charAt(j) != board[row][col + j])
		return false;
		
	}
	for (int i = 0; i < word.length(); i++){
	    board[row][col + i] = word.charAt(i);
	}
	return true;
    }

}
