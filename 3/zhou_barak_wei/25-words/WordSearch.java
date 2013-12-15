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
        
    public boolean addWordH(int row, int col, String word) {
	   if (row >= board.length) return false;
	   if ((board[row].length - col) < word.length()) return false; //check if the word can fit
	   int location = col;
           int letter = 0;

           while (letter < word.length()) {
      		   if (board[row][location] != word.charAt(letter) &&
      			   board[row][location] != '-') return false;
			   location = location + 1;
			   letter = letter + 1;
		   }


		   //at this point checking for invalidation should be complete
		   location = col;
		   letter = 0;
		   while (letter < word.length()) {
			   board[row][location] = word.charAt(letter);
			   location = location + 1;
			   letter = letter + 1;
		   }
		   return true;
	   }
    
    public boolean addWordV(int row, int col, String word) {
		if (col >= board[row].length) return false;
		if ((board.length-row) < word.length()) return false;
		int location = row;
		int letter = 0;
		while (letter < word.length()) {
			if (board[location][col] != word.charAt(letter) &&
			board[location][col] != '-') return false;
			location = location + 1;
			letter = letter + 1;
		}

		location = row;
		letter = 0;
		while (letter < word.length()) {
			board[location][col] = word.charAt(letter);
			location = location + 1;
			letter = letter + 1;
		}
		return true;
    }

    public boolean addWordHx(int row, int col, String word) {
	   if (row >= board.length) return false;
	   if ((board[row].length - col) < word.length()) return false;
	   int location = col;
           int letter = word.length()-1;
	   while (letter >= 0) {
		   if (board[row][location] != word.charAt(letter) &&
			   board[row][location] != '-') return false;
		   location = location + 1;
		   letter = letter - 1;
	   }
	   location = col;
	   letter = word.length()-1;
	   while (letter >= 0) {
		   board[row][location] = word.charAt(letter);
		   location = location + 1;
		   letter = letter - 1;
	   }
	   return true;
   }

    public boolean addWordVx(int row, int col, String word) {
		if (col >= board[row].length) return false;
		if ((board.length-row) < word.length()) return false;
		int location = row;
		int letter = word.length()-1;
		while (letter >= 0) {
			if (board[location][col] != word.charAt(letter) &&
			board[location][col] != '-') return false;
			location = location + 1;
			letter = letter - 1;
	}

	location = row;
	letter = word.length()-1;
	while (letter >= 0) {
	    board[location][col] = word.charAt(letter);
	    location = location + 1;
	    letter = letter - 1;
	}
	return true;

    }

    public boolean addWordNE(int row, int col, String word) {
	if (row < 0 || col < 0 || row > board.length || col > board[row].length) return false;
	int size = 0;
	int y = row;
	int x = col;
	int letter = 0;
	while (y >= 0 && x < board[row].length) {
	    size = size + 1;
	    y = y - 1;
	    x = x + 1;
	}
	if (size < word.length()) return false; //check size
	y = row;
	x = col;
	while (letter < word.length()) {
	    board[y][x] = word.charAt(letter);
	    y = y - 1;
	    x = x + 1;
	    letter = letter + 1;
	}
	return true;
    }

    public boolean addWordNEx(int row, int col, String word) {
	if (row < 0 || col < 0 || row > board.length || col > board[row].length) return false;
	int size = 0;
	int y = row;
	int x = col;
	int letter = word.length()-1;
	while (y >= 0 && x < board[row].length) {
	    size = size + 1;
	    y = y - 1;
	    x = x + 1;
	}
	if (size < word.length()) return false; //check size
	y = row;
	x = col;
	while (letter >= 0) {
	    board[y][x] = word.charAt(letter);
	    y = y - 1;
	    x = x + 1;
	    letter = letter - 1;
	}
	return true;
    }

    public boolean addWordSW(int row, int col, String word) {
	if (row < 0 || col < 0 || row > board.length || col > board[row].length) return false;
	int size = 0;
	int y = row;
	int x = col;
	int letter = 0;
	while (y < board.length && x >= 0) {
	    size = size + 1;
	    y = y + 1;
	    x = x - 1;
	}
	if (size < word.length()) return false;
	y = row;
	x = col;
	while (letter < word.length()) {
	    board[y][x] = word.charAt(letter);
	    y = y + 1;
	    x = x - 1;
	    letter = letter + 1;
	}
	return true;
    }

    public boolean addWordSWx(int row, int col, String word) {
	if (row < 0 || col < 0 || row > board.length || col > board[row].length) return false;
	int size = 0;
	int y = row;
	int x = col;
	int letter = word.length()-1;
	while (y < board.length && x >= 0) {
	    size = size + 1;
	    y = y + 1;
	    x = x - 1;
	}
	if (size < word.length()) return false;
	y = row;
	x = col;
	while (letter >= 0) {
	    board[y][x] = word.charAt(letter);
	    y = y + 1;
	    x = x - 1;
	    letter = letter - 1;
	}
	return true;
    }

    public boolean addWordSE(int row, int col, String word) {
	if (row < 0 || col < 0 || row > board.length || col > board[row].length) return false;
	int size = 0;
	int y = row;
	int x = col;
	int letter = 0;
	while (y < board.length && x < board[row].length) {
	    size = size + 1;
	    y = y + 1;
	    x = x + 1;
	}
	if (size < word.length()) return false;
	y = row;
	x = col;
	while (letter < word.length()) {
	    board[y][x] = word.charAt(letter);
	    y = y + 1;
	    x = x + 1;
	    letter = letter + 1;
	}
	return true;
    }

    public boolean addWordSEx(int row, int col, String word) {
	if (row < 0 || col < 0 || row > board.length || col > board[row].length) return false;
	int size = 0;
	int y = row;
	int x = col;
	int letter = word.length()-1;
	while (y < board.length && x < board[row].length) {
	    size = size + 1;
	    y = y + 1;
	    x = x + 1;
	}
	if (size < word.length()) return false;
	y = row;
	x = col;
	while (letter >= 0) {
	    board[y][x] = word.charAt(letter);
	    y = y + 1;
	    x = x + 1;
	    letter = letter - 1;
	}
	return true;
    }

    public boolean addWordNW(int row, int col, String word) {
	if (row < 0 || col < 0 || row > board.length || col > board[row].length) return false;
	int size = 0;
	int y = row;
	int x = col;
	int letter = 0;
	while (y >= 0 && x >= 0) {
	    size = size + 1;
	    y = y - 1;
	    x = x - 1;
	}
	if (size < word.length()) return false;
	y = row;
	x = col;
	while (letter < word.length()) {
	    board[y][x] = word.charAt(letter);
	    y = y - 1;
	    x = x - 1;
	    letter = letter + 1;
	}
	return true;
    }

    public boolean addWordNWx(int row, int col, String word) {
	if (row < 0 || col < 0 || row > board.length || col > board[row].length) return false;
	int size = 0;
	int y = row;
	int x = col;
	int letter = word.length()-1;
	while (y >= 0 && x >= 0) {
	    size = size + 1;
	    y = y - 1;
	    x = x - 1;
	}
	if (size < word.length()) return false;
	y = row;
	x = col;
	while (letter >= 0) {
	    board[y][x] = word.charAt(letter);
	    y = y - 1;
	    x = x - 1;
	    letter = letter - 1;
	}
	return true;
    }

    public void fill() { //incomplete
		Random r = new Random();	
		for (int i=0;i<board.length;i++) {
			for (int j=0;j<board[i].length;j++) {
				if (board[i][j] == '-') board[i][j] = (char)(r.nextInt(26) + 'a');
			}
		}
    }
    
    ////////////////

}