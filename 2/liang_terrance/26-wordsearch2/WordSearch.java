import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;
    private Random rand;
    private ArrayList<String> wordList;
    private ArrayList<String> addedWords;

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
	addedWords = new ArrayList<String>();
	loadWords("wordlist");
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


    private boolean addWord(int row, int col, int deltaR,int deltaC,String word) {
	int r,c;
	if (deltaR<-1||deltaR>1||deltaC<-1||deltaC>1||(deltaR==0&&deltaC==0)){
	    return false;
	}
	r = row;
	c = col;
	for (int i=0;i<word.length();i++) {
	    try {
		if (board[r][c]!='-' && board[r][c]!=word.charAt(i)) {
		    return false;
		}
	    } catch (ArrayIndexOutOfBoundsException e) {
		return false;
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
    
    public void fillWords(){
	int i = 0;
	while (i < 10){
	    if (addWordRand()){
		i ++;
	    }
	}
	System.out.println (addedWords);
    }

    public boolean addWordRand() {
	String w = wordList.get(rand.nextInt(wordList.size()));
	int r = rand.nextInt(board.length);
	int c = rand.nextInt(board[0].length);
	int deltaR = rand.nextInt(3)-1;
	int deltaC = rand.nextInt(3)-1;
	if (addWord(r,c,deltaR,deltaC,w) == true) {
	    addedWords.add(w);
	    return true;	
	}
	else {return false;}
    }
    
    public void fillBlanks() {
	for (int r=0;r<board.length;r++) {
	    for (int c=0;c<board[0].length;c++) {
		if (board[r][c]=='-') {
		    board[r][c]=(char)('a'+rand.nextInt('z'-'a'));
		}
	    }
	}
	
    }

    public void fill(){
	String allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //this is temporary to make the added words easily recognized
	Random x = new Random();
	
	for (int r=0;r<board.length; r++){
	    for (int c=0; c<board[0].length; c++){
		if (board[r][c] == "-".charAt(0)){
		    board[r][c] = allChar.charAt(x.nextInt(26));
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
