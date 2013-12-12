import java.io.*;
import java.util.*;

//Worked with Andrew Fischer

public class WordSearch {
    private char[][] board;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
	    }
	}

    }

    public WordSearch() {
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

    public boolean AddWordH(int r,int c,String word){
	
	if ((c + word.length() - 1) <= (board[0].length - 1)){ //makes sure it's not off the board
	    for (int i=0; i<word.length();i++){ 

		if ((board[r][c+i] != "-".charAt(0))           //if the character it's looping thru isn't - 
		    &&
		    (board[r][c + i] != word.charAt(i))){      //and not already the char at i
		    return false;
		}
	    }


	    for (int i = 0; i < word.length(); i ++){ //loop thru word
		board[r][c+i] = word.charAt(i);       //add word to board
	    }
	    return true;
	}
	
	else {
	    return false;
	}
    }

    public boolean AddWordHB(int r,int c,String word){
	
	if ((c - word.length() + 1) >= (0)){ //makes sure it's not off the board
	    for (int i=0; i<word.length();i++){ 

		if ((board[r][c-i] != "-".charAt(0))           //if the character it's looping thru isn't - 
		    &&
		    (board[r][c-i] != word.charAt(i))){      //and not already the char at i
		    return false;
		}
	    }


	    for (int i = 0; i < word.length(); i ++){ //loop thru word
		board[r][c-i] = word.charAt(i);       //add word to board
	    }
	    return true;
	}
	
	else {
	    return false;
	}
    }


    public boolean AddWordV(int r, int c, String word){
	
	if ((r + word.length() - 1) <= (board.length - 1)){  //makes sure in range of board
	    for (int i=0; i<word.length(); i++){
  
		if ((board[r+i][c] != "-".charAt(0))
		    &&
		    (board[r+i][c] != word.charAt(i))){
		    return false;
		}
	    }

	    for (int i =0; i <word.length(); i++){
		board[r+i][c] = word.charAt(i);
	    }
	    return true;
	}
	
	return false;
    }


    public boolean AddWordVB(int r, int c, String word){
	
	if ((r - word.length() + 1) >= 0){  //makes sure in range of board
	    for (int i=0; i<word.length(); i++){
  
		if ((board[r-i][c] != "-".charAt(0))
		    &&
		    (board[r-i][c] != word.charAt(i))){
		    return false;
		}
	    }

	    for (int i =0; i <word.length(); i++){
		board[r-i][c] = word.charAt(i);
	    }
	    return true;
	}
	
	return false;
    }

    public boolean AddWordSE(int r, int c, String word){
	
	if ((r + word.length() - 1) <= (board.length - 1) //make sure in range vert down
	    &&
	    (c + word.length() - 1) <= (board.length - 1)){  //makes sure in range of board horiz right
	    for (int i=0; i<word.length(); i++){
		
		if ((board[r+i][c+i] != "-".charAt(0))
		    &&
		    (board[r+i][c+i] != word.charAt(i))){
		    return false;
		}
	    }

	    for (int i =0; i <word.length(); i++){
		board[r+i][c+i] = word.charAt(i);
	    }
	    return true;
	}
	
	return false;
    }

   public boolean AddWordSW(int r, int c, String word){
	
       if ((r + word.length() - 1) <= (board.length - 1) //make sure in range vert down
	   &&
	   (c - word.length() + 1) >= 0){  //makes sure in range of board horiz left
	   for (int i=0; i<word.length(); i++){
	       
	       if ((board[r+i][c-i] != "-".charAt(0))
		    &&
		   (board[r+i][c-i] != word.charAt(i))){
		   return false;
	       }
	   }
	   
	   for (int i =0; i <word.length(); i++){
		board[r+i][c-i] = word.charAt(i);
	   }
	   return true;
       }
       
       return false;
   }
    
    public boolean AddWordNE(int r, int c, String word){
	
       if ((r - word.length() + 1) >= 0 //make sure in range vert up
	   &&
	   (c + word.length() - 1) <= (board.length - 1)){  //makes sure in range of board horiz right
	   for (int i=0; i<word.length(); i++){
	       
	       if ((board[r-i][c+i] != "-".charAt(0))
		   &&
		   (board[r-i][c+i] != word.charAt(i))){
		   return false;
	       }
	   }
	   
	   for (int i =0; i <word.length(); i++){
	       board[r-i][c+i] = word.charAt(i);
	   }
	    return true;
       }
       
       return false;
    }

    public boolean AddWordNW(int r, int c, String word){
	
       if ((r - word.length() + 1) >= 0 //make sure in range vert up
	   &&
	   (c + word.length() - 1) >= 0){  //makes sure in range of board horiz right
	   for (int i=0; i<word.length(); i++){
	       
	       if ((board[r-i][c-i] != "-".charAt(0))
		   &&
		   (board[r-i][c-i] != word.charAt(i))){
		   return false;
	       }
	   }
	   
	   for (int i =0; i <word.length(); i++){
	       board[r-i][c-i] = word.charAt(i);
	   }
	    return true;
       }
       
       return false;
    }
    

    public void fill(){
	String allChar = "abcdefghijklmnopqrstuvwxyz";
	Random x = new Random();
	
	for (int r=0;r<board.length; r++){
	    for (int c=0; c<board[0].length; c++){
		if (board[r][c] == "-".charAt(0)){
		    board[r][c] = allChar.charAt(x.nextInt(26));
		}
	    }
	}
    }
    
    
	    
}
