import java.io.*;
import java.util.*;

public class Search {
    private char[][] board;
    private int myrows,mycols;
    private Random rand;
    private ArrayList<String> wordList;
    private ArrayList<String> wordsadded;

    public void loadWords(String filename) {
        wordList = new ArrayList<String>();
        try {
	    Scanner sc = new Scanner(new File(filename));
	    while (sc.hasNext()) {
                String s = sc.next();
                wordList.add(s);
	    }
        } catch (FileNotFoundException e) {
	    System.out.println("Can't open wordlist - exiting");
	    System.exit(0);
        }
    }

    public void fillSpaces() {
	rand = new Random();
        for (int r=0;r<board.length;r++) {
	    for (int c=0;c<board[0].length;c++) {
                if (board[r][c]=='-') {
		    board[r][c]=(char)('A' + rand.nextInt('Z' - 'A' + 1));
		    //board[r][c]=(char)('A'+rand.nextInt('Z'-'A'+1));
                }
	    }
        }
    }

    public Search(int rows, int cols) {
        board = new char[rows][cols];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                board[i][j]='-';
            }
        }
        this.myrows = rows;
        this.mycols = cols;
    }

    public Search() {
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

    public boolean WordH(int rows, int cols, String word){
        if (myrows<rows || rows<0 || mycols<cols+word.length() || cols<0) {
            return false;
        }
        for (int i=0;i<word.length();i++) {
            if (board[rows][cols+i] != word.charAt(i) && board[rows][cols+i] != '-') {
                return false;
            }
        }
        for (int i=0;i<word.length();i++) {
            board[rows][cols+i] = word.charAt(i);
        }
        return true;
    }

    public boolean WordV(int rows, int cols, String word){
        if (myrows<rows+word.length() || rows<0 || mycols<cols || cols<0) {
            return false;
        }
        for (int i=0;i<word.length();i++) {
            if (board[rows+i][cols] != word.charAt(i) && board[rows+i][cols] != '-') {
                return false;
            }
        }
        for (int i=0;i<word.length();i++) {
            board[rows+i][cols] = word.charAt(i);
        }
        return true;
    }

    //These functions will write backwards starting with first letter                                                                                                                  
    //of word on the spot given, ie: will write it going to the left                                                                                                                   
    //or upwards of spot given under these conditions.                                                                                                                                 

    public boolean WordHB(int rows, int cols, String word){
        if (myrows<rows || rows<0 || mycols<cols || cols-word.length()<0) {
            return false;
        }
        for (int i=word.length();i>0;i--) {
            if (board[rows][cols-(i-1)] != word.charAt(i-1)
                && board[rows][cols-(i-1)] != '-') {
                return false;
            }
        }
        for (int i=word.length();i>0;i--) {
            board[rows][cols-(i-1)] = word.charAt(i-1);
        }
        return true;
    }

    public boolean WordVB(int rows, int cols, String word){
        if (myrows<rows || rows-word.length()<0 || mycols<cols || cols<0) {
            return false;
        }
        for (int i=word.length();i>0;i--) {
            if (board[rows-(i-1)][cols] != word.charAt(i-1)
                && board[rows-(i-1)][cols] != '-') {
                return false;
            }
        }
        for (int i=word.length();i>0;i--) {
            board[rows-(i-1)][cols] = word.charAt(i-1);
        }
        return true;
    }

    public boolean WordDUR(int rows, int cols, String word){
        if (myrows<rows || rows-word.length()<0 || mycols<cols+word.length() || cols<0) {
            return false;
        }
        for (int i=0;i<word.length();i++) {
            if (board[rows-i][cols+i] != word.charAt(i) && board[rows-i][cols+i] != '-') {
                return false;
            }
        }
        for (int i=0;i<word.length();i++) {
            board[rows-i][cols+i] = word.charAt(i);
        }
        return true;
    }

    public boolean WordDDR(int rows, int cols, String word){
        if (myrows<rows+word.length() || rows<0 || mycols<cols+word.length() || cols<0) {
            return false;
        }
        for (int i=0;i<word.length();i++) {
            if (board[rows+i][cols+i] != word.charAt(i) && board[rows+i][cols+i] != '-') {
                return false;
            }
        }
        for (int i=0;i<word.length();i++) {
            board[rows+i][cols+i] = word.charAt(i);
        }
        return true;
    }

    public boolean WordDUL(int rows, int cols, String word){
        if (myrows<rows || rows-word.length()<0 || mycols<cols || cols-word.length()<0) {
            return false;
        }
        int j = 0;
        int k = 0;
        for (int i=0;i<word.length();i++) {
            if (board[rows-j][cols-i] != word.charAt(i)
                && board[rows-j][cols-i] != '-') {
                return false;
            }
            j++;
        }
        for (int i=0;i<word.length();i++) {
            board[rows-k][cols-i] = word.charAt(i);
            k++;
        }
        return true;
    }

    public boolean WordDDL(int rows, int cols, String word){
        if (myrows<rows+word.length() || rows<0 || mycols<cols || cols-word.length()<0) {
            return false;
        }
        int j = 0;
        int k = 0;
        for (int i=0;i<word.length();i++) {
            if (board[rows+j][cols-i] != word.charAt(i)
                && board[rows+j][cols-i] != '-') {
                return false;
            }
            j++;
        }
        for (int i=0;i<word.length();i++) {
            board[rows+k][cols-i] = word.charAt(i);
            k++;
        }
        return true;
    }
    
    public void add(int amt, String filename){
	loadWords(filename);
	rand = new Random();
	int a = rand.nextInt(wordList.size());
	int randrow = 0;
	int randcol = 0;
	int random = 0;
	int count = 0;
	boolean added = true;
	wordsadded = new ArrayList<String>();
	for (;amt>0;amt--) {
	    random = rand.nextInt(8);
	    a = rand.nextInt(wordList.size());
	    if (random == 0) {
		while (WordH(randrow, randcol, wordList.get(a)) == false) {
		    if (count == 4) { 
			count = 0;
			amt ++;
			added = false;
			break;
		    }
		    count ++;
		    randrow = (rand.nextInt(myrows));
		    randcol = (rand.nextInt(mycols));
		}
		if (added == true) { 
		    wordsadded.add(wordList.get(a));
		    wordList.remove(a);
		} else { 
		    added = true;
		}
	    }
	    else if (random == 1) {
		while (WordV(randrow, randcol, wordList.get(a)) == false) {
		    if (count == 4) { 
			count = 0;
			amt ++;
			added = false;
			break;
		    }
		    count ++;
		    randrow = (rand.nextInt(myrows));
		    randcol = (rand.nextInt(mycols));
		}
		if (added == true) { 
		    wordsadded.add(wordList.get(a));
		    wordList.remove(a);
		} else { 
		    added = true;
		}
	    }
	    else if (random == 2) {
		while (WordHB(randrow, randcol, wordList.get(a)) == false) {
		    if (count == 4) { 
			count = 0;
			amt ++;
			added = false;
			break;
		    }
		    count ++;
		    randrow = (rand.nextInt(myrows));
		    randcol = (rand.nextInt(mycols));
		}
		if (added == true) { 
		    wordsadded.add(wordList.get(a));
		    wordList.remove(a);
		} else { 
		    added = true;
		}
	    }
	    else if (random == 3) {
		while (WordVB(randrow, randcol, wordList.get(a)) == false) {
		    if (count == 4) { 
			count = 0;
			amt ++;
			added = false;
			break;
		    }
		    count ++;
		    randrow = (rand.nextInt(myrows));
		    randcol = (rand.nextInt(mycols));
		}
		if (added == true) { 
		    wordsadded.add(wordList.get(a));
		    wordList.remove(a);
		} else { 
		    added = true;
		}
	    }
	    else if (random == 4) {
		while (WordDUR(randrow, randcol, wordList.get(a)) == false) {
		    if (count == 4) { 
			count = 0;
			amt ++;
			added = false;
			break;
		    }
		    count ++;
		    randrow = (rand.nextInt(myrows));
		    randcol = (rand.nextInt(mycols));
		}
		if (added == true) { 
		    wordsadded.add(wordList.get(a));
		    wordList.remove(a);
		} else { 
		    added = true;
		}
	    }
	    else if (random == 5) {
		while (WordDUL(randrow, randcol, wordList.get(a)) == false) {
		    if (count == 4) { 
			count = 0;
			amt ++;
			added = false;
			break;
		    }
		    count ++;
		    randrow = (rand.nextInt(myrows));
		    randcol = (rand.nextInt(mycols));
		}
		if (added == true) { 
		    wordsadded.add(wordList.get(a));
		    wordList.remove(a);
		} else { 
		    added = true;
		}
	    }
	    else if (random == 6) {
		while (WordDDR(randrow, randcol, wordList.get(a)) == false) {
		    if (count == 4) { 
			count = 0;
			amt ++;
			added = false;
			break;
		    }
		    count ++;
		    randrow = (rand.nextInt(myrows));
		    randcol = (rand.nextInt(mycols));
		}
		if (added == true) { 
		    wordsadded.add(wordList.get(a));
		    wordList.remove(a);
		} else { 
		    added = true;
		}
	    }
	    else if (random == 7) {
		while (WordDDL(randrow, randcol, wordList.get(a)) == false) {
		    if (count == 4) { 
			count = 0;
			amt ++;
			added = false;
			break;
		    }
		    count ++;
		    randrow = (rand.nextInt(myrows));
		    randcol = (rand.nextInt(mycols));
		}
		if (added == true) { 
		    wordsadded.add(wordList.get(a));
		    wordList.remove(a);
		} else { 
		    added = true;
		}
	    }
	}
	//fillSpaces();
    }
    public ArrayList getAL(){
	return wordsadded;
    }
}
