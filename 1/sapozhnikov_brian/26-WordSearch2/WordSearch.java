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
    public boolean addWordH(int row, int col, String word){
	//test if legal
	int c = 0;

	//prevents error in next boolean
	if (word.length() == 0)
	    return true;

	//check range of row and col
	if (!(row>=0 && row<board.length) || !(col>=0 && col<=board[row].length-word.length()))
	    return false;

	//check if something is in the way before adding
	while (c<word.length()){
	    if(!((""+board[row][col+c]).equals("-")) && !((""+board[row][col+c]).equals(""+word.charAt(c))))
		return false;
	    c = c + 1;
	}

	//if legal, add
	c=0;
	while (c<word.length()){   
	    board[row][col] = word.charAt(c);
	    c = c + 1;
	    col = col + 1;
	}
	return true;
    }
   
    public String reverse(String s){
	String reversed = "";
	for (int i = s.length()-1; i>=0; i--){
	    reversed += s.charAt(i);
	}
	return reversed;
    }
    
    public boolean addWordHLeft(int r, int c, String word){
	return addWordH(r,c-word.length()+1,reverse(word));
    }

    public boolean addWordV(int r, int c, String word){
	int x = 0;

	if (!(c>=0 && c<board.length) || !(r>=0 && r<board[c].length-word.length()))
	    return false;

	while (x<word.length()){
	    if(!((""+board[r+x][c]).equals("-")) && !((""+board[r+x][c]).equals(""+word.charAt(x))))
		return false;
	    x=x+1;
	}

	x=0;
	while (x<word.length()){
	    board[r][c] = word.charAt(x);
	    x++;
	    r++;
	}
	return true;
    }
    
    public boolean addWordVUp(int r, int c, String word){
	return addWordV(r-word.length()+1,c,reverse(word));
    }

    public boolean addWordSE(int r, int c, String word){
	int x = 0;

	if (!(c>=0 && c<board.length-word.length()) || !(r>=0 && r<board[c].length-word.length()))
	    return false;

	while (x<word.length()){
	    if(!((""+board[r+x][c+x]).equals("-")) && !((""+board[r+x][c+x]).equals(""+word.charAt(x))))
		return false;
	    x=x+1;
	}

	x=0;
	while (x<word.length()){
	    board[r][c] = word.charAt(x);
	    x++;
	    c++;
	    r++;
	}
	return true;
    }
    
    public boolean addWordNW(int r, int c, String word){
	return addWordSE(r-word.length()+1,c-word.length()+1,reverse(word));
    }

    public boolean addWordSW(int r, int c, String word){
	int x = 0;

	if (!(c>=0 && c<board.length+word.length()) || !(r>=0 && r<board[c].length-word.length()))
	    return false;

	while (x<word.length()){
	    if(!((""+board[r+x][c-x]).equals("-")) && !((""+board[r+x][c-x]).equals(""+word.charAt(x))))
		return false;
	    x=x+1;
	}

	x=0;
	while (x<word.length()){
	    board[r][c] = word.charAt(x);
	    x++;
	    c--;
	    r++;
	}
	return true;
    }
    
    public boolean addWordNE(int r, int c, String word){
	return addWordSW(r-word.length()+1,c+word.length()-1,reverse(word));
    }
    

}
