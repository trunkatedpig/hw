import java.io.*;
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

    public boolean addWordH(int r, int c, String word) {
        int i;
        int j;

        i=0;
	while (i<word.length()) {
	    try {
                  
		if ( board[r][c+i] != '-' && board[r][c+i]!=word.charAt(i)) {
		    return false; 
		}
	    } catch (ArrayIndexOutOfBoundsException e) { 
		System.out.println(e);
		return false;  
	    } catch (ArithmeticException e) {
		System.out.println(e);
		return false;
	    } catch (Exception e) {
		System.out.println(e);
		return false;
	    }


	    i++;
	}
    

        
        i=0;
        while (i<word.length()) {
            board[r][c+i]=word.charAt(i);
            i++;
        }
        
        return true;
    }

    public boolean addWordV (int row, int col, String word){
	if (row>board.length||col>board[0].length||(col+word.length())>board[0].length){
            return false;
	}
        for (int i = 0; i<word.length(); i++){
            if (!(("" + word.charAt(i)).equals ( "" + board[row+i][col])) &&  !(( ("" + board[row+i][col])).equals( "-"))){
		return false;
	    }
	}
	      

	for (int j=0; j<word.length(); j++){
	    board[row+j][col]= word.charAt(j);
	}
	return true;
    }



        

    public boolean addWordVback (int row, int col, String word){
	if(row < 0 || col < 0)
	    return false;
	if (col  >= cols || row + word.length() >= rows)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row + word.length()- j][col] != '-' && word.charAt(j) != board[row + word.length() - j][col])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row + word.length() - i][col] = word.charAt(i);
	}
	return true;
    }





    public boolean addWordHback (int row,int col,String word) {
        if (row>board.length||col>board[0].length||(row-word.length())<0){
            return false;
	}
        for (int i = 0; i<word.length(); i++){
            if (!(("" + word.charAt(i)).equals ("" + board[row][col-i])) &&  !(( ("" + board[row][col-i])).equals("-"))){
		return false;
	    }
	}
	      

	for (int j=0; j<word.length(); j++){
	    board[row][col - j]= word.charAt(j);
	}
	return true;
    }

    public boolean addWordVup (int row, int col, String word){
	if (row>board.length||col>board[0].length||(col-word.length())<0){
            return false;
	}
        for (int i = 0; i<word.length(); i++){
            if (!(("" + word.charAt(i)).equals ( "" + board[row-i][col])) &&  !(( ("" + board[row-i][col])).equals( "-"))){
		return false;
	    }
	}
	      

	for (int j=0; j<word.length(); j++){
	    board[row-j][col]= word.charAt(j);
	}
	return true;
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

    public boolean insertWordDdr (int row, int col, String word){
	if(row < 0 || col < 0 || row >= rows || col >= cols)
	    return false;
	if (col + word.length() >= cols || row - word.length() < -1)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row + j][col + j] != '-' && word.charAt(j) != board[row + j][col + j])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row + i][col + i] = word.charAt(i);
	}
	return true;
    }

    public boolean insertWordDur (int row, int col, String word){
	if(row < 0 || col < 0 || row >= rows || col >= cols)
	    return false;
	if (col + word.length() >= cols || row + word.length() >= rows)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row - j][col + j] != '-' && word.charAt(j) != board[row - j][col + j])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row - i][col + i] = word.charAt(i);
	}
	return true;
    }

    public boolean insertWordDdl (int row, int col, String word){
	if(row < 0 || col < 0 || row >= rows || col >= cols)
	    return false;
	if (col - word.length() < 0 || row - word.length() < 0)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row + j][col - j] != '-' && word.charAt(j) != board[row + j][col - j])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row + i][col - i] = word.charAt(i);
	}
	return true;
    }

    public boolean insertWordDul (int row, int col, String word){
	if(row < 0 || col < 0 || row >= rows || col >= cols)
	    return false;
	if (col - word.length() < -1 || row + word.length() >= rows)
	    return false;
	for (int j = 0; j < word.length(); j++){
	    if (board[row - j][col - j] != '-' && word.charAt(j) != board[row - j][col - j])
		return false;	
	}
	for (int i = 0; i < word.length(); i++){
	    board[row - i][col - i] = word.charAt(i);
	}
	return true;
    }
    
    public void fillPuzzle (){
	String letters= "abcdefghijklmnopqrstuvwxyz"; 
	Random r = new Random ();
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		if (board[i][j] == '-')
		    board[i][j] = letters.charAt(r.nextInt(26));
		
	    }
	}
    }


}
