import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;
    private Random rand;
    private ArrayList<String> wordList;

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

    public boolean addWord(int row, int col, int deltaR,int deltaC,String word,boolean re) {
        if (re==true){
	    String temp = "";
	    for (int i = 0; i<word.length(); i++){
		temp = word.charAt(i)+temp;
	    }
	    word = temp;
	}
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
	boolean re;
        int r = rand.nextInt(board.length);
        int c = rand.nextInt(board[0].length);
        int deltaR = rand.nextInt(3)-1;
        int deltaC = rand.nextInt(3)-1;
	int rev = rand.nextInt(2);
	if (rev == 1)
	    re = false; 
	else 
	    re = true;
        return addWord(r,c,deltaR,deltaC,w,re);
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

    public void makeWordSearch(){
	ArrayList<String> words = new ArrayList<String>();
	ArrayList<String> wordlist = wordList;
	for (int i = 0;i<wordlist.length();i++){
	    boolean result=addWordRand(wordlist.get(i));
	    if (result){
		words.add(wordlist.get(i));
		wordlist.remove(wordlist.get(i));
	    }
	    else{
		for (int j=0;j<10;j++){
		    boolean retry = addWordRand(wordlist.get(i));
		    if (retry){
			words.add(wordlist.get(i));
			wordlist.remove(wordlist.get(i));
			break;
		    }
		    wordlist.remove(wordlist.get(i));
		}
	    }
	}
	System.out.println(board);
	this.fillBlanks();
	System.out.println(board);
	System.out.println(words);
    }

}
