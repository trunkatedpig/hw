import java.io.*;
import java.util.*;

public class WordSearch{
	
    private char[][] playArea;
	
	
    public WordSearch(int rows, int columns){
	
	playArea = new char[rows][columns];
		
    }
	
    public String toString(){
        
	String returnString = "";
	
	for (int rInt = 0;
	     rInt < playArea.length;
	     rInt++){
	
	    for (int cInt = 0;
		 cInt < playArea[rInt].length;
		 cInt++){
	
		returnString = returnString + playArea[rInt][cInt];
	       
	    } 
	}
	return returnString;
    }
    
    public boolean addWordH(int row, int column, String word){
	
	if (row < 0 || column < 0){
	    //Row and column cannot be less than 0
	    return false;
	    
	} 
	//____________________________________________

	char[] CharacterWord = new char[word.length()];
	
	for (int wordRun = 0;
	     wordRun < word.length();
	     wordRun++){
	    //Creates an array of all of the letters of the word.
	    CharacterWord[wordRun] = word.charAt(wordRun);
	    
	}
	
	if (word.length() + row > playArea[0].length){

	    return false;
	    
	}
	//_________________________________________
	int rowInt = row;
	
	for (int wordRun = 0;
	     wordRun < word.length();
	     wordRun++){	    
	    
	    //Checks if there are any letter conflictions
	    if (playArea[rowInt][column] != CharacterWord[wordRun] || CharacterWord[wordRun] != 0){
		
		System.out.println("Heyyooo");
		return false;
		
	    } 
	    
	    else {
		
		playArea[rowInt][column] = CharacterWord[wordRun];
		rowInt++;
		
	    }
	}
	return true; 
    }
}
	    
	    
		
	    
	    
	    
	
	    
	    
	    
	    
