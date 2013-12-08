import java.util.*;
public class WordSearch {

    private char[][] board;
    private int rows, cols;

    public WordSearch(int r, int c) {
        board = new char[r][c];
	rows = r;
	cols = c;
        for (int i=0;i<r;i++)
         for (int j=0;j<c;j++)
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

    public boolean insertWordH(int row, int col, String word){
	if (row < 0 || col < 0)
	    return false;
	if (row  >= rows || col + word.length() >= cols)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row][col + j] != '-' && word.charAt(j) != board[row][col + j])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row][col + i] = word.charAt(i);
	}
	return true;
    }

    public boolean insertWordV (int row, int col, String word){
	if(row < 0 || col < 0)
	    return false;
	if (col  >= cols || row + word.length() >= rows)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row + j][col] != '-' && word.charAt(j) != board[row + j][col])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row + i][col] = word.charAt(i);
	}
	return true;
    }

    public boolean insertWordVback (int row, int col, String word){
	if(row < 0 || col < 0)
	    return false;
	if (col  >= cols || row + word.length() >= rows)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row + word.length()- j][col] != '-' && word.charAt(j) != board[row + word.length() - j][col])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row + word.length() - i][col] = word.charAt(i);
	}
	return true;
    }

       public boolean insertWordHback(int row, int col, String word){
	if (row < 0 || col < 0)
	    return false;
	if (row  >= rows || col + word.length() >= cols)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row][col + word.length() - j] != '-' && word.charAt(j) != board[row][col + word.length() - j])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row][col + word.length() - i] = word.charAt(i);
	}
	return true;
    }

   public boolean insertWordDdr (int row, int col, String word){
	if(row < 0 || col < 0)
	    return false;
	if (col + word.length() >= cols || row + word.length() >= rows)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row + j][col + j] != '-' && word.charAt(j) != board[row + j][col + j])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row + i][col + i] = word.charAt(i);
	}
	return true;
    }

 public boolean insertWordDur (int row, int col, String word){
	if(row < 0 || col < 0)
	    return false;
	if (col + word.length() >= cols || row + word.length() >= rows)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row - j][col + j] != '-' && word.charAt(j) != board[row - j][col + j])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row - i][col + i] = word.charAt(i);
	}
	return true;
    }

    public boolean insertWordDdl (int row, int col, String word){
	if(row < 0 || col < 0)
	    return false;
	if (col + word.length() >= cols || row + word.length() >= rows)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row + j][col - j] != '-' && word.charAt(j) != board[row + j][col - j])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row + i][col - i] = word.charAt(i);
	}
	return true;
    }

     public boolean insertWordDul (int row, int col, String word){
	if(row < 0 || col < 0)
	    return false;
	if (col + word.length() >= cols || row + word.length() >= rows)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row - j][col - j] != '-' && word.charAt(j) != board[row - j][col - j])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row - i][col - i] = word.charAt(i);
	}
	return true;
    }
    
    public void fillPuzzle (){
	Random r = new Random ();
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		if (board[i][j] == '-')
		 board[i][j] = (char)(r.Random(26)) + 'a';
	     
         }
	}
    }
}