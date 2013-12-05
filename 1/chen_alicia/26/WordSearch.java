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
        /* see if we can place the word */
        i=0;
	while (i<word.length()) {
	    try {
		if ( board[r][c+i] != '-' && board[r][c+i]!=word.charAt(i)) {
		    return false; // we return false since we can't add the word
		}
	    } catch (ArrayIndexOutOfBoundsException e) { // Handle the array one
		System.out.println(e);
		return false; // we return false since we can't add the word
	    } 
	    i++;
	}
        /* if we get here, we can add the word */
        i=0;
        while (i<word.length()) {
	    board[r][c+i]=word.charAt(i);
	    i++;
        }
        return true;
    }

    public boolean addWordV(int r, int c, String word){
	int i;
        /* see if we can place the word */
        i=0;
	while (i<word.length()) {
	    try {
		if ( board[r+i][c] != '-' && board[r+i][c]!=word.charAt(i)) {
		    return false; // we return false since we can't add the word
		}
	    } catch (ArrayIndexOutOfBoundsException e) { // Handle the array one
		System.out.println(e);
		return false; // we return false since we can't add the word
	    } 
	    i++;
	}
        /* if we get here, we can add the word */
        i=0;
        while (i<word.length()) {
	    board[r+i][c]=word.charAt(i);
	    i++;
        }
        return true;
    }

    public String reverse (String word){
	String result = "";
	for (int i = word.length(); i > 0; i--){
	    result = result +("" +  word.charAt(i-1));
	}
	return result;
    }

    public boolean addWordHBackwards (int r, int c, String word){
	word = reverse(word);
	return addWordH (r,c,word);
    }

    public boolean addWordVBackwards (int r, int c, String word){
	word = reverse(word);
	return addWordV (r,c,word);
    }

 public boolean addWordDSE(int r, int c, String word) {
        int i;
        /* see if we can place the word */
        i=0;
	while (i<word.length()) {
	    try {
		if ( board[r+i][c+i] != '-' && board[r+i][c+i]!=word.charAt(i)) {
		    return false; // we return false since we can't add the word
		}
	    } catch (ArrayIndexOutOfBoundsException e) { // Handle the array one
		System.out.println(e);
		return false; // we return false since we can't add the word
	    } 
	    i++;
	}
        /* if we get here, we can add the word */
        i=0;
        while (i<word.length()) {
	    board[r+i][c+i]=word.charAt(i);
	    i++;
        }
        return true;
    }

    public boolean addWordDNW(int r, int c, String word){
	word= reverse(word);
	return addWordDSE(r,c,word);
    }

    public boolean addWordDSW (int r, int c, String word){
	int i;
        /* see if we can place the word */
        i=0;
	while (i<word.length()) {
	    try {
		if ( board[r+i][c-i] != '-' && board[r+i][c-i]!=word.charAt(i)) {
		    return false; // we return false since we can't add the word
		}
	    } catch (ArrayIndexOutOfBoundsException e) { // Handle the array one
		System.out.println(e);
		return false; // we return false since we can't add the word
	    } 
	    i++;
	}
        /* if we get here, we can add the word */
        i=0;
        while (i<word.length()) {
	    board[r+i][c-i]=word.charAt(i);
	    i++;
        }
        return true;
    }

    public boolean addWordDNE(

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