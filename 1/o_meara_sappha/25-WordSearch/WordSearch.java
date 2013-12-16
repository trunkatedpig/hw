import java.io.*;
import java.util.*;

public class WordSearch{
    
    private char[][] grid;

    public WordSearch(int width, int height){
	grid = new char[width][height];
	for (int i = 0; i < grid.length; i++){
	    Arrays.fill(grid[i], '-');
	}
    }

    public boolean word(String word){
	return word.matches("[A-Z_]*");
    }
    
    public boolean addWordH(int rows, int cols, String word){
	word = word.toUpperCase();
	//are you printing off the board?
	if ((rows < 0) || (rows > grid.length - 1)
	 || (cols < 0) || (cols > grid[0].length - 1)
	 || (!(word(word))) || (rows + word.length() - 1 > grid.length))
	    {
		return false;
	    }
	//is your path blocked by another word?
	for (int i = 0; i < word.length(); i++){
	    if (((grid[rows + i][cols] != '-')
	      && (grid[rows + i][cols] != word.charAt(i)))
		|| (grid[rows + i][cols] != '-'))
		{
		    return false;
		}
	}
	//no bad stuff: put the word in and return true
	for (int i = 0; i < word.length(); i++){
	    grid[rows + i][cols] = word.charAt(i);
	}

	return true;
    }
    
    public String toString() {
	String s = "";
	for (int c = 0; c < grid[0].length; c ++){
	    for (int r = 0; r < grid.length; r ++){
		s = s + grid[r][c] + " ";
	    }
	    s = s.trim() + "\n";
	}
        
	return s.trim();
    }
    
}

//worked with Sean in class
