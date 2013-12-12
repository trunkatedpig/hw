// Partner: Aida

import java.util.*;
import java.io.*;
public class WordSearch {

    private char[][] board;
    private int rows, cols;
    private Random rand;
    private ArrayList<String> wordList, wordsInBoard;

    public WordSearch(int rows, int cols) {
        board = new char[rows][cols];
        this.rows = rows;
        this.cols = cols;
        for (int i=0;i<rows;i++)
	    for (int j=0;j<cols;j++)
                board[i][j]='-';
    }

    public WordSearch() {
        this(20,20);
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

    public boolean addWord(int row, int col, int deltaR, int deltaC, String word) {
        int len = word.length();
        int r = row;
        int c = col;
	word = word.toUpperCase();
        if (deltaR < -1 || deltaR > 1 || deltaC < -1 || deltaC > 1 || (deltaR== 0 && deltaC == 0)) {
	    return false;
        }
        for (int i = 0; i < len; i++) {
	    try {
                if (board[r][c]!='-' && board[r][c]!=word.charAt(i)) {
		    return false;
                }
	    } catch (ArrayIndexOutOfBoundsException e) {
                return false;
	    }
	    r = r + deltaR;
	    c = c + deltaC;
        }
        r = row;
        c = col;
        for (int i = 0; i < len; i++) {
	    board[r][c] = word.charAt(i);
	    r = r + deltaR;
	    c = c + deltaC;
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

    public void fillWords(int numWords) {
	int count = 0;
	while (count < numWords) {
	    int s = wordList.size();
	    String w = wordList.get(rand.nextInt(s - 1));
	    if (addWordRand(w)) {
		count = count + 1;
		wordList.remove(w);
		wordsInBoard.add(w);
	    }  
	}
    }

    /*
      public String reverseWord(String word) {
      String revWord = "";
      for (int i = 0; i < word.length(); i++){
      revWord = revWord + word.charAt(word.length() - 1 - i);
      }
      return revWord;
      }
      public boolean addWordH(int r, int c, String word) {
      return addWord(r,c,0,1,word);
      }

      public boolean addWordV(int r, int c, String word) {
      return addWord(r,c,1,0,word);
      }

      public boolean addWordAsc(int r, int c, String word) {
      return addWord(r,c,-1,1,word);
      }

      public boolean addWordDes(int r, int c, String word) {
      return addWord(r,c,1,1,word);
      }

      public boolean addRevH(int r, int c, String word) {
      word = reverseWord(word);
      return addWordH(r, c - word.length(), word);
      }
    
      public boolean addRevV(int r, int c, String word) {
      word = reverseWord(word);
      return addWordV(r - word.length(), c, word);
      }

      public boolean addRevDes (int r, int c, String word) {
      word = reverseWord(word);
      return addWordAsc(r - word.length(), c + word.length(), word);
      }

      public boolean addRevAsc(int r, int c, String word) {
      word = reverseWord(word);
      return addWordDes(r + word.length(), c + word.length(), word);
      }
    */

    public void fillSpaces() {
	Random r = new Random();
	for (int x = 0; x < rows; x ++) {
	    for (int y = 0; y < cols; y ++) {
                if (Character.toString(board[x][y]).equals("-")) {
		    board[x][y] = (char)(r.nextInt(26) + 65);
                }
	    }
	}
    }
}