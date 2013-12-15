import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;
    private Random rand;
    private ArrayList<String> wordList;
    
    public WordSearch(int rows, int cols) {
	rand = new Random();
	loadWords("wordlist.txt");
	System.out.println(wordList+"\n");
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
	    }
	}
	for (int i=0;i<wordList.size();i++)
	    addWordRand(wordList.get(i));
	System.out.println(toString());
	fillBlanks();
	System.out.println(toString());
    }

    public WordSearch() {
	this(20,20);
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
    
    public boolean addWordH(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();

	if (row<0 || col<0 || row>rowmax)
	    return false;
	if (colmax<wmax+col)
	    return false;

	for (int ww=0;ww<wmax;ww++){
	    int colf=col+ww;
	    char w=board[row][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}

	for (int ww=0;ww<wmax;ww++){
	    int colf=col+ww;
	    board[row][colf]=word.charAt(ww);
	}
	return true;
    }

    public boolean addWordHB(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();

	if (row<0 || col>colmax || row>rowmax)
	    return false;
	if (-1>col-wmax)
	    return false;

	for (int ww=0;ww<wmax;ww++){
	    int colf=col-ww;
	    char w=board[row][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}

	for (int ww=0;ww<wmax;ww++){
	    int colf=col-ww;
	    board[row][colf]=word.charAt(ww);
	}
	return true;
    }

    public boolean addWordVB(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();

	if (row<0 || col<0 || col>colmax)
	    return false;
	if (-1>row-wmax)
	    return false;

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    char w=board[rowf][col];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    board[rowf][col]=word.charAt(ww);
	}
	return true;
    }

 public boolean addWordV(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();

	if (row<0 || col<0 || col>colmax)
	    return false;
	if (rowmax<wmax+row)
	    return false;

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    char w=board[rowf][col];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    board[rowf][col]=word.charAt(ww);
	}
	return true;
    }

public boolean addWordDBR(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();

	if (row<0 || col<0)
	    return false;
	if (rowmax<wmax+row || colmax<wmax+col)
	    return false;

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    int colf=col+ww;

	    char w=board[rowf][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}

	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    int colf=col+ww;
	    board[rowf][colf]=word.charAt(ww);
	}
	return true;
    }
    
    public boolean addWordDBL(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();
	
	if (row<0 || col<0)
	    return false;
	if (rowmax<wmax+row || -1>col-wmax)
	    return false;
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    int colf=col-ww;
	    
	    char w=board[rowf][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row+ww;
	    int colf=col-ww;
	    board[rowf][colf]=word.charAt(ww);
	}
	return true;
    }

    public boolean addWordDTL(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();
	
	if (row<0 || col<0)
	    return false;
	if (-1>row-wmax || -1>col-wmax)
	    return false;
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    int colf=col-ww;
	    
	    char w=board[rowf][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    int colf=col-ww;
	    board[rowf][colf]=word.charAt(ww);
	}
	return true;
    }

public boolean addWordDTR(int row, int col, String word){
	int rowmax=board.length;
	int colmax=board[0].length;
	int wmax=word.length();
	
	if (row<0 || col<0)
	    return false;
	if (-1>row-wmax || colmax<col+wmax)
	    return false;
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    int colf=col+ww;
	    
	    char w=board[rowf][colf];
	    if (w!=('-') && w!=(word.charAt(ww)))
		return false;
	}
	
	for (int ww=0;ww<wmax;ww++){
	    int rowf=row-ww;
	    int colf=col+ww;
	    board[rowf][colf]=word.charAt(ww);
	}
	return true;
    }

    public void fillBlanks(){
	int rowmax=board.length;
	int colmax=board[0].length;

	String al="abcdefghijklmnopqrstuvwxyz";
	Random r=new Random();
	
	for (int i=0;i<rowmax;i++){
	    for (int j=0;j<colmax;j++){
		if (board[i][j]=='-'){
			int rr=r.nextInt(26);
			char rrr=al.charAt(rr);
			board[i][j]=rrr;}
	    }
	}
    }
}
