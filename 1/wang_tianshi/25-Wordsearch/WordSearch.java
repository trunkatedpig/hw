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

    public boolean addWordH(int row, int col, String word){
        boolean empty = true;
        if ((row>20 || row<0) || (col>20 || col<0))
         return false;
        int l = word.length();
        if (col+l>board[row].length){
         return false;
        }
        for (int i=0; i<l; i++){
         if ((board[row][col+i] != ('-')) &&
                (board[row][col+i] != (word.charAt(i))))
                    empty = false;
        }
        if (empty){
         for (int j=0;j<word.length();j++){
                board[row][col+j]=word.charAt(j);
         }
        }
        return empty;
    }

    public boolean addWordHB(int row, int col, String word){
        boolean empty = true;
        if ((row>20 || row<0) || (col>20 || col<0))
         return false;
        int l = word.length();
        if (col-l+1<0){
         return false;
        }
        for (int i=0; i<l; i++){
         if ((board[row][col-i] != ('-')) &&
                (board[row][col-i] != (word.charAt(i))))
                    empty = false;
        }
        if (empty){
         for (int j=0;j<word.length();j++){
                board[row][col-j]=word.charAt(j);
         }
        }
        return empty;
    }

    public boolean addWordV(int row, int col, String word){
        boolean empty = true;
        if ((row>20 || row<0) || (col>20 || col<0))
         return false;
        int l = word.length();
        if (row+l>board.length){
         return false;
        }
        for (int i=0; i<l; i++){
         if ((board[row+i][col] != ('-')) &&
                (board[row+i][col] != (word.charAt(i))))
                    empty = false;
        }
        if (empty){
         for (int j=0;j<word.length();j++){
                board[row+j][col]=word.charAt(j);
         }
        }
        return empty;
    }

    public boolean addWordVB(int row, int col, String word){
        boolean empty = true;
        if ((row>20 || row<0) || (col>20 || col<0))
         return false;
        int l = word.length();
        if (row-l+1<0){
         return false;
        }
        for (int i=0; i<l; i++){
         if ((board[row-i][col] != ('-')) &&
                (board[row-i][col] != (word.charAt(i))))
                    empty = false;
        }
        if (empty){
         for (int j=0;j<word.length();j++){
                board[row-j][col]=word.charAt(j);
         }
        }
        return empty;
    }
        
    public boolean addWordDDR(int row, int col, String word){
        boolean empty = true;
        if ((row>20 || row<0) || (col>20 || col<0))
         return false;
        int l = word.length();
        if (row+l>board.length || col+l>board.length){
         return false;
        }
        for (int i=0; i<l; i++){
         if ((board[row+i][col+i] != ('-')) &&
                (board[row+i][col+i] != (word.charAt(i))))
                    empty = false;
        }
        if (empty){
         for (int j=0;j<word.length();j++){
                board[row+j][col+j]=word.charAt(j);
         }
        }
        return empty;
    }

    public boolean addWordDUR(int row, int col, String word){
        boolean empty = true;
        if ((row>20 || row<0) || (col>20 || col<0))
         return false;
        int l = word.length();
        if (row-l+1<0 || col+l>board.length){
         return false;
        }
        for (int i=0; i<l; i++){
         if ((board[row-i][col+i] != ('-')) &&
                (board[row-i][col+i] != (word.charAt(i))))
                    empty = false;
        }
        if (empty){
         for (int j=0;j<word.length();j++){
                board[row-j][col+j]=word.charAt(j);
         }
        }
        return empty;
    }

   public boolean addWordDDL(int row, int col, String word){
        boolean empty = true;
        if ((row>20 || row<0) || (col>20 || col<0))
         return false;
        int l = word.length();
        if (row+l>board.length || col-l+1<0){
         return false;
        }
        for (int i=0; i<l; i++){
         if ((board[row+i][col-i] != ('-')) &&
                (board[row+i][col-i] != (word.charAt(i))))
                    empty = false;
        }
        if (empty){
         for (int j=0;j<word.length();j++){
                board[row+j][col-j]=word.charAt(j);
         }
        }
        return empty;
    }

    public boolean addWordDUL(int row, int col, String word){
        boolean empty = true;
        if ((row>20 || row<0) || (col>20 || col<0))
         return false;
        int l = word.length();
        if (row-l+1<0 || col-l+1<0){
         return false;
        }
        for (int i=0; i<l; i++){
         if ((board[row-i][col-i] != ('-')) &&
                (board[row-i][col-i] != (word.charAt(i))))
                    empty = false;
        }
        if (empty){
         for (int j=0;j<word.length();j++){
                board[row-j][col-j]=word.charAt(j);
         }
        }
        return empty;
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
