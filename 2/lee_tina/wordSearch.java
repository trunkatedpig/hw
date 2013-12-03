import java.io.*;
import java.util.*;

public class wordSearch{
    private char[][] board;

    public wordSearch(int rows, int cols) {
        board = new char[rows][cols];
        for (int i=0;i<rows;i++) {
         for (int j=0;j<cols;j++) {
                board[i][j]='-';
         }
        }

    }

    public wordSearch() {
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

    public boolean horizontalFit(int lenword, int pos){
	return (lenword>20-pos);
    }
	    
    public void addWordH(int r, int c, String word){
	if horizontalFit{
		
	    }
    }

}