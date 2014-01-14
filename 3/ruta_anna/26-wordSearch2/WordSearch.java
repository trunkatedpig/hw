import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;
    private int maxRow, maxCol;
    private Random rand;
	private ArrayList<String> wordList;
	private String[] wordsUsed;


    public WordSearch(int rows, int cols, String filename) {
		rand = new Random();
		maxRow = rows;
		maxCol = cols;
    	board = new char[rows][cols];
        for (int i=0; i<rows; i++) {
        	for (int j=0;j<cols;j++) {
                board[i][j]='-';
         	}
        }
        loadWords(filename);
    }

/*This calls the constructor above, setting rows and cols to 20*/
    public WordSearch() {
        this(20,20,"Colors.txt");
    }

/* Loads words from a seperate file into an arraylist*/
	private void loadWords(String filename) {
        wordList = new ArrayList<String>();
        try {
         Scanner sc = new Scanner(new File(filename));
         while (sc.hasNext()) {
                wordList.add(sc.nextLine());
         }
        } catch (FileNotFoundException e) {
         System.out.println("Can't open wordlist - exiting");
         System.exit(0);
        }
    }

/* Main addWord method!!
Parameters row and col specify the location of the first character in the word.
Parameters deltaRow and deltaCol (ranging from -1,0,1) are used to specify which
direction the word will be written in. If it is possible to add the word to the
board, then the word is added and method returns true*/
	public boolean addWord(int row, int col, int deltaRow, int deltaCol, String word){
		if (deltaRow<-1 || deltaRow>1 || deltaCol<-1 || deltaCol>1)
			return false;
		if (deltaRow==0 && deltaCol==0)
			return false;
		int r = row;
		int c = col;
		word = word.toUpperCase();
		for (int i=0; i<word.length(); i++){
			if (r<0 || r>=maxRow || c<0 || c>=maxCol)
				return false;
			if (board[r][c]!= word.charAt(i) && board[r][c] != '-')
				return false;
			r = r+deltaRow;
			c = c+deltaCol;
		}
		r = row;
		c = col;
		for (int i=0; i<word.length(); i++){
			board[r][c] = word.charAt(i);
			r = r+deltaRow;
			c = c+deltaCol;
		}
		return true;
	}

//Adds word horizontally right-to-left
	public boolean addWordH(int row, int col, String word){
		return addWord(row,col,0,1,word);
	}

//Adds word vertically top-to-bottom
	public boolean addWordV(int row, int col, String word){
		return addWord(row,col,1,0,word);
	}

//Adds word horizontally left-to-right
	public boolean addWordHRev(int row, int col, String word){
		return addWord(row,col,0,-1,word);
	}

//Adds word vertically bottom-to-top
	public boolean addWordVRev(int row, int col, String word) {
		return addWord(row,col,-1,0,word);
	}

//Adds word diagonally from topRight-to-bottomLeft
	public boolean addWordTRBL(int row, int col, String word) {
		return addWord(row,col,1,1,word);
	}

//Adds word diagonally from topLeft-to-bottomRight
	public boolean addWordTLBR(int row, int col, String word) {
		return addWord(row,col,1,-1,word);
	}

//Adds word diagonally from bottomRight-to-topLeft
	public boolean addWordBRTL(int row, int col, String word) {
		return addWord(row,col,-1,1,word);
	}

//Adds word diagonally from bottomLeft-to-topRight
	public boolean addWordBLTR(int row, int col, String word) {
		return addWord(row,col,-1,-1,word);
	}

//Adds word at a random location in a random direction
	public boolean addWordRand(String word) {
		int row = rand.nextInt(maxRow);
		int col = rand.nextInt(maxCol);
		int deltaRow = rand.nextInt(2)-1;
		int deltaCol = rand.nextInt(2)-1;
		return addWord(row,col,deltaRow,deltaCol,word);
	}

	public void createWordSearch(int wordCount){
		if (wordList.size() >= wordCount) {
			wordsUsed = new String[wordCount];
			for (int i=0; i<wordCount; i++){
				int index = rand.nextInt(wordList.size());
				String word = wordList.get(index);
				for(int j=0; j<10; j++){
					if (addWordRand(word)){
						wordsUsed[i] = word;
						wordList.remove(index);
						j = 10;
					}
				}
				if (wordsUsed[i] == null)
					i = i-1;
			}
		}
	}

//Fills in the empty spaces on the board with random uppercase letters
	public void fillInBoard(){
		rand = new Random();
		for(int i=0; i<maxRow; i++){
			for (int j=0; j<maxCol; j++){
				if (board[i][j] == '-')
					board[i][j] = (char)(rand.nextInt(26)+65);
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
        s = s + "\n" + "Words Used:" + Arrays.toString(wordsUsed);
        return s;
    }

}