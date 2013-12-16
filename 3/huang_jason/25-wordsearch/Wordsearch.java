// worked with Anna Ruta in class

import java.io.*;
import java.util.*;

public class Wordsearch {
    private char[][] board;

    public Wordsearch(int rows, int cols) {
        board = new char[rows][cols];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                board[i][j]='-';
            }
        }

    }

    public Wordsearch() {
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

    public boolean addWordH(int row, int column, String word){
	if (row >= board.length || word.length() + column > board.length)
	    return false;
	else{
	    for(int i=0; i<word.length(); i++){
		if(word.charAt(i) != board[row-1][column-1+i] && board[row-1][column-1+i] != '-')
		    return false;
	    }
	    for(int j=0; j<word.length(); j++){
		board[row-1][column-1+j] = word.charAt(j);
	    }
	    return true;
	}
    }
}