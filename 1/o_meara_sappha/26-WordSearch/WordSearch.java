import java.util.*;
import java.io.*;

public class WordSearch {

    private char[][] board;
    private Random rand;
    private ArrayList<String> wordList;
<<<<<<< HEAD
=======
    private ArrayList<String> words;

>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c

    private void readWords(String filename) {
        wordList = new ArrayList<String>();
        try {
<<<<<<< HEAD
         Scanner sc = new Scanner(new File(filename));
         while (sc.hasNext()) {
                String s =sc.nextLine();
                wordList.add(s);
         }
        } catch (FileNotFoundException e) {
         // if we can't open the file we
         // exit the program
         System.out.println(e);
         System.exit(0);
        }
    }

=======
	    Scanner sc = new Scanner(new File(filename));
	    while (sc.hasNext()) {
                String s =sc.nextLine();
                wordList.add(s);
	    }
        } catch (FileNotFoundException e) {
	    // if we can't open the file we
	    // exit the program
	    System.out.println(e);
	    System.exit(0);
        }
    }
    
    public void setWords(int numWords){
	words = new ArrayList<String>();
        for (int i = 0; i < numWords; i ++){
            int n = rand.nextInt(wordList.size());
            String s = wordList.get(n);
            boolean added = false;
            while(added == false){
                n = rand.nextInt(wordList.size());
                s = wordList.get(n);
                added = false;
                for (int j = 0; j < 30; j++){
                    if(addWordRandomLoc(s)){
                        words.add(s);
                        wordList.remove(n);
                        added = true;
                        break;
                    }
                }
            }
        }
    }
    
    public ArrayList getWords() {
	return words;
    }
    
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c
    public WordSearch(int rows, int cols) {
        rand = new Random();
        readWords("wordlist");
        System.out.println(wordList);
        board = new char[rows][cols];
<<<<<<< HEAD
        for (int i=0;i<rows;i++)
         for (int j=0;j<cols;j++)
=======
        for (int i = 0; i < rows; i ++)
	    for (int j = 0; j < cols; j ++)
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c
                board[i][j]='-';

    }

    public WordSearch() {
        this(20,20);
    }

<<<<<<< HEAD
public boolean addWord(int row, int col, int deltaR, int deltaC, String word) {

        /* make sure deltas are in range */
        if (deltaR < -1 || deltaR > 1 || deltaC < -1 || deltaC > 1 ||
         (deltaR==0 && deltaC==0) )
         return false;
=======
    public boolean addWord(int row, int col, int deltaR, int deltaC, String word) {
	
        /* make sure deltas are in range */
        if (deltaR < -1 || deltaR > 1 || deltaC < -1 || deltaC > 1 ||
	    (deltaR==0 && deltaC==0) )
	    return false;
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c

        /* see if we can place the word */
        int r = row;
        int c = col;
        for (int i=0; i < word.length(); i++) {
<<<<<<< HEAD
                try {
                 //j=10/i; <-- this is only to show the Arithmetic exception
                 if ( board[r][c] != '-' && board[r][c]!=word.charAt(i)) {
                        return false; // we return false since we can't add the word
                 }
                } catch (ArrayIndexOutOfBoundsException e) { // Handle the array one
                 return false; // we return false since we can't add the word
                }
                r = r + deltaR;
                c = c+ deltaC;
         }
=======
	    try {
		//j=10/i; <-- this is only to show the Arithmetic exception
		if ( board[r][c] != '-' && board[r][c]!=word.charAt(i)) {
		    return false; // we return false since we can't add the word
		}
	    } catch (ArrayIndexOutOfBoundsException e) { // Handle the array one
		return false; // we return false since we can't add the word
	    }
	    r = r + deltaR;
	    c = c+ deltaC;
	}
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c
            
        /* if we get here, we can add the word */
        r = row;
        c = col;
        for (int i=0; i < word.length(); i++) {
<<<<<<< HEAD
         board[r][c]=word.charAt(i);
         r = r + deltaR;
         c = c+ deltaC;
=======
	    board[r][c]=word.charAt(i);
	    r = r + deltaR;
	    c = c+ deltaC;
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c
        }
            
        
        return true;
    }

    public boolean addWordH(int r, int c, String w) {
        return addWord(r,c,0,-1,w);
    }
    public boolean addWordV(int r, int c, String w) {
        return addWord(r,c,1,0,w);
    }
    public boolean addWordD(int r, int c, String w) {
        return addWord(r,c,1,1,w);
    }
    public boolean addWordRandomLoc(String w) {
        int r = rand.nextInt(board.length);
        int c = rand.nextInt(board[0].length);
        int deltaR = rand.nextInt(3)-1;
        int deltaC = rand.nextInt(3)-1;

        return addWord(r,c,deltaR,deltaC,w);

    }

    public void fillInBlanks() {
        for (int r = 0; r < board.length; r++)
<<<<<<< HEAD
         for (int c=0;c<board[0].length;c++) {
                if (board[r][c]=='-')
                 board[r][c]=(char)('A'+(char)rand.nextInt('Z'-'A'));
         }
    }

    public void puzzle(String filename) {

	    
	}
=======
	    for (int c=0;c<board[0].length;c++) {
                if (board[r][c]=='-')
		    board[r][c]=(char)('A'+(char)rand.nextInt('Z'-'A'));
	    }
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c
    }
    
    public String toString() {
        String s = "";
<<<<<<< HEAD
        for (int i=0;i<board.length;i++) {
         for (int j=0;j<board[i].length;j++) {
                s=s+board[i][j];
         }
         s=s+"\n";
=======
        for (int i = 0; i < board.length; i ++) {
	    for (int j = 0; j < board[i].length; j ++) {
                s = s + board[i][j];
	    }
	    s = s + "\n";
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c
        }
        return s;
    }

<<<<<<< HEAD

}
=======
}
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c
