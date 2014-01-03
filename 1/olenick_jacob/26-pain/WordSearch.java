import java.util.*;

public class WordSearch {

    private char[][] board;
    private int rows, cols;
    private Random r;
    private ArrayList wordList;
    public ArrayList words;

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
    
    public void autoWords(int words){
	int i = 0;
	int length = 0;
	words = new ArrayList<String>()
	while (i < words && i < wordList.size()){
	    int a = r.nextInt(4); // 0 NE, 1 E, 2 SE, 3 S
	    int row = r.nextInt(rows);
	    int col = r.nextInt(cols);
	    for (int n = 0; n<i; n++){
		//this retries proportional to how many words you've added
		if (a == 0){
		    if (insertNE(row,col,wordList.get(i))){
			this.words.add(wordList.get(i));
			wordList.remove(i);
			break;
		    }
		}
		else if (a == 1){
		    if (insertE(row,col,wordList.get(i))){
			this.words.add(wordList.get(i));
			wordList.remove(i);
			break;
		    }
		}
		else if (a == 2){
		    if (insertSE(row,col,wordList.get(i))){
			this.words.add(wordList.get(i));
			wordList.remove(i);
			break;
		    }
		}
		else if (a == 3){
		    if (insertNE(row,col,wordList.get(i))){
			this.words.add(wordList.get(i));
			wordList.remove(i);
			break;
		    }
		}		
	    }
	    i += 1
	}
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
