import java.util.*;
public class WordSearch {

    private char[][] board;
    private int rows, cols;

    public WordSearch(int rows, int cols) {
		board = new char[rows][cols];
		this.rows = rows;
		this.cols = cols;
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

    public boolean addWordH(int r, int c, String word) {
		int len = word.length();
		String backup = "";
		word = word.toUpperCase();
		if (c + len >= cols) {
		    System.out.println("You cannot enter this word at this position");
		    return false;
		}
		for (int i = 0; i < len; i++) {
		    char letter = word.charAt(i);
		    if (board[r][c + i]!='-' && board[r][c + i]!=word.charAt(i)) {
			System.out.println("You cannot enter this word at this position");
			for (int x = 0; x < backup.length(); x ++) {
			    board[r][c + x] = backup.charAt(x);
			}		
			return false;
		    }
		    backup = backup + board[r][c + i];

		    board[r][c + i] = letter;
		}
		return true;
    }

    public boolean addWordV(int r, int c, String word) {
		int len = word.length();
		String backup = "";
		word = word.toUpperCase();
		if (r + len >= rows) {
		    System.out.println("You cannot enter this word at this position");
		    return false;
		}
		for (int i = 0; i < len; i++) {
		    char letter = word.charAt(i);
		    if (board[r + i][c]!='-' && board[r + i][c]!=word.charAt(i)) {
			System.out.println("You cannot enter this word at this position");
			for (int x = 0; x < backup.length(); x ++) {
			    board[r + x][c] = backup.charAt(x);
			}
			return false;
		    }
		    backup = backup + board[r + i][c];
		    board[r + i][c] = letter;
		}
		return true;
    }

    public String reverseWord(String word) {
		String retWord = "";
		for (int i = 0; i < word.length(); i++){
		    retWord = retWord + word.charAt(word.length() - 1 - i);
		}
		return retWord;
    }

    public boolean addWordAsc(int r, int c, String word) {
    	int len = word.length();
		String backup = "";
		word = word.toUpperCase();	    		    		
    	if (r + len >= rows || c + len >= cols || r - len < 0) {
	    	System.out.println("You cannot enter this word at this position");
	    	return false;
		}
		for (int i = 0; i < len; i++) {
	    	char letter = word.charAt(i);
	    	if (board[r - i][c + i]!='-' && board[r - i][c + i]!=word.charAt(i)) {
				System.out.println("You cannot enter this word at this position");
				for (int x = 0; x < backup.length(); x ++) {
		    		board[r - x][c + x] = backup.charAt(x);
				}
			return false;
	    	}
	    	backup = backup + board[r - i][c + i];
	    	board[r - i][c + i] = letter;
		}
		return true;
    }

    public boolean addWordDes(int r, int c, String word) {
    	int len = word.length();
		String backup = "";
		word = word.toUpperCase();	    		    		
    	if (r + len >= rows || c + len >= cols || c - len < 0) {
	    	System.out.println("You cannot enter this word at this position");
	    	return false;
		}
		for (int i = 0; i < len; i++) {
	    	char letter = word.charAt(i);
	    	if (board[r + i][c + i]!='-' && board[r + i][c + i]!=word.charAt(i)) {
				System.out.println("You cannot enter this word at this position");
				for (int x = 0; x < backup.length(); x ++) {
		    		board[r + x][c + x] = backup.charAt(x);
				}
			return false;
	    	}
	    	backup = backup + board[r + i][c + i];
	    	board[r + i][c + i] = letter;
		}
		return true;
    }   

    public boolean addRevH(int r, int c, String word) {
		word = reverseWord(word);
		return addWordH(r, c - word.length(), word);
    }
    
    public boolean addRevV(int r, int c, String word) {
		word = reverseWord(word);
		return addWordV(r - word.length(), c, word);
    }

    public boolean addRevAsc(int r, int c, String word) {
    	word = reverseWord(word);
    	return addWordAsc(r - word.length(), c + word.length(), word);
    }

    public boolean addRevDes(int r, int c, String word) {
    	word = reverseWord(word);
    	return addWordDes(r + word.length(), c + word.length(), word);
    }

    public void fillSpaces() {
    	Random r = new Random();
    	for (int x = 0; x < rows; x ++) {
    		for (int y = 0; y < cols; y ++) {
    			if (Character.toString(board[x][y]).equals("-")) {
    				board[x][y] = (char)(r.nextInt(26) + 65);
    			}
    		}
    	}
    }
}
