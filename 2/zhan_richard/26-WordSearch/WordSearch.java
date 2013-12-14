import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;
    private Random rand;
    private ArrayList<String> wordList;
    private ArrayList<String> wordBank = new ArrayList<String>();
    private void loadWords(String filename) {
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
	//System.out.println(wordList);
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

    public boolean addWord(int row, int col, int deltaR,int deltaC,String word) {
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
	return addWord(r,c,deltaR,deltaC,w);
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

    public void fillWords(){
	
	int r;
	int n = 0;
	int try10times = 0;
	boolean added = true;
	while (n <10){
	    r= (int)(Math.random()*wordList.size()-1);
	    while(!(addWordRand(wordList.get(r).toUpperCase()))){
		if (try10times >= 10){
		    added = false;
		    break;
		}
		try10times++;
	    }
	    if (added = true){
		wordBank.add(wordList.get(r).toUpperCase());
		wordList.remove(r);
	    }
	    added=true;
	    try10times=0;
	    n++;
	}
        System.out.println(toString());
	fillBlanks();
	System.out.println(toString());
	System.out.println(wordBank);
	

	
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
