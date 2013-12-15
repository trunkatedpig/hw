import java.util.*;
import java.io.*;

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
    
    public boolean addWordHR(int r, int c, String word) {
	int i = 0;
	while (i<word.length()) {
	    try {
		if ( board[r][c+i] != '-' && board[r][c+i]!=word.charAt(i)) {
		    return false; 
		}
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		return false;  
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

    public boolean addWordHL(int r, int c, String word) {
	int i = 0;
	while (i<word.length()) {
	    try {
		if ( board[r][c-i] != '-' && board[r][c-i]!=word.charAt(i)) {
		    return false; 
		}
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		return false;  
	    }
	    i++;
	}
    

        /* if we get here, we can add the word */
        i=0;
        while (i<word.length()) {
            board[r][c-i]=word.charAt(i);
            i++;
        }
        
        return true;
    }

     public boolean addWordVU(int r, int c, String word) {
	int i = 0;
	while (i<word.length()) {
	    try {
		if ( board[r-i][c] != '-' && board[r-i][c]!=word.charAt(i)) {
		    return false; 
		}
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		return false;  
	    }
	    i++;
	}
    

        /* if we get here, we can add the word */
        i=0;
        while (i<word.length()) {
            board[r-i][c]=word.charAt(i);
            i++;
        }
        
        return true;
     }

      public boolean addWordVD(int r, int c, String word) {
	int i = 0;
	while (i<word.length()) {
	    try {
		if ( board[r+i][c] != '-' && board[r+i][c]!=word.charAt(i)) {
		    return false; 
		}
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                    return false;  
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

     public boolean addWordDRD(int r, int c, String word) {
	int i = 0;
	while (i<word.length()) {
	    try {
		if ( board[r+i][c+i] != '-' && board[r+i][c+i]!=word.charAt(i)) {
		    return false; 
		}
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		return false;  
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

    public boolean addWordDLD(int r, int c, String word) {
	int i = 0;
	while (i<word.length()) {
	    try {
		if ( board[r+i][c-i] != '-' && board[r+i][c-i]!=word.charAt(i)) {
		    return false; 
		}
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		return false;  
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

     public boolean addWordDRU(int r, int c, String word) {
	int i = 0;
	while (i<word.length()) {
	    try {
		if ( board[r-i][c+i] != '-' && board[r-i][c+i]!=word.charAt(i)) {
		    return false; 
		}
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		return false;  
	    }
	    i++;
	}
    

        /* if we get here, we can add the word */
        i=0;
        while (i<word.length()) {
            board[r-i][c+i]=word.charAt(i);
            i++;
        }
        
        return true;
     }

     public boolean addWordDLU(int r, int c, String word) {
	int i = 0;
	while (i<word.length()) {
	    try {
		if ( board[r-i][c-i] != '-' && board[r-i][c-i]!=word.charAt(i)) {
		    return false; 
		}
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		return false;  
	    }
	    i++;
	}
    

        /* if we get here, we can add the word */
        i=0;
        while (i<word.length()) {
            board[r-i][c-i]=word.charAt(i);
            i++;
        }
        
        return true;
     }

    /*public void fillIn(){
	Random r = new Random();
	for(int i = 0; i < board.length; i ++){
	    for(int j = 0; j < board[i].length; j ++){
		if(board[i][j] == '-'){
		    int y =  r.nextInt(26) + 92;
		    board[i][j] = char(y);
		}
	    }
	}
    }
    Doesn't work because replaces - with non-letters such as ^ / etc.
    */

   


}




