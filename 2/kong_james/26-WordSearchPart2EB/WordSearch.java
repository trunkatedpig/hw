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

    public boolean addWordHR(int row, int col, String word) {

        
        // see if we can add the word
        for (int i=0;i<word.length();i++) {
         try {
                if (board[row][col+i]!='-' && board[row][col+i]!=word.charAt(i)) {
                 return false;
                }
         } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array problem: "+e);
                return false; // return false since we can't add the word - we're out of bounds
         }  
        }
        for (int i=0;i<word.length();i++) {
         board[row][col+i]=word.charAt(i);
         }
    return true;
    }

   public boolean addWordHL(int row, int col, String word) {

        // see if we can add the word
        for (int i=0;i<word.length();i++) {
         try {
                if (board[row][col-i]!='-' && board[row][col-i]!=word.charAt(i)) {
                 return false;
                }
         } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array problem: "+e);
                return false; // return false since we can't add the word - we're out of bounds
         }  
        }
        for (int i=0;i<word.length();i++) {
         board[row][col-i]=word.charAt(i);
         }
    return true;
    }

    public boolean addWordVD(int row, int col, String word) {

        
        // see if we can add the word
        for (int i=0;i<word.length();i++) {
         try {
	     if (board[row + i][col]!='-' && board[row+i][col]!=word.charAt(i)) {
                 return false;
                }
         } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array problem: "+e);
                return false; // return false since we can't add the word - we're out of bounds
         }  
        }
        for (int i=0;i<word.length();i++) {
         board[row+i][col]=word.charAt(i);
         }
    return true;
    }
    public boolean addWordVU(int row, int col, String word) {

        
        // see if we can add the word
        for (int i=0;i<word.length();i++) {
         try {
	     if (board[row - i][col]!='-' && board[row-i][col]!=word.charAt(i)) {
                 return false;
                }
         } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array problem: "+e);
                return false; // return false since we can't add the word - we're out of bounds
         }  
        }
        for (int i=0;i<word.length();i++) {
         board[row-i][col]=word.charAt(i);
         }
    return true;
    }
    public boolean addWordRD(int row, int col, String word) {
	
        
        // see if we can add the word
        for (int i=0;i<word.length();i++) {
	    try {
		if (board[row + i][col+i]!='-' && board[row+i][col+i]!=word.charAt(i)) {
                 return false;
                }
	    } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array problem: "+e);
                return false; // return false since we can't add the word - we're out of bounds
	    }  
        }
        for (int i=0;i<word.length();i++) {
	    board[row+i][col+i]=word.charAt(i);
	}
	return true;
    }
     public boolean addWordRU(int row, int col, String word) {

        
        // see if we can add the word
        for (int i=0;i<word.length();i++) {
         try {
	     if (board[row - i][col+i]!='-' && board[row-i][col+i]!=word.charAt(i)) {
                 return false;
                }
         } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array problem: "+e);
                return false; // return false since we can't add the word - we're out of bounds
         }  
        }
        for (int i=0;i<word.length();i++) {
         board[row-i][col+i]=word.charAt(i);
         }
    return true;
    }
     public boolean addWordLD(int row, int col, String word) {

        
        // see if we can add the word
        for (int i=0;i<word.length();i++) {
         try {
	     if (board[row + i][col-i]!='-' && board[row+i][col-i]!=word.charAt(i)) {
                 return false;
                }
         } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array problem: "+e);
                return false; // return false since we can't add the word - we're out of bounds
         }  
        }
        for (int i=0;i<word.length();i++) {
         board[row+i][col-i]=word.charAt(i);
         }
    return true;
    }
     public boolean addWordLU(int row, int col, String word) {

        
        // see if we can add the word
        for (int i=0;i<word.length();i++) {
         try {
	     if (board[row - i][col-i]!='-' && board[row-i][col-i]!=word.charAt(i)) {
                 return false;
                }
         } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array problem: "+e);
                return false; // return false since we can't add the word - we're out of bounds
         }  
        }
        for (int i=0;i<word.length();i++) {
         board[row-i][col-i]=word.charAt(i);
         }
    return true;
    }
    
    public void init(){
	for(int i=0;i<board[row].length;i++)
	    for(int j=0;j<board[row][col].length;j++)
		if(board[i][j]=='-'){
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