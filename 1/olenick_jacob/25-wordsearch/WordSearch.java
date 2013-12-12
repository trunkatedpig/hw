import java.util.*;

public class WordSearch {

    private char[][] board;
    private int rows, cols;
    private Random r;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
	this.rows = rows;
	this.cols = cols;
    }

    public WordSearch() {
	this(20,20);
    }

   private void readWords(String filename) {
	wordList = new ArrayList<String>();
	try {
	    Scanner sc = new Scanner(new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		wordList.add(s);
	    }
	} catch (FileNotFoundException e) {
	    System.out.println(e);
	    System.exit(0);
	}
    }

    private boolean addWord(int row, int col, int deltaR, int deltaC,  String word) {
	int r = row;
	int c = col;
	for (int i=0; i<word.length(); i++) {
		try {
		    if (board[r][c]!='-' && board[r][c]!=word.charAt(i)) {
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

    public boolean insertN(int row, int col, String word){//insert North
	return AddWord(row,col,0,1,word);
    }    
    public boolean insertS(int row, int col, String word){//insert South
	return AddWord(row,col,0,-1,word);
    }   
    public boolean insertE(int row, int col, String word){//insert East
	return AddWord(row,col,1,0,word);
    }
    public boolean insertW(int row, int col, String word){//insert West
	return AddWord(row,col,-1,0,word)
    }

//diagonals:

    public boolean insertSE(int row, int col, String word){
	return AddWord(row,col,1,1,word);
    }
    public boolean insertSW(int row, int col, String word){
	return AddWord(row,col,1,-1,word);
    }
    public boolean insertNE(int row, int col, String word){
	return AddWord(row,col,1,1,word);
    }
    public boolean insertNW(int row, int col, String word){
	return AddWord(row,col,1,-1,word);
    }
    
    public void fillRest(){
	for (int i=0; i<rows; i++){
	    for (int j=0; j<cols; j++){
		if (board[i][j]=='-'){
		    board[i][j]=(char)((char)(r.nextInt(25)+97));
		}
	    }
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
