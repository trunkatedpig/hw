import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;
    private Random rand;
    private ArrayList<String> wordList;
    private ArrayList<String> words;

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
    public void makePuzzle(String filename){
	loadWords(filename);
	words=new ArrayList<String>();
	int n=0;
	while (n<4){
	     for (int i=0;i<wordList.size();i++){
		if (addWordRand(wordList.get(0))){
		addWordRand(wordList.get(0));
		words.add(wordList.get(0));
	     
		}
	     }
	      for (int j=0;j<words.size();j++){
		for (int i=0;i<wordList.size();i++){
		    if (words.get(j)==wordList.get(i))
			wordList.remove(i);
		}
	      }
	      //for some reason program always adds one word twice, cant resolve
	    n=n+1;
	    }
	System.out.println(words);
    }

    public WordSearch(int rows, int cols) {
        rand = new Random();
        loadWords("wordslist");
        System.out.println(wordList);
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

<<<<<<< HEAD:2/azzara_veronika/25-WordSearch/WordSearch.java
    public void makeWordSearch(){
	ArrayList<String> words = new ArrayList<String>();
	ArrayList<String> wordlist = wordList;
	for (int i = 0;i<wordlist.size();i++){
	    boolean result=addWordRand(wordlist.get(i));
	    if (result){
		words.add(wordlist.get(i));
		wordlist.remove(wordlist.get(i));
	    }
	    else{
		boolean retry;
		for (int j=0;j<10;j++){
		    retry = addWordRand(wordlist.get(i));
		    if (retry){
			words.add(wordlist.get(i));
			wordlist.remove(wordlist.get(i));
			break;
		    }
		    wordlist.remove(wordlist.get(i));
		}
	    }
	}
	System.out.println(board.toString());
	this.fillBlanks();
	System.out.println(board.toString());
	System.out.println(words);
    }

=======
>>>>>>> 6f636829ff906d268ef5309cd02b68c18b473adb:2/ruby_emily/26-WordSearch2.0/WordSearch.java
}
