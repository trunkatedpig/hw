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

    public boolean addWordForwardH(int row, int col, String word){
		int length = word.length();
		int rowSize = board[0].length;

		//If the word is off the board or partly off the board
		if ( col < 0 || col > rowSize || col + length >=rowSize)
		    return false;

		//If the place where the word would go has other letters that don't match
		int n = 0;
		for (int i=col;i<col+length;i++){
			if (board[row][i] != '-' && board[row][i] != word.charAt(n))
				return false;
			n++;
		}

		//Add word
		n = 0;
		for (int i=col;i<col+length;i++){
			board[row][i] = word.charAt(n);
			n++;
		}

		return true;
    }

    public boolean addWordBackwardH(int row, int col, String word){
	int length = word.length();
	int rowSize = board[0].length;
	
	//If the word is off the board or partly off the board
	if ( col < 0 || col > rowSize || col + length >=rowSize)
	    return false;
	
	//If the place where the word would go has other letters that don't match
	int n = length-1;
	for (int i=col;i<col+length;i++){
	    if (board[row][i] != '-' && board[row][i] != word.charAt(n))
		return false;
	    n--;
	}
	
	//Add word
	n = length-1;
	for (int i=col;i<col+length;i++){
	    board[row][i] = word.charAt(n);
	    n--;
	}
	
	return true;
    }

    public boolean addWordForwardV(int row, int col, String word){
	int length = word.length();
	int colSize = board.length;
	
	//If the word is off the board or partly off the board
	if ( row < 0 || row > colSize || row + length >=colSize)
	    return false;

	//If the place where the word would go has other letters that don't match
	int n=0;
	for (int i=row; i<row+length;i++){
	    if (board[i][col] != '-' && board[i][col] != word.charAt(n))
		return false;
	    n++;
	}

	//Add word
	n = 0;
	for (int i=row;i<row+length;i++){
	    board[i][col] = word.charAt(n);
	    n++;
	}

	return true;
    }

    public boolean addWordBackwardV(int row, int col, String word){
	int length = word.length();
	int colSize = board.length;
	
	//If the word is off the board or partly off the board
	if ( row < 0 || row > colSize || row + length >=colSize)
	    return false;
	
	//If the place where the word would go has other letters that don't match
	int n=length-1;
	for (int i=row; i<row+length;i++){
	    if (board[i][col] != '-' && board[i][col] != word.charAt(n))
		return false;
	    n--;
	}
	
	//Add word
	n = length-1;
	for (int i=row;i<row+length;i++){
	    board[i][col] = word.charAt(n);
	    n--;
	}
	
	return true;
    }

    public boolean addWordForwardD(int row, int col, String word){
	int length = word.length();
	int rowSize = board[0].length;
	int colSize = board.length;
	
	//If the word is off the board or partly off the board
	if ( col < 0 || col > rowSize || col + length >=rowSize)
	    return false;
	
	//If the place where the word would go has other letters that don't match
	int n=0;
	int r=row;
	for (int i=col; i<col+length;i++){
	    if (board[r][i] != '-' && board[r][i] != word.charAt(n))
		return false;
	    n++;
	    r++;
	}
	
	//Add word
	n = 0;
	r = row;
	for (int i=col;i<col+length;i++){
	    board[r][i] = word.charAt(n);
	    n++;
	    r++;
	}
	
	return true;
    }

 public boolean addWordBackwardD(int row, int col, String word){
	int length = word.length();
	int rowSize = board[0].length;
	int colSize = board.length;
	
	//If the word is off the board or partly off the board
	if ( col < 0 || col > rowSize || col + length >=rowSize)
	    return false;
	
	//If the place where the word would go has other letters that don't match
	int n=length-1;
	int r=row;
	for (int i=col; i<col+length;i++){
	    if (board[r][i] != '-' && board[r][i] != word.charAt(n))
		return false;
	    n--;
	    r++;
	}
	
	//Add word
	n = length-1;
	r = row;
	for (int i=col;i<col+length;i++){
	    board[r][i] = word.charAt(n);
	    n--;
	    r++;
	}
	
	return true;
    }

}
