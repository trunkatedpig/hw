import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class WordSearch {
    ////////////////////////////////////////////
    //MAKE AN ARRAY(LIST?) OF MUSICICAL WORDS://
    ////////////////////////////////////////////

    ArrayList<String> instruments = new ArrayList<String>(Arrays.asList("tuba" , "trombone" , "bass" , "guitar" , "slapstick",
									"sitar" , "djembe" , "celesta" , "bassoon" , "clarinet", "flute",
									"cowbell","oboe","saxophone", "glockenspiel","xylophone","marimba",
									"piano", "didgeridoo", "violin","cello","viola", "tabla", "gamalan",
									"gong","cymbal","snare", "tomtom"
									));
    
    Random R = new Random();
    
    private char[][] board;
    private int rows;
    private int columns;
    
    public WordSearch(int r, int c) {
	

	
	
	rows = r;
	columns = c;    
	board = new char[r][c];
	for (int i=0;i<r;i++) 
	    for (int j=0;j<c;j++) 
		board[i][j]='-';
    }
    
    public WordSearch() {
	this(20,20);
    }
    

    public boolean RandWords(int reps){
	// will fill board with with "reps" words.
	// next: dictate length (/complexity!) of words.
	for (int i = 0; i <= reps; i++){
	
	    int dx = R.nextInt(3)-1;
	    int dy = R.nextInt(3)-1;
	    int c = R.nextInt(columns);
	    int r = R.nextInt(rows);
	    String word = (instruments.get(R.nextInt(20))); //(instruments[R.nextInt(instruments.length())]);
	    AddWord (r, c, dx, dy, word);
	    
	}
	return true;
       
    }
    
    public boolean AddWord (int r, int c, int dx, int dy, String word){
	if (dx == 0 && dy == 0){
	    System.out.println("dx and dy cannot both equal zero");
	    return false; //this would mean that the word was not sprouting in any direction. Only the first letter would render.
	}
	if (dx > 1 || dx < -1 || dy > 1 || dy < -1){
	    System.out.println("dx and dy must both be within range.");
	    return false;
	}
	int i = 0;
	
	//dx: "X-Direction" --  (-1) for Left, (1) for Right, (0) for neither;
	//dy: "Y-Direction" -- ditto;
		
	try{
	    while (i < word.length()){
		if (board[r + (dy*i)][c + (dx*i)] != '-' && board[r + (dy*i)][c + (dx*i)] != word.charAt(i))
		    return false;
		i++;
	    }
	}
	catch (Exception e){
	    return false;
	}
	
	i = 0;
	while (i < word.length()){
	    board[r + (dy*i)][c + (dx*i)] = word.charAt(i);
	    i++;
	}
	return true;
    }
    
    public void FillIn(){
	for (int x = 0; x < rows; x++)
	    for (int y = 0; y < columns; y++)
		if (board[x][y] == '-')
		    board[x][y] = (char)(R.nextInt(26) + 'a');
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
