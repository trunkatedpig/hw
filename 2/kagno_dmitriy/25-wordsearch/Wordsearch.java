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
    
    public addWord(int R,int C,int DeltaR,int DeltaC,String word){
	int r,c;
	
	if (DeltaR < -1 || DeltaR > 1 || DeltaC < -1 || DeltaC > 1 || 
	    (DeltaR == 0 && DeltaC == 0) ){
	    return false;
	}
        r = R;
	c = C;
	
	for (int i = 0; i < word.length();i++){
	    try{
		if (board[r][c] != "-" && board[r][c]!=word.charAt(i)){
			return false;
		}
	    } catch (ArrayIndexOutOfBoundsException e){
		return false;
	    }
	    r = R + DeltaR;
	    c = C + DeltaC;
	}
	r = R;
	c = C;
	for (int i = 0; i < word.length();i++){
	    board[r][c] = word.charAt(i);
	    r = r + DeltaR;
	    c = c + DeltaC;
	}
    	return true;
    }

    public boolean addWordRand(String w){
	add
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

