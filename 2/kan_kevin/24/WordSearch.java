import java.io.*;
import java.util.*;

public class WordSearch {
    char[][] board;
    public WordSearch(int row, int col) {
	for (int i = 0; i < row; i++) {
	    for (int j = 0; j < col; j++) {
		char[i][j] = "-";
	    }
	}
    }
    public WordSearch() {
	this(20,20);
    }
    public boolean addWordH(int r, int c, String word) {
	if (isEmptyRegion(r,c,word.length())
    }

    private boolean isEmptyRegion(int r, int c, int length) {
	if ((r > board.length) || (c > board[0].length) || (c + length > board[0].length)) {
	    return false;
	} 
	return true;
	
    }
}