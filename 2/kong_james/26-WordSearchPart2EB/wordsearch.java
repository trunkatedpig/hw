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

    public boolean addWordH(int row, int col, String word) {

        
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

    public boolean addWordV(int row, int col, String word) {

        
        // see if we can add the word
        for (int i=0;i<word.length();i++) {
         try {
                if (board[col][row+i]!='-' && board[col][row+i]!=word.charAt(i)) {
                 return false;
                }
         } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array problem: "+e);
                return false; // return false since we can't add the word - we're out of bounds
         }  
        }
        for (int i=0;i<word.length();i++) {
         board[col][row+i]=word.charAt(i);
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