import java.util.*;
import java.io.*;

public class WordSearch {

    private char[][] board;
    private int cols, rows;
    private ArrayList<String> wordList;
    private Random r;
    private char[][] wordboard;
    private ArrayList<String> list;

    public WordSearch(int row, int col) {
	board = new char[row][col];
	cols = col;
	rows = row;
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
    }

<<<<<<< HEAD
    private void readWords(String filename) {
	Scanner s = new Scanner(new file "wordlist");
	ArrayList<String> L = new ArrayList<String>;
	while (s.hasNext()) {
	    L.add(s.next());
	}
    }

    public WordSearch() {
	this(20,20);
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


    public boolean addWord(int row, int col, int deltaR, int deltaC,  String word) {
	if (deltaR < -1 || deltaR > 1 || deltaC < -1 || deltaC > 1 || 
	    (deltaR==0 && deltaC==0) )
	    return false;
	int r = row;
	int c = col;
	for (int i=0; i < word.length(); i++) {
		try {
		    if ( board[r][c] != '-' && board[r][c]!=word.charAt(i)) {
			return false;
		    }
		} catch (ArrayIndexOutOfBoundsException e) {
		    return false;
		}
		r = r + deltaR; 
		c = c+ deltaC;
	    }
	r = row;
	c = col;
	for (int i=0; i < word.length(); i++) {
	    board[r][c]=word.charAt(i);
	    r = r + deltaR; 
	    c = c+ deltaC;
	}
	return true;
    }
    
    public boolean addWordE (int row, int col, String word) {
	return addWord(row, col, 0, 1, word);
    }
=======
    private void create() {
	for (int n = 0; n < 10; n++) {
	    int i = r.nextInt(wordList.size());
	    int m = 0;
	    boolean x = addWordRandomLoc(wordList.get(i));
	    while (!x && m < 3){
	        m = m+1;
	    }
	    if (x)
		list.add(wordList.get(i));
	}
	wordboard = board;
	fillInBlanks();
    }

    public void fillInBlanks() {
        for (int x = 0; x < board.length; x++)
            for (int c=0;c<board[0].length;c++) {
                if (board[x][c]=='-'){
                    board[x][c]=(char)('A'+(char) r.nextInt('Z'-'A'));
		}
            }
    }
	    
	    
	
    private void readWords(String filename) {
        wordList = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNext()) {
                String s =sc.nextLine();
                wordList.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    public boolean addWordRandomLoc(String w) {
        int x = r.nextInt(board.length);
        int c = r.nextInt(board[0].length);
        int deltaR = r.nextInt(3)-1;
        int deltaC = r.nextInt(3)-1;

        return addWord(x,c,deltaR,deltaC,w);

    }


    public WordSearch() {
	this(20,20);
    }   	    
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c

    public boolean addWordS(int row, int col, String word) {
	return addWord(row, col, 1, 0, word);
    }
    
    public boolean addWordW (int row, int col, String word) {
	return addWord(row, col, 0, -1, word);
    }

    public boolean addWordN(int row, int col, String word) {
	return addWord (row, col, -1, 0, word);
    }

    public boolean addWordSE(int row, int col, String word) {
	return addWord (row, col, 1, 1, word);
    }

    public boolean addWordSW(int row, int col, String word) {
	return addWord(row, col, 1, -1, word);
    }

    public boolean addWordNE(int row, int col, String word) {
	return addWord(row, col, -1, 1, word);
    }

<<<<<<< HEAD
    public boolean addWordNW(int row, int col, String word) {
	return addWord (row, col, -1, -1, word);
    }
=======
    public boolean addWord(int row, int col, int deltaR, int deltaC,  String word) {
	if (deltaR < -1 || deltaR > 1 || deltaC < -1 || deltaC > 1 || 
	    (deltaR==0 && deltaC==0) )
	    return false;
	int r = row;
	int c = col;
	for (int i=0; i < word.length(); i++) {
		try {
		    if ( board[r][c] != '-' && board[r][c]!=word.charAt(i)) {
			return false;
		    }
		} catch (ArrayIndexOutOfBoundsException e) {
		    return false;
		}
		r = r + deltaR; 
		c = c+ deltaC;
	    }
	r = row;
	c = col;
	for (int i=0; i < word.length(); i++) {
	    board[r][c]=word.charAt(i);
	    r = r + deltaR; 
	    c = c+ deltaC;
	}
	return true;
    }
    
    public boolean addWordE (int row, int col, String word) {
	return addWord(row, col, 0, 1, word);
    }

    public boolean addWordS(int row, int col, String word) {
	return addWord(row, col, 1, 0, word);
    }
    
    public boolean addWordW (int row, int col, String word) {
	return addWord(row, col, 0, -1, word);
    }

    public boolean addWordN(int row, int col, String word) {
	return addWord (row, col, -1, 0, word);
    }

    public boolean addWordSE(int row, int col, String word) {
	return addWord (row, col, 1, 1, word);
    }

    public boolean addWordSW(int row, int col, String word) {
	return addWord(row, col, 1, -1, word);
    }

    public boolean addWordNE(int row, int col, String word) {
	return addWord(row, col, -1, 1, word);
    }

    public boolean addWordNW(int row, int col, String word) {
	return addWord (row, col, -1, -1, word);
    }
}
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c
