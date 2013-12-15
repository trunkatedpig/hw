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

    public boolean checkBoardD(int row, int col, String word, int iR, int jR) { //iR is for rows, jR is for cols
	for (int i=row, j=col, x=0; x<word.length(); i=i+iR, j=j+jR, x++) {
	    char c = board[i][j];
	    if (c != word.charAt(x) && c != '-')
		return false;
	}
	return true;
    }


    public boolean checkBoardH(int row, int col, String word, int iR) {
	for (int i=0; Math.abs(i)<word.length(); i=i+iR) {
	    char c = board[row][col+i];
	    if (c != word.charAt(Math.abs(i)) && c != '-')
		return false;
	}
	return true;
    }

    public boolean checkBoardV(int row, int col, String word, int iR) {
	for (int i=0; Math.abs(i)<word.length(); i=i+iR) {
	    char c = board[row+i][col];
	    if (c != word.charAt(Math.abs(i)) && c != '-')
		return false;
	}
	return true;
    }

    public boolean addWordH(int row, int col, String word, int iR) {
	boolean boundaries;

	if (iR == 1)
	    boundaries = row < board.length && row >= 0 && col >= 0 &&  col + word.length() <= board[0].length;
	else if (iR == -1)
	    boundaries = row < board.length && row >= 0 && col < board[0].length && col - word.length() + 1 >= 0;
	else
	    return false;

	if (boundaries) {
	    if (checkBoardH(row, col, word, iR)) {
		for (int i=0; Math.abs(i)<word.length(); i=i+iR)
		    board[row][col + i] = word.charAt(Math.abs(i));
		return true;
	    }
	}
	
	return false;
    }

    public boolean addWordV(int row, int col, String word, int iR) {
	boolean boundaries;

	if (iR == 1)
	    boundaries = col < board[0].length && row >= 0 && col >= 0 && row + word.length() <= board.length;
	else if (iR == -1)
	    boundaries = col < board[0].length && col >= 0 && row < board.length && row - word.length() + 1 >= 0;
	else
	    return false;

	if (boundaries) {
	    if (checkBoardV(row, col, word, iR)) {
		for (int i=0; Math.abs(i)<word.length(); i=i+iR)
		    board[row + i][col] = word.charAt(Math.abs(i));
		return true;
	    }
	}

	return false;
    }

    public boolean addWordD(int row, int col, String word, int iR, int jR) {
	boolean boundaries;

	if (iR == 1 && jR == 1)
	    boundaries = row >= 0 && col >= 0 && row + word.length() <= board.length && col + word.length() <= board[0].length;
	else if (iR == -1 && jR == 1)
	    boundaries = row - word.length() + 1 >= 0 && col >= 0 && row < board.length && col + word.length() <= board[0].length;
	else if (iR == 1 && jR == -1)
	    boundaries = row >= 0 && col - word.length() + 1 >= 0 && row + word.length() <= board.length && col < board[0].length;
	else if (iR == -1 && jR == -1)
	    boundaries = row - word.length() + 1 >= 0 && col - word.length() + 1 >= 0 && row < board.length && col < board[0].length;
	else
	    return false;

	if (boundaries) {
	    if (checkBoardD(row, col, word, iR, jR)) {
		for (int i=row, j=col, x=0; x<word.length(); i=i+iR, j=j+jR, x++)
		    board[i][j] = word.charAt(x);
		return true;
	    }
	}

	return false;
    }

    public void addWord(int row, int col, String word) {
	Random r = new Random();
	int x = r.nextInt(8);
	switch(x) {
	case 0:
	    addWordV(row, col, word, -1);
	case 1:
	    addWordD(row, col, word, -1, 1);
	case 2:
	    addWordH(row, col, word, 1);
	case 3:
	    addWordD(row, col, word, 1, 1);
	case 4:
	    addWordV(row, col, word, 1);
	case 5:
	    addWordD(row, col, word, 1, -1);
	case 6:
	    addWordH(row, col, word, -1);
	case 7:
	    addWordD(row, col, word, -1, -1);
	default:
	    System.out.println("ERROR");
	}
	System.out.println(toString());
    }

    /*public void fillIn() {
	char[][] w2 = Arrays.copyOf(board);
	Arrays.sort(w2);
	while (Arrays.binarySearch(w2, '-') == 0) {*/
	    
}
