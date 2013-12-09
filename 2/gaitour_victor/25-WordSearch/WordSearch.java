import java.util.*;

public class WordSearch{
    char[][] board= new  char[][];
    public boolean AddwordH(int r, int c, String word){
	int w=word.length
	if  (c>=board.length || c<0)
	    return false;
	if (r>=board[0].length || r<0)
	    return false;
	if (w+r>board[0].length)
	    return false;
	else {
	    int i = col;
	    int index = 0;
	    while ( i < col + word.length() ) {
		board [ row - 1 ] [ i - 1 ] = word.charAt ( index );
		i = i + 1;
		index = index + 1;
	    }
	    return true;
	}
    }
    
}

}