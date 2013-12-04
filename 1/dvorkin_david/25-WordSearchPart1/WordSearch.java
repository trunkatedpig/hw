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
    public boolean addWordH(int row, int col, String word) {
	int wordindex = 0;
	if (col + word.length() <= 20){
	     if (row + word.length()<= 20){
		while (wordindex < word.length()){
		    //if (!board[row+wordindex][col].equals("a || b || c
		     if (board[row+wordindex][col]=='-'){
			board[row+wordindex][col] = word.charAt(wordindex);
			wordindex++;
		     }
		     else{
			 return false;
		     }
		}
	     }
	     else{
		 return false;
	     }
	}
	return false;
    }
    
}
