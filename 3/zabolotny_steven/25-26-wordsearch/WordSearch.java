import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;
    private Random rand;
    private ArrayList<String> wordList;
    private ArrayList<String> words;

    public WordSearch(int rows, int cols) {
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

    public boolean addWord(int r,int c,int dir,String type,String word) {
	//r = row, c = column, dir = 1 (forwards or down) or -1 (backwards or up), type = h, v, ne, nw, se, sw (for type of word), word = word added.
	if (type.equals("h") || type.equals("horizontal")) {
	    if ((r > board.length) || ((c * dir) > board[0].length - (word.length() * dir)) || (r < 0 || c < 0))
		return false;
	    for (int i = 0;i < word.length();i++) {
		if ((board[r][c + (i * dir)] != (word.charAt(i))) && board[r][c + (i * dir)] != '-')
		    return false;
	    }
	    for (int i = 0;i < word.length();i++) {
		if (board[r][c + (i * dir)] == ('-'))
		    board[r][c + (i * dir)] = word.charAt(i);
	    }
	    return true;
	}
	else if (type.equals("v") || type.equals("vertical")) {
	    if (((r * dir) > board.length - (word.length() * dir)) || (c > board[0].length) || (r < 0 || c < 0))
		return false;
	    for (int i = 0;i < word.length();i++) {
		if ((board[r + (i * dir)][c] != (word.charAt(i))) && board[r + (i * dir)][c] != '-')
		    return false;
	    }
	    for (int i = 0;i < word.length();i++) {
		if (board[r + (i * dir)][c] == ('-'))
		    board[r + (i * dir)][c] = word.charAt(i);
	    }
	    return true;
	}
	else if (type.equals("ne") || type.equals("northeast") || type.equals("se") || type.equals("southeast")) {
	    if (((r * dir) > board.length - (word.length() * dir)) || (c > board[0].length - (word.length() * dir)) || (r < 0 || c < 0))
		return false;
	    for (int i = 0;i < word.length();i++) {
		if ((board[r + (i * dir)][c + (i * dir)] != (word.charAt(i))) && board[r + (i * dir)][c + (i * dir)] != '-')
		    return false;
	    }
	    for (int i = 0;i < word.length();i++) {
		if (board[r + (i * dir)][c + (i * dir)] == ('-'))
		    board[r + (i * dir)][c + (i * dir)] = word.charAt(i);
	    }
	    return true;
	}
	else if (type.equals("nw") || type.equals("northwest") || type.equals("sw") || type.equals("southwest")) {
	    if (((r * dir) > board.length - (word.length() * dir)) || (c > board[0].length + (word.length() * dir)) || (r < 0 || c < 0))
		return false;
	    for (int i = 0;i < word.length();i++) {
		if ((board[r + (i * dir)][c - (i * dir)] != (word.charAt(i))) && board[r + (i * dir)][c - (i * dir)] != '-')
		    return false;
	    }
	    for (int i = 0;i < word.length();i++) {
		if (board[r + (i * dir)][c - (i * dir)] == ('-'))
		    board[r + (i * dir)][c - (i * dir)] = word.charAt(i);
	    }
	    return true;
	}
	return true;
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
	    System.out.println("File not found.");
	    System.exit(0);
	}
    }

    public void add(String filename) {
	rand = new Random();
	words = new ArrayList<String>();
	loadWords(filename);
	for(int amt = rand.nextInt(wordList.size() - 5) + 5;amt > 0;amt--) {
	    int row = rand.nextInt(board.length);
	    int col = rand.nextInt(board[0].length);
	    int ichoice = rand.nextInt(wordList.size());
	    String choice = wordList.get(ichoice);
	    wordList.remove(ichoice);
	    int dir = rand.nextInt(2) - 1;
	    int itype = rand.nextInt(5);
	    String type = "";
	    if (itype == 0)
		type = "v";
	    else if (itype == 1)
		type = "h";
	    else if (itype == 2)
		type = "ne";
	    else
		type = "nw";
	    int attempt = 3;
	    boolean stop = false;
	    while (attempt > 0 && !stop) {
		stop = addWord(row,col,dir,type,choice);
		attempt = attempt - 1;
	    }
	    if (stop)
		words.add(choice);
	}
    }

    public void fill() {
	for (int r=0;r<board.length;r++) {
	    for (int c=0;c<board[0].length;c++) {
		if (board[r][c] == '-') {
		    board[r][c] = (char)('A' + rand.nextInt('Z' - 'A' + 1));
		}
	    }
	}
    }

    public ArrayList getWords() {
	return words;
    }
}
