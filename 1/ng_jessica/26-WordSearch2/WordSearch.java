import java.util.*;
import java.io.*;

//* will overwrite words; tired to fix right now.....

public class WordSearch {
    private char[][] board;
    private Random rand;
    private ArrayList<String> wordList;
    private ArrayList<String> words = new ArrayList<String>();
    
    private void loadWords(String filename) {
	wordList = new ArrayList<String>();

	try {
	    Scanner sc = new Scanner(new File(filename));
	    while (sc.hasNext()) {
		String s = sc.next();
		wordList.add(s);
	    }
	} catch (FileNotFoundException e) {
	    System.out.println("Can't open words - exiting");
	    System.exit(0);
	}
    }

    public WordSearch(int rows, int cols) {
	rand = new Random();
	loadWords("words");
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

    public boolean addWord(int row, int col, int drow, int dcol, String word) {
	/*
	System.out.println(row);
	System.out.println(col);
	System.out.println(drow);
	System.out.println(dcol);
	System.out.println(word);
	*/
	for (int i=0;i<word.length();i++) {
	    try {
		if (board[row+(i*drow)][col+(i*dcol)]!='-' && 
		    board[row+(i*drow)][col+(i*dcol)]!=word.charAt(i)) { 
		    return false;
		}
	    } catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Got ArrayIndex thing: "+e);
		return false;
	    } catch (ArithmeticException e) {
		System.out.println("Got the math thing: "+e);
		return false;
	    } catch (Exception e) {
		System.out.println("Last case, generic exception: "+e);
		return false;
	    }
	}
	for (int i=0;i<word.length();i++) {
	    board[row+(i*drow)][col+(i*dcol)]=word.charAt(i);
	}
	return true;
    }

    public void fillSpaces() {
	for (int r=0;r<board.length;r++) {
	    for (int c=0;c<board[0].length;c++) {
		if (board[r][c]=='-') {
		    board[r][c]=(char)('a'+rand.nextInt('z'-'s'+1));
		}
	    }
	}
    }

    public String insertWord() {
	int n = rand.nextInt(wordList.size());
        String w = wordList.get(n);
	int dir = rand.nextInt(3)+1;
        int drow = (dir/2);
	int dcol = (dir%2);
	
	/* 
	   //allows words to be reversed
	   //commented out for being annoying
	   if (rand.nextInt(2)==0) {
	   w=new StringBuilder(w).reverse().toString();
	   }
	*/
	
	//possible area for first letter to be placed
	int[] pos;
	try {
	    pos = new int[(board.length-w.length())*
			  (board[0].length-w.length())];
	} catch (NegativeArraySizeException e) {
	    System.out.println(w+" is too long to fit.");
	    return w;
	}
	for (int i=0; i<pos.length; i++) {pos[i]=i;}
	//Fisher-Yates shuffle
	for (int i=pos.length-1; i>0; i--) {
	    int j=rand.nextInt(i);
	    int x=pos[j];
	    pos[j]=pos[i];
	    pos[i]=x;
	}

	for (int i=0; i<pos.length; i++) {
	    if (addWord(pos[i]/(board[0].length-w.length()),
			pos[i]%(board[0].length-w.length()),
			drow,dcol,w.toLowerCase())) {
		words.add(w);
		wordList.remove(n);
		return "";
	    }
	}

	return w;
    }

    public void fillWords(int n) {
	for (int i=0; i<n; i++) {
	    String w = insertWord();
	    if(w.length()>0) {
		System.out.println(w+" could not be added.");
	    }
	}
    }

    public ArrayList<String> getWords() {
	return words;
    }
    
    public String showWords() {
	String s="";
	for (int i=0;i<words.size();i++) {
	    System.out.println(words.get(i));
	}
	return s;
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
