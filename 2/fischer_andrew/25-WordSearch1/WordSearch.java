import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;
    private Random rand;
    private ArrayList<String> wordList;

    protected void loadWords(String filename) {
	wordList = new ArrayList<String>();
	try {
	    File f = new File(filename);
	    Scanner sc = new Scanner(f);
	    while (sc.hasNext()) {
		String s =sc.nextLine();
		wordList.add(s);
	    }
	} catch (FileNotFoundException e) {
	    System.out.println(e);
	    System.exit(0);
	}
    }

    public WordSearch(int rows, int cols) {
	rand = new Random();
	loadWords("wordlist");
	System.out.println(wordList);
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
	    }
	}

    }

    public WordSearch() {
	this(40,30);
    }
    

    private boolean addWord(int row, int col, int deltaR,int deltaC,String word) {
	int r,c;

	if (deltaR<-1||deltaR>1||deltaC<-1||deltaC>1||
	    (deltaR==0&&deltaC==0))
	    return false;

	// see if we can add the word
	r = row;
	c = col;
	for (int i=0;i<word.length();i++) {
	    try {
		if (board[r][c]!='-' && board[r][c]!=word.charAt(i)) {
		    return false;
		}
	    } catch (ArrayIndexOutOfBoundsException e) {
		return false; // return false since we can't add the word - we're out of bounds
	    }
	    r=r+deltaR;
	    c=c+deltaC;
	}
	r=row;
	c=col;
	for (int i=0;i<word.length();i++) {
	    board[r][c]=word.charAt(i);
	    r=r+deltaR;
	    c=c+deltaC;
	}
	return true;
    }
    
    public boolean addWordRand(String w) {
	int r = rand.nextInt(board.length);
	int c = rand.nextInt(board[0].length);
	int deltaR = rand.nextInt(3)-1;
	int deltaC = rand.nextInt(3)-1;
	if (addWord(r,c,deltaR,deltaC,w) == true) {
	    wordList.add(w);
	    return addWord(r,c,deltaR,deltaC,w);	
	}
	else {return false;}
    }
    
    public void fillBlanks() {
	for (int r=0;r<board.length;r++) {
	    for (int c=0;c<board[0].length;c++) {
		if (board[r][c]=='-') {
		    board[r][c]=(char)('A'+rand.nextInt('Z'-'A'));
		}
	    }
	}
	
    }
    public boolean addWordH(int row, int col, String word) {
	return addWord(row,col,0,1,word);
    }
    public boolean addWordV(int row, int col, String word) {
	return addWord(row,col,1,0,word);
    }


<<<<<<< HEAD
<<<<<<< HEAD
    public String toString() {
	String s="";
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		s=s+board[i][j];
=======
=======

>>>>>>> c3bb70eaf8cc787b45db278904b82ad4774435e9
    public void fill(){
	String allChar = "abcdefghijklmnopqrstuvwxyz";
	Random x = new Random();
	
	for (int r=0;r<board.length; r++){
	    for (int c=0; c<board[0].length; c++){
		if (board[r][c] == "-".charAt(0)){
		    board[r][c] = allChar.charAt(x.nextInt(26));
		}
<<<<<<< HEAD
>>>>>>> 102f62e2395367dd85aa22a5f72d106331ea491c
=======
	    }
	}
    }

    public String toString() {
	String s="";
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		s=s+board[i][j];
>>>>>>> c3bb70eaf8cc787b45db278904b82ad4774435e9
	    }
	    s=s+"\n";
	}
	return s;
    }

}
