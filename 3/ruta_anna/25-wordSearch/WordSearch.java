import java.util.*;

public class WordSearch {
    private char[][] board;
    int maxRow, maxCol;

    Random generator = new Random();

    public WordSearch(int rows, int cols) {
		maxRow = rows;
		maxCol = cols;
    	board = new char[rows][cols];
        for (int i=0; i<rows; i++) {
        	for (int j=0;j<cols;j++) {
                board[i][j]='-';
         	}
        }
    }

/*This calls the constructor above, setting rows and cols to 20*/
    public WordSearch() {
        this(20,20);
    }


/*Will test if its possible to horizontally, left-to-right, add the word
in the desired row and col, where row and col specify the location of the
first character in the word. If possible, the word will be added to gameboard*/
	public boolean addWordH(int row, int col, String word){
		if (row<0 || col<0|| row>maxRow || col+word.length()>maxCol)
			return false;
		for (int i=0; i<word.length(); i++){
			if (word.charAt(i) != board[row][col+i] && board[row][col+i] != '-')
				return false;
		}
		for (int j=0; j<word.length(); j++){
			board[row][col+j] = word.charAt(j);
		}
		return true;
	}

/*Will test if its possible to vertically, top-to-bottom, add the word in the
desired row and col, where row and col specify the location of the first
character in the word. If possible, the word will be added to gameboard*/
	public boolean addWordV(int row, int col, String word){
		if (row<0 || col<0|| col>maxCol || row+word.length()>maxRow)
			return false;
		for (int i=0; i<word.length(); i++){
			if (word.charAt(i) != board[row+i][col] && board[row+i][col] != '-')
				return false;
		}
		for (int j=0; j<word.length(); j++){
			board[row+j][col] = word.charAt(j);
		}
		return true;
	}

/*Will test if its possible to horizontally, right-to-elft, add the word
in the desired row and col, where row and col specify the location of the
last character in the word. If possible, the word will be added to gameboard*/
	public boolean addWordHRev(int row, int col, String word){
		if (row<0 || col<0|| row>maxRow || col+word.length()>maxCol)
			return false;
		for (int i=0; i<word.length(); i++){
			if (word.charAt(i) != board[row][col+word.length()-1-i] && board[row][col+word.length()-1-i] != '-')
				return false;
		}
		for (int j=0; j<word.length(); j++){
			board[row][col+word.length()-1-j] = word.charAt(j);
		}
		return true;
	}

/*Will test if its possible to vertically, bottom-to-top, add the word in the
desired row and col, where row and col specify the location of the last
character in the word. If possible, the word will be added to gameboard*/
	public boolean addWordVRev(int row, int col, String word){
		if (row<0 || col<0|| col>maxCol || row+word.length()>maxRow)
			return false;
		for (int i=0; i<word.length(); i++){
			if (word.charAt(i) != board[row+word.length()-1-i][col] && board[row+word.length()-1-i][col] != '-')
				return false;
		}
		for (int j=0; j<word.length(); j++){
			board[row+word.length()-1-j][col] = word.charAt(j);
		}
		return true;
	}

/*Will test if its possible to diagonally, topRight-to-bottomLeft, add the word in the
desired row and col, where row and col specify the location of the first
character in the word. If possible, the word will be added to gameboard*/
	public boolean addWordTRBL(int row, int col, String word){
		if (row<0 || col<0|| row+word.length()>maxRow || col+word.length()>maxCol)
			return false;
		for (int i=0; i<word.length(); i++){
			if (word.charAt(i) != board[row+i][col+i] && board[row+i][col+i] != '-')
				return false;
		}
		for (int j=0; j<word.length(); j++){
			board[row+j][col+j] = word.charAt(j);
		}
		return true;
	}

/*Will test if its possible to diagonally, bottomLeft-to-topRight, add the word in the
desired row and col, where row and col specify the location of the last
character in the word. If possible, the word will be added to gameboard*/
	public boolean addWordBLTR(int row, int col, String word){
		if (row<0 || col<0|| row+word.length()>maxRow || col+word.length()>maxCol)
			return false;
		for (int i=0; i<word.length(); i++){
			if (word.charAt(i) != board[row+word.length()-1-i][col+word.length()-1-i] && board[row+word.length()-1-i][col+word.length()-1-i] != '-')
				return false;
		}
		for (int j=0; j<word.length(); j++){
			board[row+word.length()-1-j][col+word.length()-1-j] = word.charAt(j);
		}
		return true;
	}

/*Will test if its possible to diagonally, topLeft-to-bottomRight, add the word in the
desired row and col, where row and col specify the location of the first
character in the word. If possible, the word will be added to gameboard*/
	public boolean addWordTLBR(int row, int col, String word){
			if (row<0 || col<0|| row+word.length()>maxRow || col>maxCol)
				return false;
			for (int i=0; i<word.length(); i++){
				if (word.charAt(i) != board[row+i][col-i] && board[row+i][col-i] != '-')
					return false;
			}
			for (int j=0; j<word.length(); j++){
				board[row+j][col-j] = word.charAt(j);
			}
			return true;
	}

/*Will test if its possible to diagonally, bottomRight-to-TopLeft, add the word in the
desired row and col, where row and col specify the location of the last
character in the word. If possible, the word will be added to gameboard*/
	public boolean addWordBRTL(int row, int col, String word){
		if (row<0 || col<0|| row+word.length()>maxRow || col>maxCol)
			return false;
		for (int i=0; i<word.length(); i++){
			if (word.charAt(i) != board[row+word.length()-1-i][col-word.length()+1+i] && board[row+word.length()-1-i][col-word.length()+1+i] != '-')
				return false;
		}
		for (int j=0; j<word.length(); j++){
			board[row+word.length()-1-j][col-word.length()+1+j] = word.charAt(j);
		}
		return true;
	}

	public void fillInBoard(){
		int randChar;
		for(int i=0; i<maxRow; i++){
			for (int j=0; j<maxCol; j++){
				if (board[i][j] == '-'){
					randChar = generator.nextInt(26)+65;
					board[i][j] = (char)randChar;
				}
			}
		}
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