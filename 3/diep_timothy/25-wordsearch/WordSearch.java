import java.io.*;
import java.util.*;

public class WordSearch {
    private char[][] board;
    private ArrayList<String> wordList;
    Random r = new Random();


    public WordSearch(int rows, int cols) {
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

    private void loadWords(String filename) {
        wordList = new ArrayList<String>();

        try {
            Scanner sc = new Scanner(new File(wordlist));
            while (sc.hasNext()) {
                String s = sc.next();
                wordList.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't open wordlist - exiting");
            System.exit(0);
        }
    }

    public String toString() {
	String s = "";
	for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[i].length;j++) {
		s = s + board[i][j];
            }
            s = s + "\n";
        }
        return s;
    }

    public boolean addWord(int row, int col, int deltaR, int deltaC, String word) {
	int r = row;
	int c = col;
	if (deltaR < -1 || deltaR > 1 || deltaC < -1 || deltaC > 1 || (deltaR == 0 && deltaC == 0))
            return false;
	if (row > board.length || col > board[row].length || row < 0 || col < 0)
	    return false;
	
	for (int i=0;i<word.length();i++) {
            try {
                if (board[r][c] != '-' && board[r][c] != word.charAt(i))
                    return false;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Got ArrayIndex thing: " + e);
                return false;
            }
            r = r + deltaR;
            c = c + deltaC;
        }

	r = row;
        c = col;
        for (int i=0;i<word.length();i++) {
            board[r][c]=word.charAt(i);
            r = r + deltaR;
            c = c + deltaC;
        }

        return true;
    }

    public boolean addWordRand(String word){
	int deltaR  = r.nextInt(2)-1;
	

    }

    public boolean addWordH(int row, int col, String word) {
        return addWord(row, col, 0, 1, word);
    }

    public boolean addWordV(int row, int col, String word) {
	return addWord(row, col, 1, 0, word);
    }

    public boolean addWordHb(int row, int col, String word) {
	return addWord(row, col, 0, -1, word);
    }

    public boolean addWordVb(int row, int col, String word) {
	return addWord(row, col, -1, 0, word);
    }

    public boolean addWordHV(int row, int col, String word) {
        return addWord(row, col, 1, 1, word);       
    }

    public boolean addWordHbV(int row, int col, String word) {
	return addWord(row, col, 1, -1, word);
    }
	
    public boolean addWordHVb(int row, int col, String word) {
	return addWord(row, col, -1, 1, word);
    }

    public boolean addWordHbVb(int row, int col, String word) {
	return addWord(row, col, -1, -1, word);
    }

    public void fill() {
	for (int i=0; i<board.length;i++) {
	    for (int j=0; j<board[0].length; j++) { 
		if (board[i][j] == '-')
		    board[i][j] = (char)(r.nextInt(26) + 'a');
	    }
	}
    }
}

