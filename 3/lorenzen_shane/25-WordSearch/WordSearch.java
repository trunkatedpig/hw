import java.util.*;

public class WordSearch {
    private char[][] board;
    private int numRows, numCols;
    
    Scanner s = new Scanner(new File("words"));
    

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
	    }
	}
	this.numRows = rows;
	this.numCols = cols;
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
    public boolean addWordH(int row, int col, String word){
	int i,j;
	if (row < 0 || col < 0 || col > numCols || row + word.length() > numRows){
	    return false;
	} 
	for (i = 0; i < word.length(); i++){
	    if (board[row][col+i] != '-' && board[row][col+i] != word.charAt(i)){
		return false;
	    }
	}
	for (j = 0; j < word.length(); j++){
	    board[row][col+j] = word.charAt(j);
	}
	return true;
    }

    public boolean addWordV(int row, int col, String word){
	int i,j;               
	if (row < 0 || col < 0 || col > numCols || col + word.length() > numCols){
	    return false;
	} 
	for (i = 0; i < word.length(); i++){
	    if (board[row+i][col] != '-' && board[row+i][col] != word.charAt(i)){
		return false;
	    }
	}
	for (j = 0; j < word.length(); j++){
	    board[row+j][col] = word.charAt(j);
	}
	return true;
    }

    public boolean backAddWordH(int row, int col, String word){
	int i,j;
	if (row < 0 || col < 0 || col > numCols || row - word.length() < 0){
	    return false;
	} 
	for (i = 0; i < word.length(); i++){
	    if (board[row][col-i] != '-' && board[row][col-i] != word.charAt(i)){
		return false;
	    }
	}
	for (j = 0; j < word.length(); j++){
	    board[row][col-j] = word.charAt(j);
	}
	return true;
    }

    public boolean backAddWordV(int row, int col, String word){
	int i,j;
	if (row < 0 || col < 0 || col > numCols || col - word.length() < 0){
	    return false;
	} 
	for (i = 0; i < word.length(); i++){
	    if (board[row-i][col] != '-' && board[row-i][col] != word.charAt(i)){
		return false;
	    }
	}
	for (j = 0; j < word.length(); j++){
	    board[row-j][col] = word.charAt(j);
	}
	return true;
    }

    public boolean diagSEaddWordH(int row, int col, String word){
	int i,j;
	if (row < 0 || col < 0 || col > numCols || row + word.length() > numRows || col + word.length() > numCols){
	    return false;
	} 
	for (i = 0; i < word.length(); i++){
	    if (board[row+i][col+i] != '-' && board[row+i][col+i] != word.charAt(i)){
		return false;
	    }
	}
	for (j = 0; j < word.length(); j++){
	    board[row+j][col+j] = word.charAt(j);
	}
	return true;
    }

    public boolean diagNEaddWordH(int row, int col, String word){
        int i,j;
        if (row < 0 || col < 0 || col > numCols || row - word.length() < 0 || col + word.length() > numCols){
            return false;
        }
        for (i = 0; i < word.length(); i++){
            if (board[row-i][col+i] != '-' && board[row-i][col+i] != word.charAt(i)){
                return false;
            }
        }
        for (j = 0; j < word.length(); j++){
            board[row-j][col+j] = word.charAt(j);
        }
        return true;
    }

    public boolean diagNWaddWordH(int row, int col, String word){
        int i,j;
        if (row < 0 || col < 0 || col > numCols || row - word.length() < 0 || col - word.length() < 0){
            return false;
        }
        for (i = 0; i < word.length(); i++){
            if (board[row-i][col-i] != '-' && board[row-i][col-i] != word.charAt(i)){
                return false;
            }
        }
        for (j = 0; j < word.length(); j++){
            board[row-j][col-j] = word.charAt(j);
        }
        return true;
    }

    public boolean diagSWaddWordH(int row, int col, String word){
        int i,j;
        if (row < 0 || col < 0 || col > numCols || row + word.length() > numRows || col - word.length() < 0){
            return false;
        }
        for (i = 0; i < word.length(); i++){
            if (board[row+i][col-i] != '-' && board[row+i][col-i] != word.charAt(i)){
                return false;
            }
        }
        for (j = 0; j < word.length(); j++){
            board[row+j][col-j] = word.charAt(j);
        }
        return true;
    }
    
    public void fillOutBoard(){
	String letters = "abcdefghijklmnopqrstuvwxyz";
	Random Rand = new Random();
	for (int i = 0; i < numRows; i++){
	    for (int j = 0; j < numCols; j++){
		if (board[i][j] ==  '-'){
		    board[i][j] =  letters.charAt(Rand.nextInt(26));
		}
	    }
	}
    }
}
