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

    public boolean addWordH(int r, int c, String word) {
	int i;
	int j;

	i=0;
	while (i<word.length()) {
	    try {
		if ( board[r][c+i] != '-' && board[r][c+i]!=word.charAt(i)) {
		    return false; 
		}
	    } catch (Exception e) {
		System.out.println(e);
		return false;
	    }
	    i++;
	}
	i=0;
	while (i<word.length()) {
	    board[r][c+i]=word.charAt(i);
	    i++;
	}
	return true;
    }

    public boolean addWordBackH(int r, int c, String word) {
	int i;
	int j;

	i=0;
	while (i<word.length()) {
	    try {
		if ( board[r][c-i] != '-' && board[r][c-i]!=word.charAt(i)) {
		    return false; 
		}
	    } catch (Exception e) {
		System.out.println(e);
		return false;
	    }
	    i++;
	}
	i=0;
	while (i<word.length()) {
	    board[r][c-i]=word.charAt(i);
	    i++;
	}
	return true;
    }

    public boolean addWordV(int r, int c, String word) {
	int i;
	int j;

	i=0;
	while (i<word.length()) {
	    try {
		if ( board[r+i][c] != '-' && board[r+i][c]!=word.charAt(i)) {
		    return false; 
		}
	    } catch (Exception e) {
		System.out.println(e);
		return false;
	    }
	    i++;
	}
	i=0;
	while (i<word.length()) {
	    board[r+i][c]=word.charAt(i);
	    i++;
	}
	return true;
    }

    public boolean addWordBackV(int r, int c, String word) {
	int i;
	int j;

	i=0;
	while (i<word.length()) {
	    try {
		if (board[r-i][c] != '-' && board[r-i][c]!=word.charAt(i)) {
		    return false; 
		}
	    } catch (Exception e) {
		System.out.println(e);
		return false;
	    }
	    i++;
	}
	i=0;
	while (i<word.length()) {
	    board[r-i][c]=word.charAt(i);
	    i++;
	}
	return true;
    }

    public boolean addWordBRight(int r, int c, String word) {
	int i;
	int j;

	i=0;
	while (i<word.length()) {
	    try {
		if (board[r+i][c+i] != '-' && board[r+i][c+i]!=word.charAt(i)) {
		    return false; 
		}
	    } catch (Exception e) {
		System.out.println(e);
		return false;
	    }
	    i++;
	}
	i=0;
	while (i<word.length()) {
	    board[r+i][c+i]=word.charAt(i);
	    i++;
	}
	return true;
    }

    public boolean addWordBLeft(int r, int c, String word) {
	int i;
	int j;

	i=0;
	while (i<word.length()) {
	    try {
		if (board[r+i][c-i] != '-' && board[r+i][c-i]!=word.charAt(i)) {
		    return false; 
		}
	    } catch (Exception e) {
		System.out.println(e);
		return false;
	    }
	    i++;
	}
	i=0;
	while (i<word.length()) {
	    board[r+i][c-i]=word.charAt(i);
	    i++;
	}
	return true;
    }

    public boolean addWordTRight(int r, int c, String word) {
	int i;
	int j;

	i=0;
	while (i<word.length()) {
	    try {
		if (board[r-i][c+i] != '-' && board[r-i][c+i]!=word.charAt(i)) {
		    return false; 
		}
	    } catch (Exception e) {
		System.out.println(e);
		return false;
	    }
	    i++;
	}
	i=0;
	while (i<word.length()) {
	    board[r-i][c+i]=word.charAt(i);
	    i++;
	}
	return true;
    }

    public boolean addWordTLeft(int r, int c, String word) {
	int i;
	int j;

	i=0;
	while (i<word.length()) {
	    try {
		if (board[r-i][c-i] != '-' && board[r-i][c-i]!=word.charAt(i)) {
		    return false; 
		}
	    } catch (Exception e) {
		System.out.println(e);
		return false;
	    }
	    i++;
	}
	i=0;
	while (i<word.length()) {
	    board[r-i][c-i]=word.charAt(i);
	    i++;
	}
	return true;
    }

    public void fillAll () {
	
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


}
