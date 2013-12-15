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

	    /*
	Precondition: row, col represent the location to try to place the
		          first character of word

	              word represents the word to try to place in the puzzle

	Postcondition: If the word can be legally placed in the puzzle, modify
		           the board array so that the word is in the puzzle and
				   return True.
				   Otherwise, return false
		          
	*/
	public boolean addWordH(int row, int col, String word) {

		// row and col are indices

		int wordLength = word.length();
		int maxColumn = board[0].length - 1;
		int maxRow = board.length - 1;
		if (!(col + wordLength - 1 <= maxColumn)) {
			return false;
		}
		if (row > maxRow) {
			return false;
		}

		for(int i = 0; i < wordLength; i++) {
			char thisCharacter = board[row][col+i];
			char correspondingWordChar = word.charAt(i);
			if ((thisCharacter != '-') && (thisCharacter != correspondingWordChar)) {
				return false;
			}
		}

		for(int i = 0; i < wordLength; i++) {
			board[row][col+i] = word.charAt(i);
		}

		return true;

	}

}