import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;
    private ArrayList<String> wordList = new ArrayList<String>();
    private ArrayList<String> wordBox = new ArrayList<String>();
    private Random rand = new Random();

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	loadWords ( "wordList" );
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
	return s + "\n" + wordBox;
    }

    public boolean addWord ( int row , int col , int deltaR , int deltaC , String word ) {
	if (deltaR<-1||deltaR>1||deltaC<-1||deltaC>1||
            (deltaR==0&&deltaC==0))
            return false;
	int r = row;
	int c = col;
	int index = 0;
	
	for ( int i = 0 ; i < word.length() ; i++ ) {
	    try {
		if ( board [ r ] [ c ] != '-' && board [ r ] [ c ] != word.charAt ( i ) )
		    return false;
	    } catch ( ArrayIndexOutOfBoundsException e ) {
		return false;
	    }
	    r = r + deltaR;
	    c = c + deltaC;
	}
	
	r = row;
	c = col;
	while ( index < word.length() ) {
	    board [ r ] [ c ] = word.charAt ( index );
	    r = r + deltaR;
	    c = c + deltaC;
	    index = index + 1;
	}
	return true;
    }

    public boolean addWordHR ( int row, int col , String word ) {
	return addWord ( row , col , 0 , 1 , word );
    }

    public boolean addWordVD ( int row, int col , String word ) {
	return addWord ( row , col , 1 , 0 , word );
    }

    public boolean addWordHL ( int row, int col , String word ) {
	return addWord ( row , col , 0 , -1 , word );
    }

    public boolean addWordVU ( int row, int col , String word ) {
	return addWord ( row , col , -1 , 0 , word );
    }

    public boolean addWordDDR ( int row, int col , String word ) {
	return addWord ( row , col , 1 , 1 , word );
    }

    public boolean addWordDDL ( int row, int col , String word ) {
	return addWord ( row , col , 1 , -1 , word );
    }

    public boolean addWordDUR ( int row, int col , String word ) {
	return addWord ( row , col , -1 , 1 , word );
    }

    public boolean addWordDUL ( int row, int col , String word ) {
	return addWord ( row , col , -1 , -1 , word );
    }

    public boolean addWordRand ( String w ) {
	int r = rand.nextInt(board.length);
        int c = rand.nextInt(board[0].length);
        int deltaR = rand.nextInt(3)-1;
        int deltaC = rand.nextInt(3)-1;
        return addWord(r,c,deltaR,deltaC,w);
    }

    public void loadWords ( String filename ) {
	try {
	    File f = new File ( filename );
	    Scanner sc = new Scanner ( f );
	    while ( sc.hasNext() )
		wordList.add ( sc.nextLine() );
	} catch ( FileNotFoundException e ) {
	    System.out.println ( e );
	    System.exit ( 0 );
	}
    }

    public void addWords() {
	int i = 0;
	int wordCount = 0;
	while ( i < wordList.size() ) {
	    int wordIndex = rand.nextInt ( wordList.size() );
	    String word = wordList.get ( wordIndex );
	    int j = 0;
	    int count = 0;
	    while ( j == 0 ) {
		if ( addWordRand ( word ) ) {
		    wordList.remove ( word );
		    wordBox.add ( word );
		    wordCount = wordCount + 1;
		    j = 1;
		}
		count = count + 1;
		if ( count == 6 ) {
		    wordList.remove ( word );
		    break;
		}
	    }
	    if ( wordCount >= 10 ) {
		j = 1;
		break;
	    }   
	}
    }

    public void fill() {
	String letters = "qwertyuiopasdfghjklzxcvbnm";
	for ( int r = 0 ; r < board.length ; r++ ) {
	    for ( int c = 0 ; c < board [ r ].length ; c++ ) {
		if ( board [ r ] [ c ] == '-' )
		    board [ r ] [ c ] = letters.charAt ( rand.nextInt ( 25 ) );
	    }
	}
    }

}
