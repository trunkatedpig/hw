import java.util.*;
import java.io.*;

public class WordSearch {
    
    Random R = new Random();
    
    private char[][] board;
    private int rows;
    private int cols;
    
    public WordSearch(int r, int c) {
	rows = r;
	cols = c;    
	board = new char[r][c];
	for (int i=0;i<r;i++) 
	    for (int j=0;j<c;j++) 
		board[i][j]='-';
    }
    
    public WordSearch() {
	this(20,20);
    }
    
    public boolean AddWord (int r, int c, int dx, int dy, String word){
    if (dx == 0 && dy == 0)
        return false; //this would mean that the word was not sprouting in any direction. Only the first letter would render.
    int i = 0;
    
    //dx: "X-Direction" --  (-1) for Left, (1) for Right, (0) for neither;
    //dy: "Y-Direction" -- ditto;
    
    
    try{
        while (int i < word.length()){
        if (board[r + (dy*i)][c + (dx*i)]
            return false;
        i++;
        }
    }catch (Exception e){
        return false;
    }
    
    int i = 0;
    while (int i < word.length()){
        board[r + (dy*i)][c + (dx*i)] = word.charAt(i);
        i++;
    }
    return true;
    }
    // (7,7,"hello")

    public void FillIn(){
      for (int x = 0; x < columns; x++)
        for (int y = 0; y < rows; y++)
           if (board[x][y] == '-')
               board[x][y] = (char)(R.nextInt(26 + 'a'); 
  }
    
    public String toString() {
	String s = "";
	System.out.println("");
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		s=s+board[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }
    
    
}
