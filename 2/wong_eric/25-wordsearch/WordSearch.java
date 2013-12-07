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

    public boolean addWordH (int r, int c, String word, String dir) {
	if (dir.equals("right")) {
	    if ((board[r].length - c) < word.length()){
		return false;
	    }
	    else {	
		for (int i=0;i<word.length();i++) {
		    if (!(word.charAt(i) == board[r][c+i] || board[r][c+i]=="-".charAt(0)))
			return false;
		}
	    }
	    for (int i=0;i<word.length();i++) {
		board[r][c+i] = word.charAt(i);
	    }
	    return true;
	}
	else if (dir.equals("left")) {
	    if (c < word.length()){
		return false;
	    }
	    else {	
		for (int i=0;i<word.length();i++) {
		    if (!(word.charAt(i) == board[r][c-i] || board[r][c-i]=="-".charAt(0)))
			return false;
		}
	    }
	    for (int i=0;i<word.length();i++) {
		board[r][c-i] = word.charAt(i);
	    }
	    return true;
	}
	else {
	    System.out.println("Please put right or left.");
	    return false;
	}
    }

    public boolean addWordV (int r, int c, String word, String dir) {
	if (dir.equals("up")) {
	    if (r < word.length()){
		return false;
	    }
	    else {	
		for (int i=0;i<word.length();i++) {
		    if (!(word.charAt(i) == board[r-i][c] || board[r-i][c] == "-".charAt(0)))
			return false;
		}
	    }
	    for (int i=0;i<word.length();i++) {
		System.out.println("assign");
		board[r-i][c] = word.charAt(i);
	    }
	    return true;
	}
	else if (dir.equals("down")) {
	    if (board.length-r < word.length()){
		return false;
	    }
	    else {	
		for (int i=0;i<word.length();i++) {
		    if (!(word.charAt(i) == board[r+i][c] || board[r+i][c]=="-".charAt(0)))
			return false;
		}
	    }
	    for (int i=0;i<word.length();i++) {
		board[r+i][c] = word.charAt(i);
	    }
	    return true;
	}
	else {
	    System.out.println("Please type up or down");
	    return false;
	}
    }

    public boolean addWordD (int r, int c, String word, String dir) {
	if (dir.equals("up right")) {
	    if (r < word.length() && board[r].length - c < word.length()) {
		return false;
	    }
	    else {	
		for (int i=0;i<word.length();i++) {
		    if (!(word.charAt(i) == board[r-i][c+i] || board[r-i][c+i]=="-".charAt(0)))
			return false;
		}
	    }
	    for (int i=0;i<word.length();i++) {
		board[r-i][c+i] = word.charAt(i);
	    }
	    return true;
	}
	else if (dir.equals("down right")) {
	    if (board.length - r < word.length() && board[r].length - c < word.length()) {
		return false;
	    }
	    else {	
		for (int i=0;i<word.length();i++) {
		    if (!(word.charAt(i) == board[r+i][c+i] || board[r+i][c+i]=="-".charAt(0)))
			return false;
		}
	    }
	    for (int i=0;i<word.length();i++) {
		board[r+i][c+i] = word.charAt(i);
	    }
	    return true;
	}
	else if (dir.equals("up left")) {
	    if (r < word.length() && c < word.length()) {
		return false;
	    }
	    else {	
		for (int i=0;i<word.length();i++) {
		    if (!(word.charAt(i) == board[r-i][c-i] || board[r-i][c-i]=="-".charAt(0)))
			return false;
		}
	    }
	    for (int i=0;i<word.length();i++) {
		board[r-i][c-i] = word.charAt(i);
	    }
	    return true;
	}
	else if (dir.equals("down left")) {
	    if (board.length - r < word.length() && c < word.length()) {
		return false;
	    }
	    else {	
		for (int i=0;i<word.length();i++) {
		    if (!(word.charAt(i) == board[r+i][c-i] || board[r+i][c-i]=="-".charAt(0)))
			return false;
		}
	    }
	    for (int i=0;i<word.length();i++) {
		board[r+i][c-i] = word.charAt(i);
	    }
	    return true;
	}
	else {
	    System.out.println("Please type up right, up left, down right, or down left");
	    return false;
	}
    }

    public char randomLetter() {
	Random r = new Random();
	return (char)(r.nextInt(25)+97);
    }

    public void fillUp() {
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		if (board[i][j]=="-".charAt(0))
		    board[i][j] = randomLetter();
	    }
	}
    }
}
