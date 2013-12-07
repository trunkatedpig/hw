import java.util.*;

public class WordSearch {
    private int rows, cols;
    private char[][] board;

    public WordSearch(int rows, int cols) {
        board = new char[rows][cols];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                board[i][j]='-';
            }
        }
        this.rows = rows;
        this.cols = cols;
    }

    public WordSearch() {
        this(20,20);
    }
    
    public boolean addWordV(int row, int col, String word){
        
        if(row<0||col<0||col>cols||row>rows||col+word.length() > cols){
         return false;
        }
        
        for (int rowAdd = 0;
         rowAdd < word.length();
         rowAdd++){
        
         if (board[row][col + rowAdd] != -'-' && board[row][col + rowAdd] != word.charAt(rowAdd)){
                
                return false;
         }
        }
        for (int i = 0; i<word.length();i++){
         board[row][col + i] = word.charAt(i);
        }
        return true;
    }
    

    public boolean addWordH(int row, int col, String word){
        if(row<0||col>cols||col<0||row+word.length()>rows){
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

 public boolean addWordHB(int row, int col, String word){
        if(row<0||col>cols||col<0||row+word.length()>rows){
            return false;
        }
        
        for(int i = 0; i<word.length();i++) {
            if(board[row][col-i] != '-'&& board[row][col-i] != word.charAt(i)){
                return false;
            }
        }
        
        for(int i = 0; i<word.length();i++) {
            board[row][col-i] = word.charAt(word.length-i-1);
        }
        return true;
    }
    
    public boolean addWordVB(int row, int col, String word){
        
        if(row<0||col<0||col>cols||row>rows||col+word.length() > cols){
         return false;
        }
        
        for (int rowAdd = 0;
         rowAdd < word.length();
         rowAdd++){
        
         if (board[row][col - rowAdd] != -'-' && board[row][col - rowAdd] != word.charAt(rowAdd)){
                
                return false;
         }
        }
        for (int i = 0; i<word.length();i++){
         board[row][col - i] = word.charAt(word.length- i - 1);
        }
        return true;
    }
    
    public boolean addWordDiagonal(int row, int col, String word, String orientation){
	
	if (orientation.equals("NE") || orientation.equals("Northeast")){
	    //subtract both
	    if(row<0||col<0||col>cols||row>rows||col+word.length() > cols){
		return false;
	    }
	    
	    for (int i = 0;
		 i < word.length();
		 i++){
		
		if (board[row - i][col - i] != -'-' && board[row - i][col - i] != word.charAt(rowAdd)){
                
		    return false;
		}	
		
		
 
	
	


}