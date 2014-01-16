import java.util.*; 
import java.io.*;

public class WordSearch{ 
    private char[][] board; 
    private Random r; 
    

    public void WordSearch(row r, collumn c){
	char[][] board = new char[r][c];
    } 

    public void WordSearch(){ 
	this(20,20);
    }
    
    public addWord(int r, int c, String s){ 
	int x = s.length(); 
	char[] word = new char[x]; 
	for(int i = 0; i < x; i++){
	    word[i] = s.charAT(i); 
	} 
	
	
	

    
	
	