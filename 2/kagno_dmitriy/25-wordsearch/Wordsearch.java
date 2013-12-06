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

    public boolean AddWordH(int r,int c,String word){
	if (board.length >= c + word.length()){
	    for (int i = 0;i < word.length();i++){
		if (board[r][c+i] != '-' && board[r][c+i] != word.charAt(i))
		    return false;				  
	    }
	    for (int i = 0;i < word.length();i++){
		board[r][c+i] = word.charAt(i);
	    }
	    return true;
	}
	return false;
    }
    
    public boolean AddWordHback(int r,int c,String word){
	if (board.length >= c + word.length() && c >= word.length()){
	    for (int i = 0;i < word.length();i++){
		if (board[r][c+i] != '-' && board[r][c+i] != word.charAt(i))
		    return false;				  
	    }
	    for (int i = 0;i < word.length();i++){
		board[r][c+i] = word.charAt((word.length() - 1) - i);
	    }
	    return true;
	}
	return false;
    }
    
    
    //Our original idea for AddWordH, but it
    //turned out to be AddWordV.....
    public boolean AddWordV(int r,int c,String word){
	
	if (board[r].length >= r + word.length() && c >= word.length()){
	    for (int i = 0;i < word.length();i++){
		if (board[r+i][c] != '-' && board[r+i][c] != word.charAt(i))
		    return false;				  
	    }
	    for (int i = 0;i < word.length();i++){
		board[r+i][c] = word.charAt(i);
	    }
	    return true;
	}
	return false;

    }
    
    public boolean AddWordVback(int r,int c,String word){
	
	if (board[r].length >= r + word.length() && c >= word.length()){
	    for (int i = 0;i < word.length();i++){
		if (board[r+i][c] != '-' && board[r+i][c] != word.charAt(i))
		    return false;				  
	    }
	    for (int i = 0;i < word.length();i++){
		board[r+i][c] = word.charAt((word.length() - 1) - i);
	    }
	    return true;
	}
	return false;
    }

v    public boolean AddWordD(int r,int c,String word){
	
	if (board[r].length >= r + word.length() && c >= word.length()){
	    for (int i = 0;i < word.length();i++){
		if (board[r+i][c+i] != '-' && board[r+i][c+i] != word.charAt(i))
		    return false;				  
	    }
	    for (int i = 0;i < word.length();i++){
		board[r+i][c+i] = word.charAt(i);
	    }
	    return true;
	}
	return false;
    }
    
    public boolean AddWordDback(int r,int c,String word){
	
	if (board[r].length >= r + word.length() && c >= word.length()){
	    for (int i = 0;i < word.length();i++){
		if (board[r+i][c+i] != '-' && board[r+i][c+i] != word.charAt(i))
		    return false;				  
	    }
	    for (int i = 0;i < word.length();i++){
		board[r+i][c+i] = word.charAt((word.length() - 1) - i);
	    }
	    return true;
	}
	return false;
    }

    public boolean AddWordDr(int r,int c,String word){
	
	if (board[r].length >= r + word.length() && c >= word.length()){
	    for (int i = 0;i < word.length();i++){
		if (board[r+i][c-i] != '-' && board[r+i][c-i] != word.charAt(i))
		    return false;				  
	    }
	    for (int i = 0;i < word.length();i++){
		board[r+i][c-i] = word.charAt(i);
	    }
	    return true;
	}
	return false;
    }

    public boolean AddWordDr(int r,int c,String word){
	
	if (board[r].length >= r + word.length() && c >= word.length()){
	    for (int i = 0;i < word.length();i++){
		if (board[r+i][c-i] != '-' && board[r+i][c-i] != word.charAt(i))
		    return false;				  
	    }
	    for (int i = 0;i < word.length();i++){
		board[r+i][c-i] = word.charAt((word.length() - 1) - i);
	    }
	    return true;
	}
	return false;
    }
    
    public void randoFill(){
	for (int i = 0;i <board.length();i++){
	    for (int j = 0;j < board[i].length();j++){

		if (board[r+i][c-i] != '-'){
		    
       
	
    }

}

