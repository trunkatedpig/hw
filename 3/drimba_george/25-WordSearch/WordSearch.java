import java.util.*;

public class WordSearch {
    private int rows, columns;
    private char[][] board;

    public WordSearch(int rows, int columns) {
        board = new char[rows][columns];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<columns;j++) {
                board[i][j]='$';
            }
        }
        this.rows = rows;
        this.columns = columns;
    }

    public WordSearch() {
        this(20,20);
    }
    
    public boolean addWordH(int row, int col, String word){
        if(row<0||col>columns||col<0||row+word.length()>rows){
            return false;
        }
        
        for(int i = 0; i<word.length();i++) {
            if(board[row][col+i] != '-'&& board[row][col+i] != word.charAt(i)){
                return false;
            }
        }
        
        for(int i = 0; i<word.length();i++) {
            board[row][col+i] = word.charAt(i);
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