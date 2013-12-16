import java.util.*;
import java.io.*;

public class WordSearch {

    private char[][] board;
    private Random rand;
    private ArrayList<String> wordList = new ArrayList<String>();

    public WordSearch(int rows, int cols) {
	rand = new Random();
        board = new char[rows][cols];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                board[i][j]='-';
            }
        }
        readWords("Words");
        placeWords(10);
	System.out.println(toString());
        fillInBlanks();
        System.out.println(toString());
    }


    public WordSearch() {
	this(20,20);
    }


    private void readWords(String filename) {

	try {
	    Scanner sc = new Scanner(new File(filename));
	    while (sc.hasNext()) {
		String s =sc.nextLine();
		wordList.add(s);
	    }
	} catch (FileNotFoundException e) {
	    // if we can't open the file we
	    // exit the program
	    System.out.println(e);
	    System.exit(0);
	}
    }

    public void placeWords(int amount) {
	ArrayList <String> words = new ArrayList <String>();
        while (words.size() < amount) {
            int a = rand.nextInt(wordList.size());
            int tries = 5;
            while (tries > 0) {
                if (addWordRandomLoc(wordList.get(a))) {
                    tries = 0;
                    words.add(wordList.get(a));
                    wordList.remove(a);
                }
            }
        }
        System.out.println(words);
    }
		 
	    
	

    public boolean addWord(int row, int col, int deltaR, int deltaC,  String word) {

	/* make sure deltas are in range */
	if (deltaR < -1 || deltaR > 1 || deltaC < -1 || deltaC > 1 || 
	    (deltaR==0 && deltaC==0) )
	    return false;

	/* see if we can place the word */
	int r = row;
	int c = col;
	for (int i=0; i < word.length(); i++) {
	    try {
		//j=10/i; <-- this is only to show the Arithmetic exception
		if ( board[r][c] != '-' && board[r][c]!=word.charAt(i)) {
		    return false; // we return false since we can't add the word
		}
	    } catch (ArrayIndexOutOfBoundsException e) { // Handle the array one
		return false;  // we return false since we can't add the word
	    }
	    r = r + deltaR; 
	    c = c+ deltaC;
	}
    	
	/* if we get here, we can add the word */
	r = row;
	c = col;
	for (int i=0; i < word.length(); i++) {
	    board[r][c]=word.charAt(i);
	    r = r + deltaR; 
	    c = c+ deltaC;
	}
    	
	
	return true;
    }
    
    public boolean addWordRandomLoc(String w) {
	int r = rand.nextInt(board.length);
	int c = rand.nextInt(board[0].length);
	int deltaR = rand.nextInt(3)-1;
	int deltaC = rand.nextInt(3)-1;

	return addWord(r,c,deltaR,deltaC,w);

    }

    public void fillInBlanks() {
	for (int r = 0; r < board.length; r++)
	    for (int c=0;c<board[0].length;c++) {
		if (board[r][c]=='-')
		    board[r][c]=(char)('a'+(char)rand.nextInt('z'-'a'));
	    }
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
}
