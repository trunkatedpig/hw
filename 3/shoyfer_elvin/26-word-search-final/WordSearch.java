import java.io.*;
import java.util.*;

public class WordSearch {
    private char[][] board;
    private ArrayList<String> wordList;
    private ArrayList<String> wordsAdded;
    private Random rand = new Random();

    public WordSearch(int rows, int cols) {
    	wordsAdded = new ArrayList<String>();
    	loadWords("wordlist.txt");
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

    private void loadWords(String filename) {
        wordList = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNext()) {
                String s = sc.next();
                wordList.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't open wordlist - exiting");
            System.exit(0);
        }
    }





    public boolean addWord(int row, int col, int deltaR, int deltaC, String word) {
    	int r, c; 

    	if ((deltaR < -1) || (deltaR > 1) || (deltaC < -1) || (deltaC > -1) || ((deltaR == 0) && (deltaC == 0))) {
    		return false; 
    		// This occurs when an invalid word addition type is attempted. 
    		// The spacing between each letter cannot be greater than 1. 
    		// Additionally, we cannot stack letters on top of each other in the same position. 
    	}

    	r = row;
    	c = col;

    	for (int i = 0; i < word.length(); i++) { // checking if this is a valid word addition
    		try {
    			if ((board[r][c] != '-') && (board[r][c] != word.charAt(i))) {
    				return false; // This occurs if that space has been filled with a different letter (word addition fails).
    			}
    		} catch (ArrayIndexOutOfBoundsException e) {
    			return false; // Out of bounds (word addition fails).
    		}

    		r = r + deltaR; 
    		c = c + deltaC;

    	}

    	// actual word addition

    	// reset initial position values
    	r = row;
    	c = col; 

    	for (int i = 0; i < word.length(); i++) {
    		board[r][c] = word.charAt(i);
    		r = r + deltaR;
    		c = c + deltaC; 
    	}

    	wordsAdded.add(word); // add it to list of words successfully added in the WordSearch

    	return true; // indicates success
    }

    public boolean addWordV(int row, int col, String word) {
    	return addWord(row, col, 1, 0, word);
    }


	public boolean addWordH(int row, int col, String word) {
		return addWord(row, col, 0, 1, word);
	}

	public boolean addWordRand(String w) {

		// produce random, valid starting indices

		int r = rand.nextInt(board.length); 
		int c = rand.nextInt(board[0].length);

		// produce deltaR and deltaC that are >= -1 and <= 1

		int deltaR = rand.nextInt(3) - 1;
		int deltaC = rand.nextInt(3) - 1; 

		// add the word

		return addWord(r, c, deltaR, deltaC, w.toUpperCase());

	}

	public void addWordFromList() {
		int numWords = wordList.size();
		int randomWordPosition = rand.nextInt(numWords);
		String randomWord = wordList.get(randomWordPosition);
		boolean success = false;
		while (!success) {
			if (addWordRand(randomWord)) { // keep trying to add the word until it can fit successfully (it will auto-register into the list of added words if added sucessfully)
				success = true;
			} 
		}
	}

	public void addWordsFromList(int n) {
		for (int i = 0; i < n; i++) {
			addWordFromList();
		}
	}

	public void setup() {
		addWordsFromList(10);
		fillSpaces();
		System.out.println(wordsAdded);
	}

	public void fillSpaces() {
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				if (board[r][c] == '-') { // if empty position
					board[r][c] = (char)('A' + rand.nextInt('Z' - 'A' + 1)); // fill with random letter
				}
			}
		}
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

}