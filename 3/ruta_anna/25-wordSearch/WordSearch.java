import java.util.*;

public class WordSearch {
    private char[][] board;
    int maxRow, maxCol;

    public WordSearch(int rows, int cols) {
		maxRow = rows;
		maxCol = cols;
    	board = new char[rows][cols];
        for (int i=0; i<rows; i++) {
        	for (int j=0;j<cols;j++) {
                board[i][j]='-';
         	}
        }
    }

/*This calls the constructor above, setting rows and cols to 20*/
    public WordSearch() {
        this(20,20);
    }


/*Will test if its possible to horizontally, left-to-right, add the word
in the desired row and col, where row and col specify the location of the
first character in the word. If it's possible, the word will be added to
the gameboard*/
	public boolean addWordH(int row, int col, String word){
		if (row>maxRow || col>maxCol+1-word.length())
			return false;
		for (int i=0; i<word.length(); i++){
			if (word.charAt(i) != board[row-1][col-1+i] && board[row-1][col-1+i] != '-')
				return false;
		}
		for (int j=0; j<word.length(); j++){
			board[row-1][col-1+j] = word.charAt(j);
			}
		return true;
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

}