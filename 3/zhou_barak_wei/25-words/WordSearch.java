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
	   if (row >= board.length) return false;
	   if ((board[row].length - col) < word.length()) return false; //check if the word can fit
	   int location = col;
           int letter = 0;

           while (letter < word.length()) {
      		   if (board[row][location] != word.charAt(letter) &&
      			   board[row][location] != '-') return false;
			   location = location + 1;
			   letter = letter + 1;
		   }


		   //at this point checking for invalidation should be complete
		   location = col;
		   letter = 0;
		   while (letter < word.length()) {
			   board[row][location] = word.charAt(letter);
			   location = location + 1;
			   letter = letter + 1;
		   }
		   return true;
	   }
    
    public boolean addWordV(int row, int col, String word) {
	if (col >= board[row].length) return false;
	if ((board.length-row) < word.length()) return false;
	int location = row;
	int letter = 0;
	while (letter < word.length()) {
	    if (board[location][col] != word.charAt(letter) &&
		board[location][col] != '-') return false;
	    location = location + 1;
	    letter = letter + 1;
	}

	location = row;
	letter = 0;
	while (letter < word.length()) {
	    board[location][col] = word.charAt(letter);
	    location = location + 1;
	    letter = letter + 1;
	}
	return true;

    }




}
