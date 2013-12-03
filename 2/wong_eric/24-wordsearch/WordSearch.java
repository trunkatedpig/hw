import java.util.*;

public class WordSearch {

    public boolean AddwordH (r, c, word) {
	if ((board.length - r) < word.length()){
	    return false;
	}
	else if {	
	    for (int i=0;i<word.length();i++) {
		if (word.charAt(i) != board[r][c+i])
		    return false;
	    }
	}
	for (int i=0;i<word.length();i++) {
	    board[r][c+i] = word.charAt(i);
	}
	return true;
    }

}